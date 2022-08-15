package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun ismi alın
        hafta içi veya hafta sonu oldugunu yazdırın
         */
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.next();*/

        String input ="CUMARTESİ";
        input=input.toLowerCase();

        switch (input){
            case "pazartesi" :
                System.out.println("Hafta içi");
                break;
            case "salı" :
                System.out.println("Hafta içi");
                break;
            case "carsamba" :
                System.out.println("Hafta içi");
                break;
            case "persembe" :
                System.out.println("Hafta içi");
                break;
            case "cuma" :
                System.out.println("Hafta içi");
                break;
            case "cumartesi" :
                System.out.println("Hafta sonu");
                break;
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gün gir");

        }
        switch (input){
            case "pazartesi" :
            case "salı" :
            case "carsamba" :
           case "persembe" :
           case "cuma" :
                System.out.println("Hafta içi");
                break;
            case "cumartesi" :
             case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gün gir");

        }


    }
}
