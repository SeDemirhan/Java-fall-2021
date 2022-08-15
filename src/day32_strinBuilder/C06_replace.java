package day32_strinBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");

        System.out.println(sb.replace(5, 10, "Up"));//Calm Up

        System.out.println(sb.replace(4, 5, "---"));//Calm---Up

        System.out.println(sb.replace(4, 7, " "));//Calm Up

        System.out.println(sb.replace(5, 7, "down"));//Calm down
    }
}
