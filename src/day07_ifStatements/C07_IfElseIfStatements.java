package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        // bir onceki soruda kullanıcı negatif deger girerse uyaralım

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsin,"+(65-yas)+" "+"yıl daha calismalisin");

        }else {
            System.out.println("Emekli olabilirsin");
        }

    }



}
