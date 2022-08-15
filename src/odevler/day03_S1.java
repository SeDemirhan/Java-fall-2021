package odevler;

import java.util.Scanner;

public class day03_S1 {
    public static void main(String[] args) {

        //Soru 1)
        //Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayı giriniz. \nİlk sayıyı girdikten sonra entera basınız ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("Girdiginiz sayilarin toplami : " + (sayi1+sayi2));
        System.out.println("Girdiginiz sayilarin toplami : " + (sayi1-sayi2));
        System.out.println("Girdiginiz sayilarin toplami : " + (sayi1*sayi2));







    }



}
