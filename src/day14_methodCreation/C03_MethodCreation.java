package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Input olarak verilen isim ve soyismi ilk harfi büyük
        // geriye kalan harfler yıldız(*) olacak sekilde
        // I**** K**** seklinde yazdıran bir method olusturun

        String isim="Enes";
        String soyIsım="Bozkurt";

        ismiGizle(isim,soyIsım);

        C02_MethotCreation.rakamlariTopla(654);

    }

    public static void ismiGizle(String isim, String soyIsım) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsım=soyIsım.substring(0,1).toUpperCase()+soyIsım.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyIsım);
    }
}
