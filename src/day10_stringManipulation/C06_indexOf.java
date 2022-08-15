package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok kolay";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//-1


        String str5="dsöjfnajkrfaerlfaldsgnsmngkaldmfgŞLSMFGALMGFLADMFLAMDLSŞXCVMZlkdfv";

        //str5 de p harfi var mıdır?

        if (str5.indexOf("p")==-1){
            System.out.println("str5 de p harfi kullanılmamış");
        }else {
            System.out.println("str5 de p harfi kullanılmıs");
        }

    }
}
