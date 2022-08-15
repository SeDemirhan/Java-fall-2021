package odevler;

import java.util.Scanner;

public class day03_S3 {
    public static void main(String[] args) {

        //Soru 3)
        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini
        //hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        int yariCap=scan.nextInt();
        System.out.println("Cemberin cevresi : " + 2*yariCap*3.14);
        System.out.println("Cemberin alani : " + 3.14*yariCap*yariCap);
    }
}
