package es3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        ContoCorrente conto = new ContoCorrente("Cristian", 500);
        ContoOnLine contoOnline = new ContoOnLine("Cristian", 1000, 300);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScegli il conto: 1 = ContoCorrente, 2 = ContoOnLine, 0 = Esci");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Uscita dal programma.");
                break;
            }

            System.out.print("Inserisci l'importo del prelievo: ");
            double importo = scanner.nextDouble();

            try {
                if (scelta == 1) {
                    conto.preleva(importo);
                    System.out.println("Prelievo effettuato! Nuovo saldo: " + conto.restituisciSaldo());
                } else if (scelta == 2) {
                    contoOnline.preleva(importo);
                    contoOnline.stampaSaldo();
                } else {
                    System.out.println("Scelta non valida.");
                }
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
