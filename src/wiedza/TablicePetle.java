package wiedza;

public class TablicePetle {
    public static void main(String[] args) {
//        tablice - zbiór danych tego samego typu
//        zawsze musimy określić rozmiar tablicy
//        indeksy zaczynaja sie od zera, ostatni element, długość tablicy -1
//        [] tablica
//        int [] numbers = new int[10]

        String[] names = new String[5];
//        wartości tablicy ["Bartek", "Marcin", "Asia", "Monika", "Tomek"]
//                               0          1        2        3        4

        names[0] = "Bartek";
        names[1] = "Marcin";
        names[2] = "Asia";
        names[3] = "Monika";
        names[4] = "Tomek";

//        for (licznik od którego zaczynamy: warunek np mniejszy od 5: zmiana licznika, np zwiekszamy o 1)

//        for może przejsc przez wszystkie elementy tablicy albo np co drugi element
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]); // wyświetli tylko indeksy pażyste, 0, 2, 4
            }
        }

//        foreach przechodzi przez wszystkie elementy tablicy
        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = new int[10];
        System.out.println("długość tablicy: " + numbers.length);

        int[] newNumbers = {1, 2, 3, 4, 5};

        String[] names1 = {"Bartek", "Marcin", "Asia", "Monika", "Tomek"};
        System.out.println(names1.length);

        for (String name : names1) {
            System.out.println(name.toUpperCase());
        }

        for (int i = 0; i < names1.length; i++) {
            System.out.println(names[i].toLowerCase());
        }

        int number = 10;
//        number = number + 1;
//        System.out.println(number);

//        number += 1;
        //        System.out.println(number);

//        post increment - zwiekszanie wartości o jeden po użyciu zmiennej
//        System.out.println(number++);
//        System.out.println(number);

//        pre increment - zwiekszanie wartości o jeden przed użyciu zmiennej
//        System.out.println(++number);


//        Pętla while, do while

//        while - do póki jakiś warunek zostanie spełniony dopóty ta petla będzie sie wykonywac

        int i = 10;

        while (i < 20) {
            System.out.println(i); // nieskończona pętla
        }

        while (i < 20) {
            System.out.println(i);
            i++;
        }

//        do while - najpierw coś zrobi (zawsze wykona przynajmniej raz) a dopiero później sprawdzi warunek

        do{
            System.out.println("jestem w do");
            System.out.println(i);
            i++;
        }while (i < 20);
    }
}
