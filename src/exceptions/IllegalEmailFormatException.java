package exceptions;

public class IllegalEmailFormatException extends RuntimeException {


// dobra praktyka to nadpisanie dóch konstruktorów, domyślnego i takiego który bierze message jako parametr
//    tworząc własne wyjątki dziedziczymy po RuntimeExceptionm raczej nie po Exeptionem czyli tworzymy wyjątki których nie trzeba obsługiwać


    public IllegalEmailFormatException() {
    }

    public IllegalEmailFormatException(String message) {
        super(message);
    }
}
