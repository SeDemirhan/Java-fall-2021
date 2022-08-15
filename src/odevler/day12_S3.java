package odevler;

import java.util.Scanner;

public class day12_S3 {
    public static void main(String[] args) {

        //Soru3 Kullanicidan isim isteyin Eger
        //isim “a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //isim “Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
