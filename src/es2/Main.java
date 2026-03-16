package es2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        try {
//            System.out.println("Inserisci il numero di km percorsi: ");
//            int km = Integer.parseInt(scanner.nextLine());
//            System.out.println("Inserisci i litri consumati: ");
//            int litri = Integer.parseInt(scanner.nextLine());
//
//            int kmLitro = km / litri;
//            System.out.println("km per litro: " + kmLitro);
//        } catch (ArithmeticException e) {
//            System.out.println("Errore: divisione per 0! i litri non possono essere 0.");
//        }

        System.out.println("Inserisci il numero di km percorsi: ");
        double km = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci i litri consumati: ");
        double litri = Double.parseDouble(scanner.nextLine());

        if (litri == 0) {
            System.out.println("Errore: i litri non possono essere 0!");
        } else {
            double kmLitro = km / litri;
            System.out.println("km per litro: " + kmLitro);
        }

        scanner.close();
    }
}
