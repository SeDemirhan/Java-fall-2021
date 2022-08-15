package day32_strinBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Serdar");

        sb.substring(0,3);
        // Bu method String dondurdugu icin StrinBuilderin eski halini değiştirmez
        System.out.println(sb);//Serdar

        sb.subSequence(0,3);
        System.out.println(sb);////Serdar




    }
}
