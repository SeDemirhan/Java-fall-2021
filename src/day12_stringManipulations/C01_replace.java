package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str="Bu gün hava cok gu zel";
        System.out.println(str.replace(" ",""));

        // hava yerine java yapalım
        System.out.println(str.replace("h","j").replace(" ",""));

        // guz el yerine harika

        System.out.println(str.replace("gu zel","harika"));

        // cümleyi reğlace kullanarak "Bugün Java cok guzel" yapalım

         str=str.replace("Bu gün","Bugün")
                .replace("hava","Java")
                .replace("gu zel","güzel");

        System.out.println(str);


    }
}
