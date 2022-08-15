package day04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {

        char harf='a';
        char yeniHarf=(char) (harf+1);
        System.out.println("yeniHarf = " + yeniHarf);

        /*
        Bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        Bunlardan bazisini Java otomatik olarak kabul eder
        Java eger bu deger atamasinda sorun olusacagini
        (data kayiplarin olabilecegi veya datanin baskalasabilecegi) gorurse
        bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */

        int sayı1=(int)7.3;
        System.out.println("sayı1 = " + sayı1);

        double sayı2=10;
        System.out.println("sayı2 = " + sayı2);
        int sayı3='c';
        System.out.println("sayı3 = " + sayı3);
        char harf2=98;
        System.out.println("harf2 = " + harf2);
    }
}
