package day36_inheritanceDataTypeKullanimi;

import day34_Inheritance.Isci;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dişci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci(){

        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){

        System.out.println("Isciler %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new Dişci();

        /*
        Bir obje olustururken data turu ve cons. aynı classdan ise
        direkt o class a gidiyorduk

        Eger data turu ve cons. farklı ise
        obje cons.un oldugu classın objesidir
        ancak,bizden istenen Isci classındaki spesifik özellikler degil
        bir iscinin muhasebe classındaki tum calısanlarla beraber sahip oldugu
        genel ozellikleri istiyoruz

         */
        System.out.println(isc1.gunlukMesai); //M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minumum : 2400 maas alir
        isc1.ozelSigorta();// M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departmant);// P


    APersonel isc2 = new Dişci();
    //System.out.println(isc2.gunlukMesai); // M 8
    //System.out.println(isc2.saatUcreti); // M 10
    //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.maas();
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departmant);// P
    /*
     Eger Data turu olan class'da aradigimiz ozellik yoksa
     varsa onun parent'ina gidebilir
     ama child'a donus olmaz
     Aradigi ozelligi bulamazsa CTE verir
     */
        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */
    }

}



