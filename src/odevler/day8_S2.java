package odevler;

import java.util.Scanner;

public class day8_S2 {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);

        if (karakter>'a'|| karakter<='z'){
            System.out.println("girdiğiniz karakter harf");
        }else {
            System.out.println("girdiğiniz karakter harf değil");
        }

    }
}
