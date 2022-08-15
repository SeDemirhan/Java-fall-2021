package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

      /*
      remove methodu iki sekilde kullanılır
      1- objeyi yazıp silmesini istersek bize boolean sonuc doner true/false
      2- index girersek o indexdeki elemanı siler ver silinen elemanı dondurur
       */

        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));//true
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]
        System.out.println(urunler.remove("hobby"));//false
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]


        System.out.println(urunler.remove(1));//Cekirdek
        System.out.println(urunler);//[Nutella, Cay]

        // olmayan bir indexi silmeye calısırsak

        //System.out.println(urunler.remove(4));//IndexOutOfBoundsException




    }
}
