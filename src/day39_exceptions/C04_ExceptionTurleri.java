package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args)  {


        String str;
        /*
        System.out.println(str);
        deger ataması yapmadan yazdırırken compile time da java bunu farkeder
        ve izin vermez

         */
        str=null;
        //System.out.println(str.length());
        // NullPointerException

        Object obj="Java Java";
        Integer sayi=(Integer) obj;



    }
}
