package odevler;

import java.util.Scanner;

public class day09_S2 {
    public static void main(String[] args) {
        //Soru4
        // Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici
        //S girerse Software
        //D girerse Devoloper
        //E girerse Engineer
        //T girerse “In Testing” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kısaltmadaki harflerden birini giriniz");
        String kısaltma =scan.next().toUpperCase();

        switch (kısaltma){
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Devoloper");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");
        }
    }
}
