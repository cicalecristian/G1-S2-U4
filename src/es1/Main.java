package es1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array: ");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("Inserisci un numero (0 per uscire): ");
        int numero = Integer.parseInt(scanner.nextLine());

        while (numero != 0) {
            System.out.println("inserisci la posizione (1 - 5): ");
            int posizione = Integer.parseInt(scanner.nextLine());
            if (posizione >= 1 && posizione < array.length) {
                array[posizione - 1] = numero;
            } else {
                System.out.println("Posizione non valida!");
            }

            System.out.println("Array aggioranto: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Posizione " + (i + 1) + ":" + array[i]);
            }
            System.out.println("inserisci un numero (0 per uscire): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Programma terminato");

        scanner.close();
    }
}
