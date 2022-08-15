package day03_scanner;

import java.util.Scanner;

public class C06_Scanner_ {
    public static void main(String[] args) {

        //Kullanıcıdan ismini,soyismini ve yasını alıp
        // girilen bilgiler = seyfi capar 34 şeklinde yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsım=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler : " + isim+" "+soyIsım+" "+yas);



    }
}
