package day40_final;

final public class B extends A{

     public static void main(String[] args) {

        B obj=new B();
        obj.isim="Alp";
        //obj.okul="Java Koleji";

        System.out.println(A.OKUL);

         /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */

    }

}
