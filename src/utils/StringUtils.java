package utils;

public class StringUtils {
//metody statyczne, metody pomocnicze
    //    metoda sprawdzi czy text ma ponizej 10 znaków, jezeli nie to wyciągnie pierwsze 7 znaków i doda 3 kropki
    public static String getFormattedText(String text) {
        if (text.length() < 10) {
            return text;
        } else {
            return text.substring(0, 7) + "...";
        }

    }
}
