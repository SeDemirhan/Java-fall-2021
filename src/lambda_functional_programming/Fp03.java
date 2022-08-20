package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaratereGoreTekrarsizYazdirma(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        System.out.println();
        //baslangiciAyadaSonuNOlaniSil(liste);

        //uzunlugu8ile10Araive0IleBiteniSil(liste);

        //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
        System.out.println("uzunlugu 12en az mı? : " + uzunluguOnikidenAzMi(liste));
        System.out.println("xXile baslamıyor mu ? :" + xIleBaslamiyorMu(liste));
        System.out.println("rIleBitenVarMi(liste) = " + rIleBitenVarMi(liste));


    }
    public static void buyukHarfleYazdir(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);//Comparator.comparing:Sıralama kosulunu belirtmek için kullanılır
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);//Comparator.comparing:Sıralama kosulunu belirtmek için kullanılır
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaratereGoreTekrarsizYazdirma(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //5) Elemanları önce uzunluklarına göre ve sonra
    // ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                ////thenComparing() :==>siralam icin ikinci kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    /*
    public static void bestenBuyukleriSil(List<String>list){
        list.removeIf(t->t.length()>5);
        System.out.println(list);
        ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden yorum yapıyorum.
    }

     */

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
/*
    public static void baslangiciAyadaSonuNOlaniSil(List<String>list){
        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(0)=='N'||t.charAt(0)=='n');
        System.out.println(list);
        ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden yorum yapıyorum.
    }

 */
//8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    /*
    public static void uzunlugu8ile10Araive0IleBiteniSil(List<String>list){
        list.removeIf(t->(t.length()>7 && t.length()<11) ||t.endsWith("o"));
        System.out.println(list);
    }
    ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden yorum yapıyorum.
     */

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunluguOnikidenAzMi(List<String>list){
        return list.stream().allMatch(t->t.length()<12);
    }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String>list){
        return list.stream().noneMatch(t->t.startsWith("X"));


    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi(List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));

    }

}
