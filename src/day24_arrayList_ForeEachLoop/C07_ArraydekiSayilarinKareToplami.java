package day24_arrayList_ForeEachLoop;

public class C07_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {

       /*
        Soru 2:
         Bir integer array olusturunuz ve bu array’deki tum sayilarin karesinin toplamini
         For-each loop kullanarak bulun Sonucu ekrana yazdiriniz.
        */

        int[] sayilar={2,3,4,1,5,6,5,4,3};

        int toplam=0;

        for (int each : sayilar
             ) {
            toplam+=each*each;

        }
        System.out.println(toplam);



    }
}
