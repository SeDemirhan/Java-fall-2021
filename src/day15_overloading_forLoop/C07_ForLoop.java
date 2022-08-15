package day15_overloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        // 100 den 1 e kadar 8 ile bölünebilen sayılar

        for (int i = 100; i >=0 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }

        }
    }
}
