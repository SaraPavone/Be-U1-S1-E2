package mySwitch;

import java.util.Scanner;

public class mySwitch {
    public static void main(String[] args) {
        System.out.println("---------ESERCIZIO 2---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int n = sc.nextInt();
        System.out.println(switcher(n));
        sc.close();
    }
    public static String switcher (int n){
        String result ;

        switch (n){
            case 0:
                result = "ZERO";
                break;
            case 1:
                result  = "UNO";
                break;
            case 2:
                result = "DUE";
                break;
            case 3:
                result = "TRE";
                break;
            default:
                result = "ERRORE";
                break;
        }
        return result;
    }
}
