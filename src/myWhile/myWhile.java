package myWhile;
import java.util.Scanner;

public class myWhile {
    public static void main(String[] args) {
        System.out.println("---------ESERCIZIO 3---------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Scrivi qualcosa, oppure digita ':q' per uscire: ");
        String input = sc.nextLine();

        divider(input, sc);
    }
    public static void divider(String str, Scanner sc) {
        do {
            if (str.equals(":q")) {
                break;
            }
            String[] letters = str.split("");
            String result = String.join(",", letters);
            System.out.println(result);


            System.out.println("Scrivi qualcosa, oppure digita ':q' per uscire: ");
            str = sc.nextLine();
        } while (!str.equals(":q"));
        sc.close();
        System.out.println("Programma terminato.");
    }
}
