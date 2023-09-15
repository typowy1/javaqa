package wiedza;

import java.util.Locale;

public class StringS {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

//        Metody na stringach

        System.out.println(str1.equals(str2));//porównanie
        System.out.println(str1.equalsIgnoreCase(str2));//porównanie ignoruje duże litery

        String s = str1.toUpperCase(); // zamienia na duże litery
        System.out.println(s);

        String s1 = str1.toLowerCase(); // na małe litery
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He"); //sprawdza na jakie znaki się zaczyna
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));//sprawdza na jakie znaki się kończy

        System.out.println(str1.contains("ll")); // czy zawiera text

        System.out.println("".isBlank()); // sprawdza czy text zawiera znaki, sprawdza długość stringa ignoruje spacje
        System.out.println("".isEmpty()); // sprawdza czy ext zawiera znaki, sprawdza długość stringa wliczając w to spacje

        String replace = str1.replace("llo", "QWE");// zamienia znaki na inne podane
        System.out.println(replace);

//         zamienia wszystkie znaki które występują w wyrazie na podany, wszystkie l zamieni na x
        String s2 = str1.replaceAll("l", "x");
        System.out.println(s2);

//        wyciąga jakiś ciąg znaków z stringa, liczymy od 0 i ostatni index nie jest brany pod uwagę
        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String textWithWhiteSpaces = "    to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length()); //zeróci ilość znaków razem z spacjami

        String strip = textWithWhiteSpaces.strip();//!!! usówa wszystkie spacje przed textem i za textem
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
