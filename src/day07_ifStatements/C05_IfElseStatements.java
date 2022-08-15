package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Soru2-Kullanicidan bir karakter girmesini isteyin
        // ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){
            System.out.println("Girdiğiniz karakter harf");

        }else {
            System.out.println("Lutfen harf giriniz");
        }

    }
}
