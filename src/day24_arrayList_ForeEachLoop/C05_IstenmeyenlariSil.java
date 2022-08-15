package day24_arrayList_ForeEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenlariSil {
    public static void main(String[] args) {
        //verilen bir arrayde istenmeyen harf içeren kelimeleri silip
        //kalan elemetleri yeni bir array yapın

        String[] sehirler={"İstanbul","Ankara","Mersin","Konya","Bayburt"};
        String istenmeyenHarf="r";

        List<String>kalanlar=new ArrayList<>();

        for (int i = 0; i <sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        // loop bittiğinde istenmeyen harf içermeyen şehirler listeye eklenmis olacak
        System.out.println(kalanlar);//list olarak yazdırdı

        // yeni bir array olusturup listeyi ona aktaralım

        String[]kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
        }
        //sehirler arrayinn yeni degerini atayalım,
        sehirler=kalanlarArrayi;

        System.out.println("sehirler arrayinin son hali : " + Arrays.toString(sehirler));//array olarak yazdırdı




    }
}
