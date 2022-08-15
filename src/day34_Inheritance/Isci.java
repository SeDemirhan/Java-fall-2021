package day34_Inheritance;

public class Isci extends Personel{

    //Normal hayatımızda parent, cocuk sahibi olmaya karar verebilir
    //Javada ise child classlar özelliklerini inherit etmek istedikleri
    //classı kendilerine parent edinilirler

    //Mesala işçi classını olusturunca nelere ihtiyacı var diye dusunsek
    //Personel classındaki variable ve methodlara ihtiyacı oldugunu görebiliriz
    //Budurumda yeniden variable ve methodları olusturmak yerine
    //personel clasını kendimize parent edinebiliriz

    //Birclassı parent edinmek için extends keyword kullanmalıyız

    /*
    Bir class baska bir classı parent edindiğinde
    1-parent classdaki tüm ozelliklere otomatik olarak sahip olur
    2-parent classdaki özelliklerden bazılarını kendine uyarlayabilir
    3-parent class da olmayan bazı yeni özellikler olusturabilir

    not:parent classlardaki özelliklerden hicbirini reddedemez ama
        degistirebilir
     */

    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); //Isim belirtilmedi
                                        //kendi classımızda yok parent classtan alır
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 (kendi classımızda varsa onu kullanırız
                                         //parent e gitmez

        isci1.maas();//isciler min. 15 euro saat usreti alır

    }

    public void maas(){
        System.out.println("isciler min. 15 euro saat usreti alır");
    }

    public void ozelSigorta(){
        System.out.println("iscilerden isteyene %50 indirimli özel sigorta yaptırılır");

    }







}
