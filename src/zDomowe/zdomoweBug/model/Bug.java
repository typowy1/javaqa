package zDomowe.zdomoweBug.model;

import java.util.Objects;

public class Bug  implements ConsoleNotification{
//    pola obiektu:
//    opis błędu
//    adres email osoby zgłaszajacej błąd
//    priorytet błędu 1-5
//    status błędu (otwarty/zamknięty) - domyślnie zawsze otwarty

//    konstruktor

//    Metody
//    pokaż wszystkie informacje na temat błędu
//    pokaż osobę zgłaszającą błąd
//    pokaż status błędu
//    zwróć priorytet błędu

    private String description;
    private BugReporter reporter;
    private int priority;
    private boolean status;

    public Bug(String description, BugReporter reporter, int priority) {
        this.description = description;
        this.reporter = reporter;
        this.priority = priority;
        this.status = false;
    }

    public BugReporter getReporter() {
        return reporter;
    }

    public void setReporter(BugReporter reporter) {
        this.reporter = reporter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("bugDescription can't be less than 10 chars"); //incorrect bug description
        } else {
            this.description = description;
        }
    }


    public void setPriority(int priority) {
        if(priority < 1 || priority > 5){
            System.out.println("Wrong bugPriority: '" + priority + "', you can chose from 1 to 5");
        }
        this.priority = priority;
    }
//można z switch
//    public void setBugPriority(int bugPriority) { // dla każdego przypadku robimy to samo wiec można zapisać jak poniżej
//        switch (bugPriority) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                this.bugPriority = bugPriority;
//                break;
//            default: {
//                System.out.println("incorrect bug priority range");
//            }
//        }
//
//    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        notifyStatusChange(status);
        this.status = status;
    }

    public void showAllInfo() {
        System.out.println(description + ", " + reporter + ", " + priority + ", " + status);
    }

    public void showReportingPersonEmail() {
        System.out.println("Reporting person: " + reporter);
    }

    public void showBugStatus() {
        if (status == false) {
            System.out.println("Bug status: Otwarty");
        } else {
            System.out.println("Bug status: Zamknięty");
        }
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + description + '\'' +
                ", bugReporter=" + reporter +
                ", bugPriority=" + priority +
                ", bugStatus=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priority == bug.priority && status == bug.status && Objects.equals(description, bug.description) && Objects.equals(reporter, bug.reporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, reporter, priority, status);
    }

    @Override
    public void notifyStatusChange(boolean bugStatus) {
        if (bugStatus == false) {
            System.out.println("Status zmieniono na: Otwarty");
        } else {
            System.out.println("Status zmieniono na: Zamknięty");
        }
    }
}
