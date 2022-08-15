package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi giriniz");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("cumartesi")||girilenGun.equals("pazar")){
            System.out.println("Haftasonu");

        }
        if (girilenGun.equals("pazartesi")||girilenGun.equals("salı")||
            girilenGun.equals("carsamba")||girilenGun.equals("persembe")||girilenGun.equals("cuma")){
            System.out.println("haftaici");

        }
        if (!(girilenGun.equals("pazartesi")||girilenGun.equals("salı")||
                girilenGun.equals("carsamba")||girilenGun.equals("persembe")||girilenGun.equals("cuma")
            ||girilenGun.equals("cumatesi")||girilenGun.equals("pazar"))){
            System.out.println("lutfen gecerli bir gün giriniz");

        }





    }




}
