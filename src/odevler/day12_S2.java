package odevler;

public class day12_S2 {
    public static void main(String[] args) {
        //Soru2
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //String str 1 $13.99
        //String str 2 $10.55
        //ipucu
        //Double parseDouble() methodunu kullanabilirsiniz

        String fiyat1="$13.99";
        String fiyat2="$10.55";

        fiyat1=fiyat1.replace("$","");
        fiyat2=fiyat2.replace("$","");

        Double sayi1=Double.parseDouble(fiyat1);
        Double sayi2=Double.parseDouble(fiyat2);

        System.out.println("toplam : "+"$"+(sayi1+sayi2));

    }
}
