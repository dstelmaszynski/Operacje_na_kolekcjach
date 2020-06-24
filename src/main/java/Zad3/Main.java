package Zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //dodaj do listy stringow elementy int
        List<String> listOfStrings = new ArrayList(Arrays.asList(10030, 3004, 4000, 12355, 12222, 67888, 111200,
                225355, 2222, 1111, 3546, 138751, 235912));
        System.out.println("List of Strings: " + listOfStrings);

        //określ indeks elementu 138751 posługując się metodą indexOf
        System.out.println("\n138751 jest na miejscu: " + listOfStrings.indexOf(138751));

        //sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
        System.out.println("\nCzy na liscie jest obiekt 67888? " + listOfStrings.contains(67888));

        //sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
        System.out.println("\nCzy na liscie jest obiekt 67889? " + listOfStrings.contains(67889));

        //usuń z listy obiekt 67888 oraz 67889 (metoda remove)
        int toRemove = listOfStrings.indexOf(67888);
        listOfStrings.remove(toRemove);
        System.out.println("\nLista po usunieciu elementow: " + listOfStrings);
    }
}
