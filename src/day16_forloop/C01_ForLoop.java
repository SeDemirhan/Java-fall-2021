package day16_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //verilen bir pozitif tam sayının tam bölenlerini yazdır

        int input=20;

        for (int i = 1; i <=20 ; i++) {
            if (input%i==0){
                System.out.print(i+" ");
            }

        }

    }
}
