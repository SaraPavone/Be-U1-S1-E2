package myIfElse;
import java.util.Scanner;

public class myIfElse {
    public static void main(String[] args) {
        System.out.println("---------ESERCIZIO 1A---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");

        String p = sc.nextLine();
        System.out.println(pariDispari(p));

        System.out.println("vuoi inserire un'altra parola? (y/n)");
        String risposta = sc.nextLine();
        if (risposta.equals("y")) {
            System.out.println("Inserisci una parola: ");
            p = sc.nextLine();
            System.out.println(pariDispari(p));
        }

        System.out.println("---------ESERCIZIO 1B---------");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Inserisci un anno: ");
        int anno = sc2.nextInt();
        System.out.println(annoBisestile(anno));

    }
        public static boolean pariDispari (String p){
            if (p.length() % 2 == 0) {
                return true;
            } else return false;

        }

        public static boolean annoBisestile ( int anno){
            if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
                return true;
            } else return false;
        }

}