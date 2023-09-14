package zDomowe.zdomowe2;

public class BugMainApp {
    public static void main(String[] args) {

        Bug loginBug =  new Bug("Can't login", "rafal@wp.pl", 3);
        loginBug.showAllInfo();
        loginBug.showReportingPersonEmail();
        loginBug.showBugStatus();
        int loginBugPriority = loginBug.getBugPriority();
        System.out.println("Login Bug Priority: " +  loginBugPriority);

        loginBug.bugStatus =  true;
        loginBug.showBugStatus();

        Bug emailBug =  new Bug("Can't add email", "piotr@wp.pl", 5);
        emailBug.showAllInfo();
        emailBug.showReportingPersonEmail();
        emailBug.showBugStatus();
        int  emailBugPriority = emailBug.getBugPriority();
        System.out.println("Email Bug Priority: " +  emailBugPriority);

        emailBug.bugStatus =  true;
        emailBug.showBugStatus();

    }
}
