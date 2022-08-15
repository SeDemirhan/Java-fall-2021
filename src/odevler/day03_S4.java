package odevler;

import java.util.Scanner;

public class day03_S4 {
    public static void main(String[] args) {

        //Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini
        //isteyip prizmanin hacmini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenler prizmasinin kenar uzunluklarini ve yuksekliğini giriniz. \nHer girişten sonra entera basın");

        double kisaKenar= scan.nextDouble();
        double uzunKenar=scan.nextDouble();
        double yukseklik=scan.nextDouble();

        System.out.println("Dikdortgenler prizmasinin hacmi : " + kisaKenar*uzunKenar*yukseklik);
    }
}
