package zDomowe.zdomowe2;

public class BugMainApp {
    public static void main(String[] args) {

        Bug loginBug =  new Bug("Can't login", "rafal@wp.pl", "medium", "closed");
        loginBug.geAllInfo();
        loginBug.getReportingPersonEmail();
        loginBug.getBugPriority();

        Bug emailBug =  new Bug("Can't add email", "piotr@wp.pl", "blocker", "open");
        emailBug.geAllInfo();
        emailBug.getReportingPersonEmail();
        emailBug.getBugPriority();

    }
}
