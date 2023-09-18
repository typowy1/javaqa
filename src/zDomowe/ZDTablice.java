package zDomowe;

public class ZDTablice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

//    z1. zamienić pierwszy element tablicy z ostatnim
//        int first = numbers[0];
//        int last = numbers[numbers.length -1];
//        numbers[0] = last;
//        numbers[numbers.length -1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //    z1a. zamienić pierwszy element tablicy z ostatnim, z minimalną ilością dodatkowych zmiennych
//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length -1];
//        numbers[numbers.length -1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //    z1b. zamienić pierwszy element tablicy z ostatnim, żadnych dodatkowych zmiennych
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
//        numbers[0] = numbers[numbers.length - 1] - numbers[0];
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }


//        1. policzyć ile jest liczb parzystych a ile jest nie parzystych
//        int[] numbers1 = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
//
//        int even = 0;
//        int odd = 0;

//        for (int i = 0; i < numbers1.length; i++) {
//            if (numbers1[i] % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }

//        for (int number : numbers1) {
//            if (number % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//
//        System.out.println("even: " + even);
//        System.out.println("odd: " + odd);


        //        posrtować tablice rosnąco
//        int[] numbers3 = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//        0122445589

//        int min;

//        for (int i = 0; i < numbers3.length; i++) {
//            min = numbers3[i];
//            for (int j = i + 1; j < numbers3.length; j++) {
//                if(numbers3[j] < min){
//                    min = numbers3[j];
//                    numbers3[j] = numbers3[i];
//                    numbers3[i] = min;
//                }
//            }
//        }
//        for (int number : numbers3) {
//            System.out.println(number);
//        }


        //        posrtować tablice malejąco

        int[] numbers4 = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        int max;

        for (int i = 0; i < numbers4.length; i++) {
            max = numbers4[i];
            for (int j = i + 1; j < numbers4.length; j++) {
                if(numbers4[j] > max){
                    max = numbers4[j];
                    numbers4[j] = numbers4[i];
                    numbers4[i] = max;
                }
            }
        }
        for (int number : numbers4) {
            System.out.println(number);
        }
    }

}
