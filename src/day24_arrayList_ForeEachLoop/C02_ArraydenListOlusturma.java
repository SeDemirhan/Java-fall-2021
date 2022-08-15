package day24_arrayList_ForeEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random();
        int sayı=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){

            sayı= rnd.nextInt(1000);

            if (!sayiListesi.contains(sayı)){
                sayiListesi.add(sayı);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMi){
            System.out.println("sayı tahmin et");
            sayı=scan.nextInt();

            if (sayiListesi.contains(sayı)){
                System.out.println("bildin"+" "+tahminSayisi+" "+"adet tahminde listeden sayı buldun");
                bildiMi=true;
            }else {
                System.out.println(tahminSayisi+" "+"adet sayı yazdınız ama hiçbiri listede yok");
                tahminSayisi++;
            }
        }
    }





}
