package day35_inheritancedeContructorKullanimi;

public class AGrandParen {

    protected String isim="Grandpa ismi belirtilmedi";

    /*
    Her class da görünmesede bir contructor vardır
    Bu classdan obje olusturmak istediğimizde defoulr cons. devreye girecek

    Defoult cons.u gözlemleyemeyecegimiz için onun yerine kullanılabilecek
    parametresiz cons.olusturalım
     */
    protected String granDpaKlupAdı="Grandpa Klubu";
    AGrandParen(){
        System.out.println("AGrandParenT cons. calıstı");
    }
}
