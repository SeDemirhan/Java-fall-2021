package day06_concatenation;

public class C02_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";
        int sayı1=5;
        int sayı2=4;

        System.out.println(str1+" "+str2+" "+ sayı1+sayı2); // Java Güzeldir 54
        System.out.println(str1+" "+str2+" "+(sayı1+sayı2));// Java Güzeldir 9
        System.out.println(sayı1+sayı2+" "+ str1); //9 Java
        System.out.println(""+sayı1+sayı2+" "+str2); //54 Güzeldir

        System.out.println(str1.concat(str2)); //JavaGüzeldir
        System.out.println(str1.concat(" "+str2));
    }
}
