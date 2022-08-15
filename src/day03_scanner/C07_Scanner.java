package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanıcıdan tum bilgileri alarak yapın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminiz,soyisminizi ve yasınızı giriniz.\naralarda enter tusuna basın");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas= scan.nextInt();


        System.out.println("Girilen bilgiler : " + isim+" "+soyisim+" "+yas);

    }
}
