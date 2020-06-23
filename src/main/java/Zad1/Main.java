package Zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }


        for (int j = 0; j < 5; j++) {
            Random randomNumb = new Random(); //metoda do tworzenia randomowych liczb
            list.add(randomNumb.nextInt(100));
        }
        System.out.println(list);

    }
}
