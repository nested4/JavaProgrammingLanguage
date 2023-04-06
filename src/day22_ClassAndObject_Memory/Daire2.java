package day22_ClassAndObject_Memory;

public class Daire2 {

   double r;
   static double pi=5;



    public double alanHesapla(){
        return Math.pow(r,2)*Math.PI;
    }

    public double cevreHesapla(){
        return 2*pi*r;
    }


    public static double alanHesapla2(int yariCap){

        double result=yariCap*yariCap*3.14;
        return result;
    }

    public static  double cevreHesapla2(int yariCap){
        return 2*pi*yariCap;
    }





}
