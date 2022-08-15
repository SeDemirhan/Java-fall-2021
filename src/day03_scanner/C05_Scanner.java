package day03_scanner;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayıyı giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2. sayıyı giriniz");
        double sayi2=scan.nextDouble();

        System.out.println("Sayıların carpımı = "+sayi1*sayi2);
    }
}
