package day32_strinBuilder;

public class C02_Appent {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("Java daha ne yapsın");

        sb.append("?");
        System.out.println("sb = " + sb);//sb = Java daha ne yapsın?

        //appent istediğimiz Stringi en sona ekler

        sb.insert(4," her şeyi düşünmüş");
        System.out.println("sb = " + sb); //sb = Java her şeyi düşünmüş daha ne yapsın?

        //araya ekleme yapmak istediğimizde appent degil insert kullanmalıyız


    }
}
