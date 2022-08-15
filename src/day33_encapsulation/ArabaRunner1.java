package day33_encapsulation;

import day26_constructor.Araba;

public class ArabaRunner1 {
    public static void main(String[] args) {

        Araba1 arb1=new Araba1();
        //arb1 objesi üzerinden marka variablesine ulasabildim,
        //degistirebildim(set) ve yazdırabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //acces modifier kullanarak marka variablesine ulasımı
        //tamamen serbest yapabilir veya tamamen engelleyebilirim
        //private yaptıgımız modele ise hiç ulaşamayız
        //yani access modifier yap hep ya hiç diyor

        //model i değiştirelim ama göremeyelim
        //yakıtı da görelim ama degistiremeyelim

        //set ve get yetkilerini özel olarak tanımlama isterseniz
        //1. adım : özel yetki tanımlayacağınız variableleri private yapın
        //          private bir dataya baska class lardan ulasmak mümkün olmadığından
        //2.adım: set yetkisi için setter, get yetkisi için getter methodları olusturalım


        arb1.setModel("Corolla");//model olarak suprayı atadık
        //modeli yazdırma imkanımız yok, cunku getter yok
        System.out.println(arb1.getYakit());//elektrikli bilgisini görebildik
        // yakıtı degistiremeyiz cunkü setter methodu yok
    }
}
