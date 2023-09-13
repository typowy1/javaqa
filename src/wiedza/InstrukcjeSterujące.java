package wiedza;

public class InstrukcjeSterujące {
    // lub też warunkowe
    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 2;

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is less than number two");
        }


        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "l";

        switch (page) {
            case "Home":
                System.out.println("Przełączam się do strony home");
                break;
            case "Login":
                System.out.println("Przełączam się do strony login");
                break;
            case "Contact":
                System.out.println("Przełączam się do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }
    }

}
