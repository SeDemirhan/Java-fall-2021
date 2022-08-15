package day12_stringManipulations;

public class C02_relaceAll {
    public static void main(String[] args) {

        String str="1Bug2u3n Ja*va- cok g3uz/el";

        // strı "Bugun Java cok guzel" haline getir
        // replaceAll() deki All ın amacı aynı özellikteki tüm karakterleri kapsamasıdır
        // Bütün sayıları sil ve özel karakterleri sil

        // Tüm özel karakterleri silelim dediğimizde speceler de siliniyor
        //Spaceleri korumak için en basta onların yerine cumlede bulunmayacak bir string koyalım
        //"qazwsx"

        str=str.replace(" ", "qazwsx");
        str=str.replaceAll("\\W","");
        System.out.println(str); //1Bug2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        //istenmeyen özel karakterler ve sayılardan kurtulduk
        //şimdi space leri geri getirelim

        str=str.replaceAll("qazwsx"," ");
        System.out.println(str);


    }
}
