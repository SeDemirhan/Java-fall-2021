package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı isteyin
        // sayı pozitif ise sayısı yazdıırın
        // sayı negatif veya sıfır ise bir sayı daha isteyip carpımını yazdırın,

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi2*sayi);
        }

        /*
        eğer if else içerisinde yeni kodlar varsa
        ternary ile yapmamız mumkun degil
         */


    }
}
