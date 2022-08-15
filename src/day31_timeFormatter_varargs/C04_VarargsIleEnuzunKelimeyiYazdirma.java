package day31_timeFormatter_varargs;

public class C04_VarargsIleEnuzunKelimeyiYazdirma {
    public static void main(String[] args) {
        
        
        enUzunKelimeyiYazdir("Ali","Ayse","Serdar","Ahmet");
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {
        
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
