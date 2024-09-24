package myWhile;
import java.util.Scanner;

public class myWhile {
    public static void main(String[] args) {
        System.out.println("---------ESERCIZIO 3---------");
        Scanner sc = new Scanner(System.in);

        divider(sc);
    }

    public static void divider (Scanner sc){
        String p = "";

        while (!p.equals(":q")){
      System.out.println("Inserisci una parola (o ':q' per uscire): ");
      p = sc.nextLine();


            if (!p.equals(":q")) {
                int i = 0;
                StringBuilder output = new StringBuilder();

                while (i < p.length()) {
                    output.append(p.charAt(i));
                    if (i < p.length() - 1) {
                        output.append (", ");
                    }
                    i++;
                }
                System.out.println(output);
            }
        }

        System.out.println("Programma terminato.");
    }
}
