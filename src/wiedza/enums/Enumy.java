package wiedza.enums;

public class Enumy {
    public static void main(String[] args) {
        //ENUM - typ wyliczeniowy

        System.out.println(WeekDays.PONIEDZIALEK.getName());

        if("środa".equalsIgnoreCase(WeekDays.SRODA.getName())){
            System.out.println("Jest ok");
        } else {
            System.out.println("Nie jest ok");
        }
    }
}
