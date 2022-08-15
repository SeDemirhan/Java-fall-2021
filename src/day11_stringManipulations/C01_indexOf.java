package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        //Verilen bir stringde Herhangi bir string veya char ın ilk kullanıldığı indexi bize döndürür.

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1

        System.out.println(str.indexOf("mek")); //10

        // Eger istediğimiz indexden sonrasını kontrol etmek istersek ozaman aynı methodu
        // iki parametreli olarak kullanabilirin

        System.out.println(str.indexOf("g" ,(6+1))); // yazılan indexden baslar

        // yukarıdaki str da 2. ve 3. e nin indexlerini bulun
        // 2. e yi bulabilmek için 1. e nin indexine ihtiyacım var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        // eger 2. e varsa 3. enin olup olmadığını ve varsa indexini yazdıralım

        if (ikincie==-1){
            System.out.println("verilen str da 2. e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str da 3. e yok");
            }else {
                System.out.println("verilen str da 3.index : " + ucuncue);
            }
        }


    }
}
