package day41_EncapsulationAndStatic;

import java.util.Scanner;

public class Car {

    String marka;
    int modelYil;
  private  int begir;
 private String saseNo;
    boolean isSuv;
    boolean isManual;
    private final String sifre="harun";
    static  int tekerlekSayisi=4;


   public String getSaseNo(){
       return this.saseNo;
   }

   public int getBegir(){
       return this.begir;
   }
   public void setBegir(int begir){
     if(begir<100&&isSuv==true){
         return;
     }
     this.begir=begir;
   }




   public void setSaseNo(String yeniSaseNo){
       Scanner scan=new Scanner(System.in);
       System.out.print("Şifre:");
       String sifre=scan.nextLine();
       if(sifre.equals(this.sifre)){
           saseNo=yeniSaseNo;
           System.out.println("işlem başarılı");
           return;
       }
       System.out.println("Hatalı şifre nedeniyle şifreniz değiştirilemedi.");
}

    public Car(){
        System.out.println("Merhaba objeniz başarılı bir şekilde oluşturuldu");
    }
    public Car(String marka){
        this();
        this.marka=marka;

    }
    public Car(String marka,int modelyil){
        this(marka);
        this.modelYil=modelyil;

    }
    public Car(String marka,int modelyil,int begir){
        this.marka=marka;
        this.modelYil=modelyil;
        this.begir=begir;
    }
    public Car(String marka,int modelyil,int begir,String saseNo){}
    public Car(String marka,int modelyil,int begir,String saseNo,boolean isSuv){}
    public Car(String marka,int modelyil,int begir,String saseNo,boolean isSuv,boolean isManual){
        this.marka=marka;
        this.modelYil=modelyil;
        this.begir=begir;
        this.saseNo=saseNo;
        this.isSuv=isSuv;
        this.isManual=isManual;

    }
    public  int getTekerlekSayisi(){
       return tekerlekSayisi;

    }



    public String begirKarsilastir(){
        if(begir>100){
            return "Güçlü Araç";
        }
        return "Zayif araç";
    }




}