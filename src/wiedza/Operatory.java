package wiedza;

public class Operatory {

    public static void main(String[] args) {
//Matematyczne
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(a / b);

        //    porównania
        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numTwo > numOne);
        System.out.println(numTwo == numOne);
        System.out.println(numTwo != numOne);
        System.out.println(numTwo >= numOne);
        System.out.println(numTwo <= numOne);

//        operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1); // falsz || prawda -> prawda
        System.out.println(numOne > numTwo || numOne != 1);// falsz || falsz -> falsz
        System.out.println(numOne < numTwo || numOne != 1);// prawda || nie jest sprawdzana -> prawda

        // && - i
//        System.out.println(numOne < numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne == 1);// praqwda i prawda -> prawda
        System.out.println(numOne > numTwo && numOne != 1);// falsz i prawda -> fałsz
        System.out.println(numOne > numTwo && numOne != 1);// falsz i falsz -> fałsz

//         modulo, reszta z dzielenie
        System.out.println(10 % 5); //10 reszty z 5 to zostaje 0
        System.out.println(10 % 3); //10 reszty z 3 to zostaje 1
        System.out.println(10 % 4); //10 reszty z 4 to zostaje 2

        // sprawdzamy czy liczba jest parzysta
        if (10 % 2 == 0) { // nie zostaje nam żadna reszta
            System.out.println("liczba parzysta");
        }
    }

}
