package wiedza.enums;

public enum WeekDays {

    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("Środa"),
    CZWARTEK("Czwartek"),
    PTATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
