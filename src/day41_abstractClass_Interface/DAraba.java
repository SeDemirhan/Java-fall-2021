package day41_abstractClass_Interface;

public abstract class DAraba {

    public static void main(String[] args) {

        /*
        abstract classda main method opsiyoneldir.
        eger abstract class sadece child classların
        tasımak zorunda oldugu özellikleri belirlemek için olusturulduysa
        main methoda ihtiyac olmaz
        sadece abstract methodlar olur

        ama bir abstract methodda standatr belirlemek dısında da metodlar calısabilir
        bu durumda ihtiyac olursa main method olusturulabilir
         */

    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();



    /*
    sadece child classların mecburi tasıyacakları özellikleri belirleyen methodlar
    abstract method olur ve abstract methodların bodysi olmaz.
     */

    public void klima(){
        System.out.println("Bazı arabalarda klima olabilir");

       /*
       abstract olmayan methodlara concrete method denir
       abstract bir methodu abstract keyword ile belirlemek zorunludur
       conrete methodlarda bunun declare edilmesine gerek yoktur
       biz sadece abstraction ile ilgili koustugumuzda abstract olmayan
       methodlardan bahsetmek için conrete tabiri
       kullanırız

        */







    }
}
