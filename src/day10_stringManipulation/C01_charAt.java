package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi döndürür J

        System.out.println(str.toUpperCase().charAt(7)); //R

        System.out.println(str.charAt(21)); //L

        //System.out.println(str.charAt(22)); //StringIndexOutOfBoundsException
        //son harfi bulmak için str ın uzunlugunun bir eksiğini index olarak gireriz
        // eger index olarak uzunluğu veya daha büyük bir sayıyı girersek java exception verir


        //char() kullandığımızda sonuc char olacağı için artık manipulation yapamayız
        // Strin methodlarından kullanmamız gereken bir method varsa char() den once kullanmalıyız
    }
}
