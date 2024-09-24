package myFor;

import java.util.Scanner;

public class myFor {
    public static void main (String[] args) {
        System.out.println("---------ESERCIZIO 4---------");
        System.out.println("inserisci un numero intero per avviare il countdown: ");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        countdown(test);
        sc.close();
    }
    public static void countdown(int n) {

        System.out.println("Conto alla rovescia da " + n + " a 0");

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
