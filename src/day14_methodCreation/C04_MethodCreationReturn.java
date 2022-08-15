package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        //Verilen isim ve soy ismi ilk harfi büyük
        //geriye kalanları * olacak sekilde degistirip
        // bize bu halini döndüren bir methot olusturun
        //not: programın ilerleyen kısımlarında isi ve soyisimi bu şekilde kullanmak istiyoruz

        String isim = "Enes";
        String soyIsım = "Bozkurt";

        String gizliIsim = isimGizle(isim, soyIsım);

        System.out.println(isim+" "+soyIsım);
        System.out.println(gizliIsim);
    }

    public static String isimGizle(String isim, String soyIsım) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsım=soyIsım.substring(0,1).toUpperCase()+soyIsım.substring(1).replaceAll("\\w","*");

        return isim+" "+soyIsım;
    }
}
