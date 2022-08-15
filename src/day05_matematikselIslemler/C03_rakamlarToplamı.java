package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_rakamlarToplamı {
    public static void main(String[] args) {

        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamaklı pozitif bir tamsayı giriniz");

        int sayı= scan.nextInt(); // 5267

        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayı=sayı;

        //suanda sayı 5267 bb=0 rt=0

        birlerBasamagı=sayı%10; // 7
        rakamlarToplamı+=birlerBasamagı;
        sayı/=10; //526

        birlerBasamagı=sayı%10; //6
        rakamlarToplamı+=birlerBasamagı; // 7+6=13
        sayı/=10; // 52

        birlerBasamagı=sayı%10; //2
        rakamlarToplamı+=birlerBasamagı; // 7+6+2=15
        sayı/=10; // 5

        birlerBasamagı=sayı%10; // 5
        rakamlarToplamı+=birlerBasamagı; //7+6+2+5=20
        sayı/=10; // 0

        System.out.println(ilkGirilenSayı+ " " +rakamlarToplamı);




    }
}
