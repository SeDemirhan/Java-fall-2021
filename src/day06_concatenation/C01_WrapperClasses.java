package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        wrapper clas javanın hazır methodlarını kullanabilmemiz için primitive
        data turlerinin herbirinin actıgı classlardır

        int --> Integer
        char--> Character
        Diğerleri primitive data turu ile aynı sadece bas harfi buyuk
         */

        boolean guzelMi=true;
        //guzelMi. boolean primitive olduğundan hazır methodu yok.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768

        String ogrNo="12345";

        // kullanıcıdan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamaklı bir sifre giriniz");

        String sifre= scan.nextLine();

        Integer sifreSayı=Integer.parseInt(sifre);

        System.out.println(sifre);
        System.out.println(sifreSayı);
    }
}
