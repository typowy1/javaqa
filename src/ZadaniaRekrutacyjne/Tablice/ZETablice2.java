package ZadaniaRekrutacyjne.Tablice;

public class ZETablice2 {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

//    1. policzyć ile jest liczb parzystych a ile jest nie parzystych

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1; // jak trafimy na liczbe parzystą to zwiększamy licznik o 1 czyli na koncu będziemy mieli ilość parzystych
            } else {
                odd += 1; // nieparzyste podobnie jak wyżej
            }
        }

        System.out.println("even: " + even); //parzyste
        System.out.println("odd: " + odd);// nieparzyste
    }
}
