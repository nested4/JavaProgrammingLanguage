package day53_ExceptionAndCollection_Summary;

public class Insan implements Baba,Ogretmen {

    @Override
    public void ogutVer() {
        System.out.println("İyi arkadaşlar edin");
    }

    @Override
    public void harclikVer() {
        System.out.println("Harçlık verildi");
    }

    @Override
    public void egitim() {
        System.out.println("java eğitimi verir");
    }

    @Override
    public void sınavYap() {
        System.out.println("Arada quiz yapar");
    }

    public void yemekYe(){
        System.out.println("Yemek yiyor");
    }
    public void uyu(){
        System.out.println("uyuyor");
    }


}
