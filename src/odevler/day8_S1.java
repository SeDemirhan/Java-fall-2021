package odevler;

import java.util.Scanner;

public class day8_S1 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare
        //olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarını giriniz");
        int kenarUzunluğu1= scan.nextInt();
        int kenarUzunluğu2= scan.nextInt();

        if (kenarUzunluğu1==kenarUzunluğu2){
            System.out.println("dikdörtgen kare");
        }else {
            System.out.println("dikdörtgen kare değil");
        }
    }
}
