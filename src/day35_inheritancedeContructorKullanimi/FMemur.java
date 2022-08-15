package day35_inheritancedeContructorKullanimi;

public class FMemur extends EMuhasebe{

    /*
    extends keyyword kullanılan classlarda ister defoul cons.bulunsun
    istersek de biz yeni cons.lar olusturalım Java cons.ın ilk satırına
    süper(); cons.call yazar.

    super(); cons.call defoult cons.a benzer. Görünmese de orada vardır
    ve calısır ancak biz ilk satıra farklı bir cons.call yazarsak
    Java super cons.u siler

    Eger biz mudahale edip kendi cons.umuzu olusturmazsak
    javanın defoult olarak olusturdugu cons. parametresizdir
    yani super();
     */

    FMemur(){

        System.out.println("FMemur parametresiz cons.");
    }
    FMemur(String isim){

        System.out.println("FMemur parametreli cons.");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();
    }




}
