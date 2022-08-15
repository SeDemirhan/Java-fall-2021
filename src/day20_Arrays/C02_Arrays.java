package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayılar[]=new int[3];

        System.out.println(sayılar); //[I@511baa65

        // non prpmitiv turundeki dataları herzaman direkt yazdıramayabiliriz
        // Array i yazdırmak istersek Arrays classından yardım isteriz

        System.out.println(Arrays.toString(sayılar)); //[0, 0, 0]

        sayılar[2]=10;
        sayılar[0]=5;
        sayılar[1]=3;

        System.out.println(Arrays.toString(sayılar));

        String sınıfList[]={"Ali","Ayşe","Ahmet"};
        System.out.println(Arrays.toString(sınıfList));//[Ali, Ayşe, Ahmet]

        sınıfList[1]="Hasan";
        System.out.println(Arrays.toString(sınıfList));//[Ali, Hasan, Ahmet]

        System.out.println(sınıfList[1]);//Hasan







    }
}
