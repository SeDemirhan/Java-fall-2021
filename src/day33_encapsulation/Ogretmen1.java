package day33_encapsulation;

public class Ogretmen1 {

    private String isim;
    private String soyisim;
    private String brans;

    /*
    Bazen de yetkileri sınırlamak degilde yapılan işi dah iyi
    tanımlamak için encopsulation kullanılır

    Bu yaklasımı kullanan class larda tum variableler
    private yapılıp hepsi için getter ve setter olusturulur
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
