package wiedza;

public class TypyOpakowyjące {
//każdy typ prosty ma odpowiadającą sobie klase
    Byte b;
    Short s;
    Integer i;
    Long l;
    Float f;
    Double d;
    Character c;
    Boolean bl;

    //    auto boxing zamiana typu prostego na referencyjny
    Integer intNumber =  Integer.valueOf(10);
//    lub
Integer intNumber1 =  10; // zadzieje sie to samo

    //    auto unboxing zamiana typu referencyjnego na typ prosty
    int newNumber = intNumber.intValue();

}
