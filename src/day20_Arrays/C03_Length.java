package day20_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        // İki şekilde array olusturabiliriz
        int sayılar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayılar array in uzunlugunu yazdır : "+sayılar.length);//3
        //String length () methodunda parantez var, array de yok

        System.out.println("harfler array inin uzunlugu : "+ harfler.length);//4
        System.out.println(Arrays.toString(harfler));

        // harfler elementinin son elementini yazdıralım
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); //ArrayIndexOutOfBoundsException


    }
}
