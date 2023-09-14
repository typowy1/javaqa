package zDomowe.zdomowe2;

public class Bug {
//    pola obiektu:
//    opis błędu
//    adres email osoby zgłaszajacej błąd
//    priorytet błędu
//    status błędu

//    konstruktor

//    Metody
//    pokaż wszystkie informacje na temat błędu
//    pokaż osobę zgłaszającą błąd
//    zwróć priorytet błędu

    public Bug(String bugDescription, String reportingPersonEmail, String bugPriority, String bugStatus) {
        this.bugDescription = bugDescription;
        this.reportingPersonEmail = reportingPersonEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
    }

    String bugDescription;
    String reportingPersonEmail;
    String bugPriority;
    String bugStatus;

    void geAllInfo(){
        System.out.println(bugDescription + ", " + reportingPersonEmail + ", " + bugPriority + ", " + bugStatus);
    }

    void getReportingPersonEmail(){
        System.out.println("Reporting person: " + reportingPersonEmail);
    }

    String getBugPriority(){
        return bugPriority;
    }
}
