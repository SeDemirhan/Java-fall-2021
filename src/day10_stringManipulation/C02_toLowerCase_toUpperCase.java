package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="beni psikopata bağlamayın";
        System.out.println(str.toUpperCase()); //BENİ PSİKOPATA BAĞLAMAYIN

        System.out.println(str.toUpperCase(Locale.FRANCE));

        /*
        Eger buyuk kucuk harf dönüşümünde local bir dili esas almak isterseniz
        Bu method kullanılabilir
         */
    }
}
