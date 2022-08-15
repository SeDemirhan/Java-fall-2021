package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 5678 1234 6789";

        System.out.println(isim.substring(3));//eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//son üç harfi-fil
        System.out.println(isim.substring(2,4));//le

        // isim ve soyismin ilk harfi büyük, geriye kalan yıldız
        // kredi kartın ilk 4 rakamı görünsün geriye kalan yıldız

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyaKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlkDort=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyaKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+" "+
                kkIlkDort+kkGeriyeKalanlar);

    }
}
