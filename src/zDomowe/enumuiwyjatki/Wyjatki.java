package zDomowe.enumuiwyjatki;

import zDomowe.zdomoweBug.model.Bug;
import zDomowe.zdomoweBug.model.BugReporter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Wyjatki {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Kasia");
        names.add("Tomek");
        names.add("Piotr");
        names.add("Łukasz");

        List<String> names2 = new ArrayList<>();

        try {
            FileWriter file = new FileWriter("names.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (String name : names) {
                bufferedWriter.write(name + "\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                names2.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : names2) {
            System.out.println(name);
        }
        System.out.println(names2.size());

//        names.stream()
//                .filter(n -> n.startsWith("z"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Can not find names with given parameters"));

        Bug bug = new Bug("Bug 2",  new BugReporter("Rafa", "Kowalski", "rafal@wp.pl"), 5);

        bug.setBugPriority(6);

    }

}
