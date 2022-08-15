package odevler;

import java.util.Scanner;

public class day07_S4 {
    public static void main(String[] args) {
           /*
Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
         */
        Scanner scan=new Scanner(System.in);

        String gunIsmi= scan.next();

        if (gunIsmi.toLowerCase().equals("cuma")){
            System.out.println("Muslumanlar icin kutsalgun");

        }
        if (gunIsmi.toLowerCase().equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gunIsmi.toLowerCase().equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }

    }


}
