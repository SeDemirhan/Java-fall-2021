package day31_timeFormatter_varargs;

public class C05_VarargsParametreileKullanma {
    public static void main(String[] args) {


        enUzunKelimeyiYazdir(5,"Ali","Ayse","Serdar","Ahmet","Selim");
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
