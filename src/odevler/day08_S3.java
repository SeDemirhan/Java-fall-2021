package odevler;

import java.util.Scanner;

public class day08_S3 {
    public static void main(String[] args) {

        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil”

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ücgenin kenar uzunluklarının giriniz.");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
    }
}
