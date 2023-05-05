package day43_InheritanceAndAccesKeywords;

public class Motorcycle extends Vehicle {
   private int cc;



   public Motorcycle(){}
    public Motorcycle(int cc){
       this.cc=cc;
    }

    public void start(){
        System.out.println("Motor çalıştı");
    }

    public static Motorcycle motorsikletOlustur(int cc){
       Motorcycle motorcycle=new Motorcycle(cc);
       return motorcycle;
    }


    public void changeCc(int yeniCc){
        cc=yeniCc;
    }
    public int getCc(){
        return cc;
    }
}
