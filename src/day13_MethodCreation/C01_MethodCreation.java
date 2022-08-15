package day13_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen iki integeri toplayıp yazdıran methot olusturun
        
        int input1=10;
        int input2=20;
        
        // method 4 adımda olusturulur
        //1. adım==>method call
        //2.adım ==>argumant eklenmesi gerekiyorsa ekleyelim
        //          eger methodun return type void den farkılı olacaksa
        //          bir veriable olusturup method call ı assing edelim
        
        topla(input1,input2);
    }

    public static void topla(int input1, int input2) {
        //3.adım==>method deklarasyonunda degistirilmesi gereken bölümleri degiştir
        //         acces modifier,return type vb..)

        // 4.adım==> eger return type void dısında bir sey ise
        //           return keywor u ve donecek degeri hesaplamalıyız
        System.out.println("Girilen sayıların toplamı : "+ (input1+input2));
    }


}
