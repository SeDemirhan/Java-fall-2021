package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileForLoop {
    public static void main(String[] args) {
        /*
  kullanicidan toplanmak uzere sayilar alin
  sayilarin toplami 500'u gecince
  sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

  13 sayi girdinz ve toplamlari 567
 */
        int toplam=0;
        int sayı=0;
        int sayac=0;

        Scanner scan=new Scanner(System.in);
        while (toplam<500){

            System.out.println("Lutfen toplamak için sayı giriniz");
            sayı= scan.nextInt();
            toplam+=sayı;
            sayac++;
        }
        System.out.println(sayac + " sayı girdiniz ve toplamları "+ toplam);

    }
}
