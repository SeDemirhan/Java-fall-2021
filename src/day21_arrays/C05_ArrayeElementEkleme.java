package day21_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sınıfList={"Ala Can"};
        String eklenecekIsim="Murat";

        System.out.println(Arrays.toString(sınıfList));

        sınıfList=elemanEkle(sınıfList,eklenecekIsim);
    }

    public static String[] elemanEkle(String[] sınıfList, String eklenecekIsim) {
        String[] yeniSinıfListesi=new String[sınıfList.length+1];
        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i < sınıfList.length ; i++) {
            yeniSinıfListesi[i]=sınıfList[i];
            // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim

        }
        yeniSinıfListesi[yeniSinıfListesi.length-1]=eklenecekIsim;

            // son index'e ise eklenecek ismi atadim




        return yeniSinıfListesi;
    }
}
