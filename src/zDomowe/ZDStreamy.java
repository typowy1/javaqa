package zDomowe;

import model.computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZDStreamy {

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 2", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));

        System.out.println("-1");
//        1. Zliczyć wszystkie komputery które mają więcej niż 128 gb ramu
        long count = computers.stream()
                .filter(c -> c.getRam().getSize() > 128)
                .count();
        System.out.println("liczba komputerów to :" + count);

        System.out.println("-2");
//        2. Wyświetlić na konsole wszystkie typy komputerów
        computers.stream()
                .map(Computer::getName)
                .forEach(System.out::println);

        System.out.println("-3");
//        3. Wyświetlić komputer który ma najwięcej ramu
//        computers.stream()
//                .max(Comparator.comparingInt(c -> c.getRam().getSize()))
//                .ifPresent(System.out::println);
//
////        lub
        Computer can_not_finde_any_computer = computers.stream()
                .max(Comparator.comparingInt(c -> c.getRam().getSize()))
                .orElseThrow(() -> new IllegalArgumentException("Can not find any computer"));
        System.out.println(can_not_finde_any_computer.getName());

        System.out.println("-4");
        //    4. utworzyć nową kolekcje z komputerami które maja dysk twardy mniejszy nić 500gb
        List<Computer> collect = computers.stream()
                .filter(c -> c.getHdd().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer computer : collect) {
            System.out.println(computer.getName() + " " + computer.getHdd());
        }


        System.out.println("-5");
//        5. Posortować komputery po nazwie i typie
        List<Computer> collect1 = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer computer : collect1) {
            System.out.println(computer.getName() + " " + computer.getType());
        }

//        lub
//        computers.stream()
//                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
//                .forEach(System.out::println);

    }


}
