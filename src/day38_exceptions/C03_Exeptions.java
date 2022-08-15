package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exeptions {
    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir array de tuttugumuz varsayalım
        kullanıcıya index sorup o indeksdeki urunu yazdıran bir program yazalım

        kullanıcı urun sayısından buyuk bir index girerse exception vermesinin önüne gecelim
         */

        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Fındık"};

        Scanner scan=new Scanner(System.in);
        System.out.println("İstediginiz urunun sıra nosunu gir");
        int istenenSira=0;

        try {
            istenenSira=scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("urun indexi için tam sayı gir");
        }
        /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */

        try {
            System.out.println("aradıgınız urun : " + urunler[istenenSira-1]);
        } catch (Exception e) {
            System.out.println("girdigin sıra listemizde bulunmuyor");
        }

    }
}
