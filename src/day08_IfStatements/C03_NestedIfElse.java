package day08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        /*
         Emeklilik kontrolu yapan bir program yazınız
         Cinsiyet olarak E(erkek) veya K(kadın) degişkenlerini kabul etsin
         Farklı bir harf veya sembol girilirse hata versin

         emeklilik için kadınlarda 60, erkeklerde 65 olsun
         negatif yas veya 80 den buyuk yas girilirse hata mesajı versin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nkadın için K erkek için E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }


        }

    }
}