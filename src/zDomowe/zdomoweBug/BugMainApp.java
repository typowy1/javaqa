package zDomowe.zdomoweBug;

import zDomowe.zdomoweBug.model.Bug;
import zDomowe.zdomoweBug.model.BugReporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BugMainApp {
    public static void main(String[] args) {

        BugReporter bugReporter = new BugReporter("Rafa", "Kowalski", "rafal@wp.pl");

//        Bug loginBug = new Bug("Can't login", bugReporter, 3);
//        loginBug.showAllInfo();
//        loginBug.showReportingPersonEmail();
//        loginBug.showBugStatus();
//        int loginBugPriority = loginBug.getBugPriority();
//        System.out.println("Login Bug Priority: " + loginBugPriority);
//        loginBug.setBugDescription("ff");
//        loginBug.setBugDescription("ffgggggggggggggggggg");
//        System.out.println(loginBug.getBugDescription());
//
//        bugReporter.setEmail("rafal1@wp.pl");
//        bugReporter.setEmail("ff@");
//        System.out.println(loginBug.getReportingPersonEmail());
//
//        loginBug.setBugPriority(6);
//        loginBug.setBugPriority(-1);
//        loginBug.setBugPriority(0);
//
//        loginBug.setBugPriority(1);
//        System.out.println(loginBug.getBugPriority());
//
//        loginBug.setBugPriority(5);
//        System.out.println(loginBug.getBugPriority());
//
//
//        loginBug.setBugStatus(true);
//        loginBug.showBugStatus();

        Bug emailBug = new Bug("Can't add email", bugReporter, 5);
//        emailBug.showAllInfo();
//        emailBug.showReportingPersonEmail();
//        emailBug.showBugStatus();
//        int emailBugPriority = emailBug.getBugPriority();
//        System.out.println("Email Bug Priority: " + emailBugPriority);
//        emailBug.notifyStatusChange(emailBug.isBugStatus());
//        bugReporter.setEmail("rafal1@wp.pl");
//        bugReporter.setEmail("ff");
//        System.out.println(bugReporter.getEmail());



//        emailBug.setBugStatus(true);
//        emailBug.showBugStatus();
//
//        emailBug.notifyStatusChange(emailBug.isBugStatus());

//        System.out.println(emailBug);
//        emailBug.setStatus(true);
//        System.out.println(emailBug);
//        System.out.println(emailBug.getReporter().getEmail());

// Zadanie domowe kolekcje
        Bug emailBug2 = new Bug("Bug 2", bugReporter, 5);
        Bug loginBug2 = new Bug("Bug 1", bugReporter, 3);
        Bug accesBug = new Bug("Bug 3", bugReporter, 4);
        Bug accesBug1 = new Bug("Bug 4", bugReporter, 4);
        Bug accesBug2 = new Bug("Bug 4", bugReporter, 4);



        List<Bug> bugs = new ArrayList<>();
        bugs.add(emailBug2);
        bugs.add(loginBug2);
        bugs.add(accesBug);
        bugs.add(accesBug1);
        bugs.add(accesBug2);

        System.out.println("list");
        for (Bug bug : bugs) {
            System.out.println(bug);
        }

        Set<Bug> sortedBugs = new TreeSet<>(bugs);

        System.out.println("sorted set");
        for (Bug bug : sortedBugs) {
            System.out.println(bug);
        }
    }
}
