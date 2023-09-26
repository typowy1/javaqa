package wiedza;

import model.User;
import zDomowe.zdomoweBug.model.Bug;
import zDomowe.zdomoweBug.model.BugReporter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Wyjatki {

    public static void main(String[] args) {

        //Wyjątki - sytuacje wyjątkowe, zabezpieczenie przed zatrzymaniem app

        //1. Dwa typy wyjątków (musimy łapać i nie musimy łapać
        //2. łapanie wyjątków
        //3. zucanie wyjątków
        //4. dodanie wyjątku do sygnatury metod
        //5. Tworzenie wyjątków

        //1. Musimy łapać wyjątki - Exception
        // FileNotFoundExceprion();
        // IOException

        //2. Nie musimy łapać ale możemy - RunTimeException
        // IllegalStateException
//    IllegalArgumentException
//    NullPointerException
//    IndexOutOfBoundsException
//    UnsupportedOperationException

//        try {
//            BufferedReader bufferedReader =  new BufferedReader(new FileReader("test.txt"));
//            String line = bufferedReader.readLine();
//
//            while (line != null){ // czytamy wszystkie linie az dojdziemy do null, dopóki ta lini którą przeczytamy jest różna od null, czyli jak będzi istniał jakiś tekst w naszym pliku
//                System.out.println(line); //to wyswietlamy na konsoe
//                line = bufferedReader.readLine(); //i wyswietlamy kolejna linie
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally { //wykona sie zawsze
//            System.out.println("To wykona sie zawsze"); // czyli np możemy zamknąć połączenie z bazą mimo wyjątku
//        }

//    wyjątki których nie musimy łapać

//        NullPointerExecption
//        Bug bug = new Bug("Bug 2",  new BugReporter("Rafa", "Kowalski", "rafal@wp.pl"), 5);
//        System.out.println(bug.getDescription());
//
//        bug = null;
//        System.out.println(bug.getDescription());

//        IndexOutOfBoundsException
//        List<String> names = new ArrayList<>();
//        names.add("Bartek");
//        System.out.println(names.get(1));

//        // IllegalStateException
//        List<String> names = new ArrayList<>();
//        names.add("Bartek");
//        names.add("Tomek");
//        names.add("Marcin");
//
//        names.stream()
//                .filter(s -> s.startsWith("A"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Can not find names with given parameters"));


//        IllegalArgumentException w klasie BugReporter jest ta metoda
//        public void setEmail(String  email) {
//            if (!email.contains("@")) {
//                throw new IllegalArgumentException("wrong email, email should contains @");
//            } else {
//                this.email = email;
//            }
//        }

//        Bug bug = new Bug("Bug 2",  new BugReporter("Rafa", "Kowalski", "rafal@wp.pl"), 5);
//        bug.getReporter().setEmail("fff");


//        UnsupportedOperationException

//        własne wyjątki
        User rafal = new User("Rafal", "Testowy", "bartek@test.pl", 17);
        rafal.setEmail("ffff"); // w tej metodzie jest nasz własny wyjątek
    }

}
