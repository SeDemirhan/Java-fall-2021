package odevler;

import java.util.Scanner;

public class day12_S4 {
    public static void main(String[] args) {
        //Soru 4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim= scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        }else if (isim.length()<soyIsim.length()){
            System.out.println("soyisminiz isminizden daha uzun");
        }else {
            System.out.println("isminiz soyisminize eşit uzunlukta");
        }

    }
}
