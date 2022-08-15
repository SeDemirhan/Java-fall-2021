package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {

    public static void main(String[] args) {
         /*
    String mi yoksa StringBuilder mi daha hızlıdır?
    bunun için bir string olusturup, 1000 kere sonuna . ekleyelim
    öncesinde ve sonrasında zamanı alıp aradaki farkı bulalım

    aynı islemi string builder için yapalım
     */
        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";

        for (int i = 0; i <1000 ; i++) {
            str+=".";
        }

        LocalTime BİTİS=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(BİTİS);

        System.out.println("String zaman : "+(BİTİS.getNano()-baslangic.getNano()));
    }


}
