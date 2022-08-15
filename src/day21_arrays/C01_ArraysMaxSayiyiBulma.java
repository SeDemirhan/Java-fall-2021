package day21_arrays;

public class C01_ArraysMaxSayiyiBulma {
    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxsayiyiYazdir(sayilar);
    }

    private static void maxsayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }
        System.out.println(maxSayi);

    }
}
