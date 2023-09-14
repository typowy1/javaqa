package zDomowe.zdomowe2;

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

    String bugDescription;
    String reportingPersonEmail;
    int bugPriority;
    boolean bugStatus;

    public Bug(String bugDescription, String reportingPersonEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.reportingPersonEmail = reportingPersonEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }


    void showAllInfo(){
        System.out.println(bugDescription + ", " + reportingPersonEmail + ", " + bugPriority + ", " + bugStatus);
    }

    void showReportingPersonEmail(){
        System.out.println("Reporting person: " + reportingPersonEmail);
    }

    void showBugStatus(){
        if(bugStatus == false){
            System.out.println("Bug status: Otwarty");
        }else {
            System.out.println("Bug status: Zamknięty");
        }
    }

    int getBugPriority(){
        return bugPriority;
    }
}
