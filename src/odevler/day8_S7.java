package odevler;

import java.util.Scanner;

public class day8_S7 {
    public static void main(String[] args) {

        //Soru12
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin Girdiği sayi 5 ’e bölünüyorsa
        //son rakamını kontrol edin Son rakamı 0 ise ekrana 5 ’e bölünen çift sayı”
        //yazdırın Son rakamı 0 değil ise 5 ’e bölünen tek sayı” yazdırın Girdiği password
        //5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dört basamaklı bir sayı giriniz");
        double sayı= scan.nextDouble();

        if (sayı<1000 || sayı>9999) {
            System.out.println("Gecersiz sifre girdiniz");
            }else if (sayı%5==0){
            if (sayı%10==0){
                System.out.println("5 ’e bölünen çift sayı");
            }else{
                System.out.println("5 ’e bölünen tek sayı");
            }
        }else {
            System.out.println("Tekrar deneyin");
        }


    }
}
