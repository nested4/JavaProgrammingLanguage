package day41_EncapsulationAndStatic;

public class C02_MAIN {

    public static void main(String[] args) {
      Car car=new Car("Honda",1997,123,"harun123",true,false);
        Car car1=new Car("Mercedes",1997,123,"harun123",true,false);
        Car car2=new Car("audi",1997,123,"harun123",true,false);
        Car car3=new Car("hyundai",1997,123,"harun123",true,false);
      //  Integer sayi=new Integer(15);
        //"harun123"

      //  car.setSaseNo("Mehmet34");
       // System.out.println(car.getSaseNo());
        car.setBegir(80);
        System.out.println(car.getBegir());
        Car.tekerlekSayisi=100;
        System.out.println(car3.getTekerlekSayisi());
        System.out.println(car2.getTekerlekSayisi());
    }
}
