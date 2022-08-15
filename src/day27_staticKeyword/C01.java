package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        class level da iki tur variable olusturabiliriz
        static (class) variable
        instance (obje) variable

        Static variableler tum classdan kullanılabilirken
        instance olanlar sadece static olmayan methodlardan darekt kullanılabilir
        intance variablelere static methodlardan ulasmak istersek obje olusturmamız gerekir


        intance variableler obje variablesi oldugu için herhangi bir satırda intance
        variablenin degerinin ne oldugunu bulmak için OBJE OLUSTURULAN satırdan itibaren cod incelenmelidir

        static variableler clas variable oldugu için herhangi bir satırda
        static variablenin degerini bulmak için CLASSIN BASINDAN itibaren kod incelenmelidir

         */

        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri : " + obj1.rakam); // 5
        System.out.println("obj1 in sayı degeri : " + obj1.sayi); // 10

        obj1.rakam+=1; // 5+1=6
        sayi+=1; // 10+1=11

        System.out.println("1 artırdıktan sonra obj1 in rakam degeri : " + obj1.rakam); // 6
        System.out.println("1 artırdıktan sonra obj1 in sayı degeri : " + sayi); // 11

        C01 obj2=new C01();

        System.out.println("obj2 in rakam degeri : " + obj2.rakam); //5
        System.out.println("obj2 in sayı degeri : " + obj2.sayi); //11

        obj2.rakam++;//5+1=6
        obj2.sayi++;//11+1=12

        System.out.println("1 artırdıktan sonra obj2 in rakam degeri : " + obj1.rakam); // 6
        System.out.println("1 artırdıktan sonra obj2 in sayı degeri : " + sayi); // 12

    }
}
