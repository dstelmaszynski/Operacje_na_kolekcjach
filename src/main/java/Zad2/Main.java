package Zad2;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list_2 = new ArrayList<>();

        //adding random numbers to list
        Random random_2 = new Random();

        for (int i = 0; i < 10; i++) {
            list_2.add(random_2.nextInt(100));

        }
        //for each loop (sum of the numbers within list)
        int sum = 0;
        for (Integer value : list_2) {
            sum = sum + value;
        }
        //average of numbers within list
        int sizeOfList = list_2.size();
        int average = sum / sizeOfList;

        //tworzenie kopii listy
        //użycie konstruktora kopiującego
        ArrayList<Integer> kopia = new ArrayList<>(list_2);
        //sortowanie listy
        Collections.sort(kopia);


        //mediana posortownanej listy (metoda dla nieparzystej liczby elementow)
        int centerOflist = kopia.get(kopia.size() / 2);

        //mediana listy dla parzystej liczby elementow
        if (kopia.size() % 2 == 0) {
            int ceneterOfList1 = kopia.get(kopia.size() / 2);
            int ceneterOfList2 = kopia.get(kopia.size() / 2 - 1);
            System.out.println("\nMediana to: " + ((ceneterOfList1 + ceneterOfList2) / 2.0));
        } else {
            System.out.println("\nMediana dla nieparzystej liczby elementow : " + centerOflist);
        }

        //znajdowanie największego i najmniejszego elementu na liscie, ktora nie byla sortowana
        int smallestNumb = list_2.get(0);
        int bigestNumb = list_2.get(0);
        for (int i = 1; i < list_2.size(); i++) {
            if (list_2.get(i) > bigestNumb){
                bigestNumb = list_2.get(i);
            }
            if (list_2.get(i) < smallestNumb){
                smallestNumb = list_2.get(i);
            }
        }

        //po znalezieniu elementu znajdz index elementu maksymalnego
        //uzywajac petli for
        int indexOfBigestNumb = list_2.indexOf(bigestNumb);



        System.out.println("\nList of Integers: " + list_2);
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("\nAverage of the numbers: " + average);
        System.out.println("\nSorted numbers: " + kopia);
        System.out.println("\nMin number of not sorted list: " + smallestNumb + "; Max is: " + bigestNumb);
        System.out.println("\nBigest numb at index: " + indexOfBigestNumb);

    }
}
