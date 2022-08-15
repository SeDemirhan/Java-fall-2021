package odevler;

import java.util.Scanner;

public class day03_S6 {
    public static void main(String[] args) {

        //Soru 6)
        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak
        //asagidaki sekilde yazdirin
        //Isim - soyisim : Mehmet Bulutluoz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");

        String isim= scan.nextLine();
        String soyIsim=scan.nextLine();
        System.out.println("Isim - soyisim : " + isim +" "+ soyIsim);


    }
}
