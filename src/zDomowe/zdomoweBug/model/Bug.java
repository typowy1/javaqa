package zDomowe.zdomoweBug.model;

public class Bug {
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

    private String bugDescription;
    private String reportingPersonEmail;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String reportingPersonEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.reportingPersonEmail = reportingPersonEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("bugDescription can't be less than 10 chars"); //incorrect bug description
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getReportingPersonEmail() {
        return reportingPersonEmail;
    }

    public void setReportingPersonEmail(String reportingPersonEmail) {
        if (!reportingPersonEmail.contains("@")) {
            System.out.println("wrong email, email should contains @");
        } else {
            this.reportingPersonEmail = reportingPersonEmail;
        }
    }

    public void setBugPriority(int bugPriority) {
        if(bugPriority < 1 || bugPriority > 5){
            System.out.println("Wrong bugPriority: '" + bugPriority + "', you can chose from 1 to 5");
        }
        this.bugPriority = bugPriority;
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

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void showAllInfo() {
        System.out.println(bugDescription + ", " + reportingPersonEmail + ", " + bugPriority + ", " + bugStatus);
    }

    public void showReportingPersonEmail() {
        System.out.println("Reporting person: " + reportingPersonEmail);
    }

    public void showBugStatus() {
        if (bugStatus == false) {
            System.out.println("Bug status: Otwarty");
        } else {
            System.out.println("Bug status: Zamknięty");
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }
}
