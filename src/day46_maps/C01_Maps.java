package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sınıfList=new HashMap<>();

        sınıfList.put(101,"Ali, Can, JDev");
        sınıfList.put(102,"Enes, Cem, Tester");
        sınıfList.put(103,"Serdar, Demirhan, JDev");
        sınıfList.put(104,"Selim, Demirhan, Tester");

        System.out.println(sınıfList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Serdar, Demirhan, JDev, 104=Selim, Demirhan, Tester}

        System.out.println(sınıfList.keySet());//[101, 102, 103, 104]
        System.out.println(sınıfList.values());//[Ali, Can, JDev, Enes, Cem, Tester, Serdar, Demirhan, JDev, Selim, Demirhan, Tester]
        System.out.println(sınıfList.values().size());//4

        //Tum ogrencilerin isim ve soyisimlerini alt alta yazdır

        Collection<String> tumValueColl=sınıfList.values();
        String[] eachArr;
        int sıra=1;

        for (String each:tumValueColl) {

            eachArr=each.split(", ");
            System.out.println(sıra + "- "+ eachArr[0]+" "+eachArr[1]);
            sıra++;

        }

        // map de bulunan öğrencilerin isim ve soy isimlsrini birlestirerek
        //bir sınıf listesi olusturun

        List<String>sınıfİsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl) {

            eachArr=each.split(", ");
            sınıfİsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);

        }
        System.out.println(sınıfİsimSoyisimList);



    }
}
