package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan tam sayıları alın
        kullanıcı cift sayı girdiği muddetce sayıları yazdırın
        tek sayı girdiginde işlemi bitir
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while ile cözelim

        /*
        loop larda kullanacağımız veriableleri loop dan özce olusturmalıyız
        while loop da loop dan önce olusturdugumuz bu veriable ye
        atayacağımız degeri iyi dusünmemiz gerekir

         */

        while (sayi%2==0){
            System.out.println("lutfen bir sayı giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayı cift : " + sayi);
            }else {
                System.out.println("girilen sayı tek");
            }


        }

        // do while loop ile yapalım
        // do while loop da onceden olusturular veriable ye hangi deger atandığının
        // hiçbir önemi yok, kodumuz her durumda calısır.

        // do while nin dezavantajı :
        // ilk calıstırma kontrol yapılmadan oldugu için loop un bady sinde yanlıs bir işlem yapılmamasına
        // dikkat etmek gerekir

        do{
            System.out.println("lutfen bir sayı giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayı cift : " + sayi);
            }else {
                System.out.println("girilen sayı tek");
            }

        }while (sayi%2==0);
 }
}
