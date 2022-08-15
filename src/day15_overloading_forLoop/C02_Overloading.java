package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        Javada olusturdugumuz methodların isminin yaptıgı islev ile uyumlu olmasını isteriz.
        Mesala bir stringin bir bölümünü almak için 2adet substring()
        Verilen Stringdeki bazı parcaları yenileri ile değistirmek için 2 adet replace() var.

        java aynı isimde birden fazla method varsa hangisinin kullanılacağına parametre sayısı ve
        parametrelerin data türüne göre karar verir.
         */



        String str="Bu java öğrenilecek";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replaceAll("j","h");

        /* Aynı isimde ama farklı methodları olusturmak icin degistirebilecemiz şeyler
            1-parametre sayısı
            2-aynı sayıda parametreye sahip olsa bile parametrelerin data turlerini
            3-aynı sayıda ve aynı data turunde paremetleri olan methodlarda parametrelerin sıralanısı

         */
    }
}
