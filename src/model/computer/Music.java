package model.computer;

public interface Music {
// w interfejsie nie możemy mieć żadnych pól obiektu
//     tu będą tylko metody
//    można twożyć tylko stałe - final, każda stała domyślnie będzie publiczna, stała i finalna, wystarczy  void playMusic();
//    tylko metody amstrackcyjne i bedą one domyślnbie abstrakcyjne, wystarczy  void playMusic();

//    Interfejs- za pomocą interfejsu możemy rozszeżać zachowanie danej klasy

    String NAME = "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

//    od javy 8 możemy twozyć dowolne metody ale trzeba oznaczyć słówkiem default, że jest domyslna
//   metody domyślne
    default void sayHelloFrom() {
        System.out.println("Hello from default");
    }
//    publiczne metody statyczne
    static String getName (){
        return NAME;
    }
//prywatne statyczne metody
private static void  privateMethod(){
    System.out.println("hello from private method");
}

}
