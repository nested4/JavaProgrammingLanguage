package day41_EncapsulationAndStatic;

import java.util.Random;

public class BankaMusteri {
   private String adSoyad;
  private   String hesapNo;
   private double bakiye;
    private static int count=1;
    //static double evFaiz=1.66;
    static private final String SIFRE="şafak";

    {
        this.hesapNo=hesapNoOlustur();
    }

    public BankaMusteri(){}

    public BankaMusteri(String adSoyad){
        this.adSoyad=adSoyad;}

    public BankaMusteri(int bakiye){
        this.bakiye=bakiye;}

    public BankaMusteri(String adSoyad,double bakiye){
        this.adSoyad=adSoyad;
        this.bakiye=bakiye;}

    public String getAdSoyad() {
        return adSoyad;}

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }
    public void setHesapNo(String hesapNo,String sifre){
        if(sifre.equals(SIFRE)){
            this.hesapNo=hesapNo;
        }
    }


    public double getBakiye() {
        return bakiye;
    }

   public void paraEkle(double para){
        this.bakiye=this.bakiye+para;
   }
    public void paraCek(double para){
         if(this.bakiye>para){
            this.bakiye=this.bakiye-para;
         }
    }


    public static String hesapNoOlustur(){
        Random random=new Random();
        int x= random.nextInt(9000)+1000; //1000-9999
     String hesapNo=count+""+2023+x;
         count++;
     return  hesapNo;
    }




}
