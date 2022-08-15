package day34_Inheritance;

public class ToyotaCorolla extends Toyota1{
    public static void main(String[] args) {

        /*
        child classdan parent class a erişimde acsess modifier kullarını
        bypass edemeyiz
        örnegin;parent classdaki
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.model);//Model belirtilmedi
    }
}
