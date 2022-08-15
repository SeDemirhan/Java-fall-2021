package day40_final;

public abstract class CAbstract {

    void toplama(){
        System.out.println("Bumethod toplama yapar");
    }

    abstract void carpma();
    /*
    Bir methodun basına abstract yazarsanız bu methodun child claslar için bir standart
    oldugunu declare ederiz
    ve method bods,ne ihtiyac kalmaz
     */

    abstract void bolme();

     void cıkarma(){
         System.out.println("Bumethod cıkrma yapar");
     }

}
