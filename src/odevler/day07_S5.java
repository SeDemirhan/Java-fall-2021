package odevler;

import java.util.Scanner;

public class day07_S5 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare
        //olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenar uzunluklarini giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        if (kenar1 == kenar2) {
            System.out.println("dikdörtgen kare");
        }else {
            System.out.println("dikdortgen kare degil");
        }


    }


}
