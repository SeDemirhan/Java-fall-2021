package odevler;

import java.util.Scanner;

public class day07_S2 {
    public static void main(String[] args) {
        /*
Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
isimlerini yazdirin
Ornek:
ilkHarf=P output = “Pazar ,Pazartesi veya Persembe”
ilkHarf=S output = “Sali”
*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gün isminin ilk harfini giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='p'){
            System.out.println("Pazar ,Pazartesi veya Persembe");
        }
        if (ilkHarf=='s'){
            System.out.println("sali");
        }
        if (ilkHarf=='c'){
            System.out.println("carsamba, cuma veya cumartesi");
        }
    }
}
