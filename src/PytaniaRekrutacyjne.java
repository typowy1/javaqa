public class PytaniaRekrutacyjne {

// 1. typy w javie - w tej klasie są wymienione: TypyZmienne
//   dwa typy danych, proste(prymitywne
//    referencyjne, obiekty

//    ptzy typach prostych zmienna trzyma bezpośrednio wartosć int = 4
//    typy referencyjne beda trzymaly referencje do obiektu, taki wskaźnik doobiektu, nie beda trzymaly wartosci


//    2. Klasa i obiekt

//    Klasa - szablon, matryca która słóży do tworzenia obiektów, opisuje z czego składaja sie obiekty, pola obiektu,
//    pola statyczne, i jak się bedą zachowywac, metody

//    obiekt reprezentacja klasy, utworzony z tego szblonu(klasy)


//    3. Referencja do obiektu, po lewej stronie jak przypisujemy zmienna, wskaźnik gdzie w pamięci znajduje się obiekt.
//    za pomocą referencji możemy się odwoływac do obiektu, wywoływac metody, jezeli pola sa publiczne to mozemy odwoływac sie do pól.

//    4. z czego składa sieklasa:
//    pól oboektu, opisują stan danego obiektu
//    konstruktr który służy do konstruowania i budowania tego obiektu
//    metody - opisują zachowanie obiektu, czyli o co obiekt bedzie mógł zrobić
//    metody i pola statyczne które będą należały do klasy
// metody i pola statyczne należące do obiektu
//    metody prywatne które będą widoczne i używane w obrębie klasy

//    5. Konstruktor - służy do budowania obiektów, ma nazwe klasy i jest z dużej litery, konetruktor nie ma zwracanego typu
//    domyślny bez parametrów, z parametrami które będą ustawiały pola obiektu, jezeli nie zdefiniujemy konstruktora to java tworzy
//    domyślny konstruktor, i domyślny konstruktor pozwoli nam utworzyć pusty obiekt, jeśli napiszemy konstruktor i przekażeny do niego pola to
//    wtedy konstruktor domyślny nigdy juz nie zadziała

//    camelCase- zaczynamy małą ilterą i kolejne słowo piszemy wielkąliterą

//    6. Czy konstruktor może być prywatny - może byc prywatny, ale będzie dziąłał w obrębie danej klasy i tam będzie tworzył obiekt,
//     , możemy za pomocą np publicznej statycznej metody będzie można zwrócić obiekt

//    7. nadpisanie metod vs przeciążanie metod

//    przeciążanie metod - metody z taką sama nazwą, takim samym typem zwracanym , różnica jest w parametrach, liczbie, typie itd
//    króre te metody będą ptzyjmowały, np jedna metoda nie będzie mieć parametrów a inna będzie mieć dwa parametry

//    nadpisywanie metody - @Override jeżeli klasa dziecko dziedziczy po klasie matce i w klasie matce jest juz jakaś metoda to możemy nadpisać ta metodę
//    możemy też odnieść się do istniejącej już metody za pomocą słówka super lub zmienić całkowicie zachowanie tej metosy


//    8. co znaczy że obiekt jest nie zmienny immutable - jeżeli utworzymy obiekt raz i poustawiamy w nim wartości
//    ale później nie możemy go zmienić, pola w klasie nie beda mialy seterow ani metod które będą mogły nadpisać wartości
//    przykładem takiego obiektu jest String, za każdym razem kiedy chcemy coś dodac do stringa za pomocą +,
//    to nie zmieniamy starego obiektu tylko tworzymy nowy który składa się z starej części i nowej.
//    String jest immutable, niezmienny
//
//    9. dziedziczenie
//    1. IS a - extends-  jest czymś - dziedziczenie, jesli miedzy klasami zachodzi relacja, bmw jest samochodem, samochod matka, bmw dziecko,
//    klasa dziecko rozszeza działanie klasy matki, poza prywatnymi metodami i polami

//    Kompozycja
////    2. Has a - posiada cos - kompozycja, budowanie za pomocą innych obiektów, składa się z innych obiektów które reprezenrują np części

//    10. czy w javie jest wielodziedziczenie
//   nie ma wielodziedziczenie klas
//   klasa nie może dziedzićyć po wielu klasach, jak w dwóch klasach będą te same metody(nazwy) to java nie będzie wiedzieć po której klasie dziedziczyc
//    diament zależności

//    11. Czy klasa może implementować wiele inteerfejsów
//    tak może implementować nieskończenie wiele interfajsów, poniewż interfejs to rozszeżenie funkcjonalności danej klasy
//    diament zależnosci jak w dwóch interfejsach będą te same metody(nazwy) domyślne to java nie będzie wiedzieć po której klasie dziedziczyc
//    i wtedy nas zapyta której użyć czy może nadpisać

//    12. co to jest interfejs
//    służy żeby rozszeżać funkcjonalność klasy,
//    tylko stałe - pola finalne, publiczne i statyczne, zwykłe stałe
//    każda metoda jest domyślnie abstrakcyjna, czyli nie będzie mieć ciała a tylko sygnature
//    wszyskie klasy które będą implementowały dany interface będą musiały zaimplementować tą metoda, nadpisać i powiedziec co tam ma sie dziac
//    mozemy tez miec metody domyslne od javy 9, mają słówk defolt i są to zwykłe metody które maja ciało metody i mogą wykonywac zwykłą logikę
//    metody statyczne - odwołujemy sie za pomocą nazwy interfejsu, prywatnie i publiczne

//    13. co to jest klasa abstrakcyjna
//    określa abstrakcyjny byt, może posiadac metody abstrakcyjne które nie posiadaja ciała a tylko sygnature
//    z takiej klasy nie utworzymy obiektu, w dalszym ciagu klasy mogą dziedziczyć po klasie abstrakcyjnej
//    jeżeli klasa dziedziczy po klasie abstrakcyjnej to będzie musiała zaimplementować i nadpisać wszystkie metody z tej klasy

// 14. różnica między interfejsem a klasą abstrakcyjną
//    klasa abstrakcyjna - może miec pola obiektu które opisują nam stan danego obiektu oraz metody które opisują zachowanie danego obiektu
//    pola i metody

//    interfejsy rozszezaja zachowanie - nie mozemy miec pol obiektu, możemy miec metody i stałe które będą nam definiowały zachowanie obiektu
//    stałe i metody

//    15. różnica między == a equals
//    == - używamy do porównywania zawartości typów prostych
//    equals = porównywanie typów referencyjnych, obiektów

//    16. modyfikatory dostepu
//    publiczny public - pole albo metoda dostepny w całym projekcie
//    prywatny private - pole albo metoda dostępne w obrębie danej klasy
//    protected chroniony -  pole albo metoda dostępne w danej klasie oraz w wszystkich klasach które dziedziszą po tej klasie
//    domyślny - jak nie podamy modyfokatora, pole albo metoda dostępne w danej klasie oraz w wszystkich klasach które dziedziszą po tej klasie i w pakiecie

//    17. enkapsulacja - private
//    ukrywamy w klasie pola, metody, logike, możemy używać tylko w klasie bądz udostępniać za pomocą innych publicznych metod
//    chowanie poł albo implementacji

//   18. co to jest static i final
//    static - pola i metody statyczne które należą do klasy a nie do obiektu, najczesciej metody pomocnicze,
//    odwołujemy sie za pomocą nazwa klasy, nazwa pola, nie potrzebujemy teorzyć obiektu po to żeby dostać sie do statycznych pól czy metod

//    final - dodajemy do pól jeśli chcemy żeby one nie były zmienne czyli będą stałe, nie możemy przypusać do niej wartości
//    łączymy staic z final, mamy wtedy publiczne statyczne stałe pola które piszemy z wielkiej litery np dni tygodnia
//    wartość możemy przypisać tylko raz i nie mozemy jej nadpisac

//    19. Co to jest garbage collector
//    usówa obiekty z pamięci, zbieracz śmieci, jesli zadna referencja nie wskazuje na obiekt to garbage collector usunie go

//    20. kolekcje w jawie
//    Listy: zbiór danych jednego typu, usprawniona tablica, dynamicznie rozszeżalna, arraylist, linked list dziedziczą po interfejsie List
//    set - sety przetrzymuje unikalne wartości, hash set, tree set
//    Map - mapy, zbiór kluczy i warości, do unikalnych kluczy przypisujemy wartosci, hash map, tree map
//    jeżeli podamy takie same klucze to pierwszy klucz zostanie nadpisany przez nastepny taki sam klucz

//    21. Jaka jest różnica miedzy ArrayList a LinkedList
//    ArrayList - rozszeżenie zwykłej tablicy, tu jak cos dodamy na początek albo w środek to tą częsc po lewej stronie musimy przesunąć
//    i dopiero włożyc coś w środek, to długo trwa
//    LinkedList - każdy element wie co jest przed nim i co jest za nim, jeżeli będziemy mieli dużą liste i dodawali elemena początku w środku
//    to etedy dużo szybsza jest linked list czyli lista połączona, tu aktualizują się tylko połączenia

//    22. Co to jest stream i lambda
//    stream - strumienie, praca na kolekcjach, w spsób funkcyjny możemy pracowac z kolekcjami,
//    lamdy - funkcje, wyrazenia,  które wżucamy do streema el -> el.getText

//    23. Co to jest Optional
//    typ opakwujący, opakowanie na obiekt, przeciwdziała nullpointer(coś co nie istnieje)

//    24. Jakie znasz typy wyjątków
//    check exeption - wyjątki które musimy łapac, io exetion sql exeption
//    uncheckd exeption - wyjątki których nie musimy łapać, nulpointer exeption, powinny zostac obsłużone przez programiste
    //Wyjątki - sytuacje wyjątkowe, zabezpieczenie przed zatrzymaniem app

//    25. Jak obsłużyć wyjątki
//    blok try(podajemy nebezpieczną część kodu), catch(łapiemy wyjątek, czyli obsłużymy np wyjątkową sytuacje w której
//    plik nie istnieje) i finaly(coś co wykona się zawsze np połączenie z bazą danych zawsze zamkniemy.

//    możemy wyjątek przekazac wyżej, do wyższej klasy i w sygnaturze klasy dac inże żuciliśmy go wyżej i my sięni nie będziemy zajmować

//    26.Różnica miedzy throw a throws
//    throw  w ciele metody rzucamy wyjątek i podajemy: throw new nazwa wujątku
//    throws - podajemy w sygnaturze metody, nazwa meotody i throws i jaki wyjątek, inofmjemy programistów że ta metoda będzie rzucała jakis wyjątek

}
