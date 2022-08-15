package day04_dataCasting;

public class C04_explicitNarrowing {
    public static void main(String[] args) {

        int sayı1=50;
        byte sayı2=(byte) sayı1;

        /*
        Geniş data turundeki degeri dar data turundeki veriable turune atamak isterseniz
        java sizin genis data turundeki degerin dar data turunun sınırlarına uyup uymayacağını
        bilemez ama java risk almaz
        Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler
        bunun için degerin onune parantez içerisinde istediğimiz data turunu yazmamız yeterlidir

        Bu riski ustlendiğimizde 3 durum olusur
        1- bizim degerimiz dar kalıp degerlerine uygun olursa hiçbir kayıp olmadan cast olur
        2- double bir sayıyı integer a cast etmek gibi durumlarda data kaybı yasanabilir
        3- geniş kalıptan degeri dar kalıba koyduğunuzda sınırları asan durumlarda veri baskalasabilir
        (int sayı=132;
        byte sayı2= (byte)sayı ---> -124 olur gibi)
         */
    }
}
