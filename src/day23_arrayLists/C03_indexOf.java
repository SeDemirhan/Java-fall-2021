package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        //indexOf bilgi verir listeyi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram"));

        // index Of methodu urunu aramaya 0. indexden,
        //lastindexOf methodu ise aramaya son indexden baslar

        // arama bitip urun bulundugunda ikisi de bulunan urunun indexini verir
        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4

        System.out.println(urunler.indexOf("hobby"));//-1
        System.out.println(urunler.lastIndexOf("hobby"));//-1
    }
}
