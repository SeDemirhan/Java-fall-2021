package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {

        /*
        bir if statement inde { kullanılmazsa java ilk satırı sart ile bağlar
        sonraki satırlar bağımsız olur

        Eger birden fazla satır if sartına bağlanmışsa mutlaka { kullanmalıyız
         */
        int sayi=23;

        if (sayi>0)
            System.out.println("sayı pozitif"); // degere bağlı
            System.out.println("pozitif kalacaktır"); // herzaman calısır


        if (sayi%2==0)
            System.out.println("sayı cift");// degere bağlı
            System.out.println("cift kalacaktır");// herzaman calısır

        if (sayi%5==0)
            System.out.println("sayı 5 in katı");// degere bağlı
            System.out.println();

    }


}
