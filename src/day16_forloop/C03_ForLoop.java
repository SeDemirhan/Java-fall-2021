package day16_forloop;

public class C03_ForLoop {
    public static void main(String[] args) {
        //Soru 2 )
        //10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda
        //yazdirin

        int bas=10;
        int son=30;

        for (int i = 10; i <=son ; i++) {
           if (i<son){
               System.out.print(i+",");
           }else {
               System.out.println(i);
           }

        }
    }
}
