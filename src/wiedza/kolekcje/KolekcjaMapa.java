package wiedza.kolekcje;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class KolekcjaMapa {
    public static void main(String[] args) {
//        Mapa -  Klucz plus wartość, klucz musi być unikalny
//        treeMap zapewni sortowanie rosnąco po kluczach
//        LinkedHashMap - gwarantuje utrzymanie kolejnosci elementów w której je dodajemy

        Map<Integer, String> names = new HashMap<>(); // HashMap nie gwarantuje kolejności danych

        names.put(1, "Barte1");
        names.put(10, "Barte10");
        names.put(0, "Barte0");
        names.put(5, "Barte5");
        names.put(10, "Barte180"); //stara wartość zostanie nadpisana nową wartością

        System.out.println(names);

        Map<Integer, String> sortedNames = new LinkedHashMap<>(names); // treeMap zapewni sortowanie rosnąco po kluczach
        System.out.println(sortedNames);

        for(Map.Entry<Integer, String> entry: names.entrySet()){ //wyświetlanie elemenów z mapy
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
