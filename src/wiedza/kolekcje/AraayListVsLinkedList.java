package wiedza.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AraayListVsLinkedList {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

//        ArrayList - zawsze wiemy na którym indexie będzie daty element, lista tablicowa
//        LinkedList - każdy element wie jaki jest poprzedni element i jaki jest kolejny element, lista dwustronnie połączona
//         szybsza praca na liście jeśli chcemy np dodać jakiś element w środek listy, przy array muszę się przesunąć wszystkie ele,enty w prawo,
//         przy linked aktualizują się tylko połączenia i bedzie to działało szybciej
//        w 99% bedziemy używac array

    }
}
