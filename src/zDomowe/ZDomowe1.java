package zDomowe;

public class ZDomowe1 {
    public static void main(String[] args) {
        //1. 4 zmienne typu int

        int a = 6;
        int b = 6;
        int c = 8;
        int d = 8;

        int suma1 = a + b;
        int suma2 = c + d;

        //2. Czy suma dwóch pierwszych jest parzysta
        if(suma1 % 2 == 0){
            System.out.println("parzysta");
        } else {
            System.out.println("nie parzysta");
        }

        //3. Czy suma dwóch pozostałych jest parzysta
        if(suma2 % 2 == 0){
            System.out.println("parzysta");
        } else {
            System.out.println("nie parzysta");
        }

        //4. Jesli dwie sumy są parzyste to wyświetl informacje, że wszystkie liczby sa parzyste
        if(suma1 % 2 == 0 && suma2 % 2 == 0){
            System.out.println("wszystkie parzyste");
        } else {
            System.out.println("nie wszystkie parzyste");
        }

    }
}
