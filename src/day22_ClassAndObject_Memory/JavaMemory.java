package day22_ClassAndObject_Memory;

public class JavaMemory {



    public static int variable(int x,int y){

        for (int i = 0; i < 5; i++) {
          int a=  (i+=5);
        }
       // System.out.println(a);
       int z=x+y;
       return z;

    }

    public static void main(String[] args) {
      /* CarNew car1=new CarNew();
       car1.marka="şahin";

        CarNew car2=new CarNew();
        car2.marka="honda";
        car1=null; //@sda12231213
        System.out.println(car1.marka);
        //== operatörü referansları karşılaştırır
        // equals() dataları karşılaştırır
/*
        String str=new String();
        str="harun";
        String str2;
        str2="harun";
        System.out.println(str==str2);
*/


        Daire2 daire1=new Daire2();
        daire1.r=15;
        Daire2 daire2=new Daire2();
        daire2.r=daire1.r;


       // daire1=daire2;
      //  System.out.println("daire1.r = " + daire1.r);

    }
}
