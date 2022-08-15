package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cümle="Java cok kolay, Java cok guzel";
        String kelime="Java";


        int kelimeIlkIndex=cümle.indexOf(kelime);
        int kelimeSonIndex=cümle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cümlede kullanılmamış");
        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cümlede 1 kere kullanılmış");
        }else {
            System.out.println("verilen kelime cümlde birden çok kullanılmış");
        }
    }
}
