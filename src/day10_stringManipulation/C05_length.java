package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ögren, isi kap";
        System.out.println(str.length());// str ın karakter sayısını döndürür 19
        System.out.println((str.charAt(str.length()-1))); //son karakter p
        System.out.println(str.charAt(str.length()-3));// sondan 3. karakter k

        /*
        javada null pointer (isaretleyici) bir deger degil, karşısına yazıldığı veriable nin
        hiçbir deger almadıgının işaretçisidir
         */

        String str2=""; // str2 ye bir deger atanmış mıdır? Evet
                        // bu deger nedir? Hiçlik
        System.out.println(str.length()); //0

        String str3=null;    // str3 ye bir deger atanmış mıdır? Hayır
                            // null bu deger atamamayı isaret etmektedir
        System.out.println(str3.length()); //NullPointerException



    }
}
