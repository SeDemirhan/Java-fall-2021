package odevler;

public class day12_S1 {
    public static void main(String[] args) {

        //Soru1 String methodlarini kullanarak Java ogrenmek 123 Cok guzel@ i “Java
        //ogrenmek cok guzel." sekline getirin

        String input="Java ogrenmek 123 Cok guzel@";


        input=input.replaceAll("\\d","").replace("@",".");
        input=input.toLowerCase();
        input=input.replaceFirst("\\D","J");

        System.out.println(input);
    }
}
