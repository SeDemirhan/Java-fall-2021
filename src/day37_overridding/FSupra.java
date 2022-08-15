package day37_overridding;

public class FSupra extends EToyota{

    void yakıt(){
        System.out.println("Supra benzin kullanır");
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz
        CTE verir
        @Override notasyonu kullanmak mecburi degildir
        Eger Overridding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */
        System.out.println("Sırali 6 silindir 2JZ kullanır");
    }
}
