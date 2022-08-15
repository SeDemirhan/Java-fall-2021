package day32_strinBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("JavaCandır");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//27

        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//10

        sb1.append("Java");
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//16

        sb1.append(" Candır");
        System.out.println(sb1.length());//11
        System.out.println(sb1.capacity());//16

        sb1.append(", bilen biler.");
        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity());//35(16*2)+2
    }
}
