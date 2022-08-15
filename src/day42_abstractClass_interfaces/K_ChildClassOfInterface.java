package day42_abstractClass_interfaces;

public class K_ChildClassOfInterface implements I02_Interfaces,I03_Intefaces{

    /*
    bir class ı bir ınterface e child yapmak içim imlement keywordu kullanılır
    implements dedikten sonra virgül yazarak istediğimiz kadar interface ekleyebiliriz


     */

    public static void main(String[] args) {
        System.out.println(I03_Intefaces.SAYI);
        System.out.println(I02_Interfaces.SAYI);
        System.out.println(ISIM);
    }

    @Override
    public void yakit() {

    }
}
