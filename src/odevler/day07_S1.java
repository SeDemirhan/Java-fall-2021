package odevler;

import java.util.Scanner;

public class day07_S1 {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("girdiğiniz sayi cift");
        }
        if (sayi%2==1){
            System.out.println("girdiginiz sayi tek");
        }




    }

}
