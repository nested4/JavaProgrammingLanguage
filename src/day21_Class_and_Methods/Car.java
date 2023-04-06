package day21_Class_and_Methods;

public class Car {

    String marka;
    int modelYil;
    int begir;
    String saseNo;
    boolean isSuv;
    boolean isManual;


    public void  hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String begirKarsilastir(){
        if(begir>100){
            return "Güçlü Araç";
        }
        return "Zayif araç";
    }




}
