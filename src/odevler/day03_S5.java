package odevler;

import java.util.Scanner;

public class day03_S5 {
    public static void main(String[] args) {

        //Soru 5)
        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim= scan.nextLine();
        String soyIsım=scan.nextLine();

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyIsım + "\nKursumuza katiliminiz alinmistir,tesekkur ederiz");


    }
}
