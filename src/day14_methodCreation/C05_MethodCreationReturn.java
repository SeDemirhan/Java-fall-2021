package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class ın içerisinde herhangi bir hesaplama yapıp bunu da kalıcı olarak saklamak istersek
        kodumuzu sade ve anlaşılır tutmak içim işlemi bir methodda yapıp sonucunu main methoda döndürebiliriz
        Bu durumda return type i void olmayan bir methodun sonucunu
        main methodda bir veriable ye atarsak programın geri kalanında bu yeni değeri kullanma sansımız olur

         */

        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz





        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("sehirAdı = " + sehir);
        System.out.println("tarih = " + tarih);
    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil=scan.nextInt();
        if (yil>1900 && yil<2100){
           tarih=yil+"-";
        }else {
            System.out.println("yıl için gecerli bir sayı yazmalısınız(1900-2100)");
        }
        System.out.println("kacıncı ay oldugunu tam sayı olarak yazınız");
        int ay= scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("ay no 1-12 arasında olmalıdır");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("lutfen ayın kacıncı gunu oldugunu tam sayı olarak giriniz");
        int gun= scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("gün no olarak 1-31 arasında sayı girilmelidir");
        }else if (gun<10){
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }


    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir adı giriniz");

        String sehirAdi= scan.next().toUpperCase();
        return sehirAdi;
    }

}
