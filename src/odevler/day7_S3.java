package odevler;

import java.util.Scanner;

public class day7_S3 {
    public static void main(String[] args) {
        /*
Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
olmadigini yazdirin
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenar uzunluklarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar1==kenar2){
            System.out.println("dikdörtgen kare");
        }
        if (!(kenar1==kenar2)){
            System.out.println("dikdörtgen kare değil");
        }
    }
}
