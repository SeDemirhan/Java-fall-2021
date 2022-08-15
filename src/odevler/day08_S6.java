package odevler;

import java.util.Scanner;

public class day08_S6 {
    public static void main(String[] args) {

        //Soru 11
        //Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        //Kullanicidan
        //bir sifre girmesini isteyin
        //Eger
        //ilk harf buyuk harf ise “ olup olmadigini kontrol edin Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        //Eger
        //ilk harf kucuk harf ise “ olup olmadigini kontrol edin Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");

        String sifre= scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){
            if (ilkHarf=='z'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }
        }else{
            System.out.println("Lutfen sifrenizi harf olarak giriniz");
        }
 }


}
