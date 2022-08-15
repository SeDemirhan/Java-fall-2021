package day19_scope;

public class C02_StaticVariable {

    static int staticSyi=10;
    String isim="Serdar";

    static int degersizStaticVar;
    int dergersizIntanceVariable;

    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */

    public static void main(String[] args) {

         /*
       bir variable static olusturulduysa
       objeler icin degil class icin gecerlidir
        */

        System.out.println(staticSyi);
        staticMethod();
        staticSyi=12;
        System.out.println(staticSyi);
        C02_StaticVariable obje1=new C02_StaticVariable();
        obje1.staticOlmayanMethod();

        /*
         instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz
         Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */


    }

    public static void staticMethod(){
        System.out.println(staticSyi);
    }

    public void staticOlmayanMethod(){

         /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler
        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz
         */

        System.out.println(staticSyi);
        staticSyi=20;

    }
}
