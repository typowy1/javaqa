package zDomowe.zdomoweBug;

import zDomowe.zdomoweBug.model.Bug;

public class BugMainApp {
    public static void main(String[] args) {

        Bug loginBug = new Bug("Can't login", "rafal@wp.pl", 3);
        loginBug.showAllInfo();
        loginBug.showReportingPersonEmail();
        loginBug.showBugStatus();
        int loginBugPriority = loginBug.getBugPriority();
        System.out.println("Login Bug Priority: " + loginBugPriority);
        loginBug.setBugDescription("ff");
        loginBug.setBugDescription("ffgggggggggggggggggg");
        System.out.println(loginBug.getBugDescription());

        loginBug.setReportingPersonEmail("ff");
        loginBug.setReportingPersonEmail("ff@");
        System.out.println(loginBug.getReportingPersonEmail());

        loginBug.setBugPriority(6);
        loginBug.setBugPriority(-1);
        loginBug.setBugPriority(0);

        loginBug.setBugPriority(1);
        System.out.println(loginBug.getBugPriority());

        loginBug.setBugPriority(5);
        System.out.println(loginBug.getBugPriority());


        loginBug.setBugStatus(true);
        loginBug.showBugStatus();

        Bug emailBug = new Bug("Can't add email", "piotr@wp.pl", 5);
        emailBug.showAllInfo();
        emailBug.showReportingPersonEmail();
        emailBug.showBugStatus();
        int emailBugPriority = emailBug.getBugPriority();
        System.out.println("Email Bug Priority: " + emailBugPriority);

        emailBug.setBugStatus(true);
        emailBug.showBugStatus();

    }
}
