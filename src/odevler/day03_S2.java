package odevler;

import java.util.Scanner;

public class day03_S2 {
    public static void main(String[] args) {

        //Soru 2)
        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve
        //alanini hesaplayip yazdirinn

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karanin bir kenar uzunlugunu giriniz");
        int kenarUzunlugu= scan.nextInt();
        System.out.println("Karenin cevresi : " + kenarUzunlugu*4);
        System.out.println("Karenin alani : " + kenarUzunlugu*kenarUzunlugu);
    }
}
