package day16_forloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 10 )
        Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
        tamsayilari toplayip, sonucu yazdiran bir method yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangıc ve bitiş degerlerini pozitif olarak gir");
        int bas= scan.nextInt();
        int bit= scan.nextInt();

        aralarıTopla(bas,bit);

    }

    public static void aralarıTopla(int bas, int bit) {
        int toplam=0;
        if (bas<=bit){
            for (int i = bas; i <=bit ; i++) {
                toplam+=i;

            }
            
        }else {
            for (int i = bit; i <=bas ; i++) {
                toplam+=i;
            }
            
        }
        System.out.println("Aralardaki sayıların toplamı : " + toplam);
    }
}
