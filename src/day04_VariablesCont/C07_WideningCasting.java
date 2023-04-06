package day04_VariablesCont;

public class C07_WideningCasting {
    public static void main(String[] args) {

        //byte < short < int < long < float <double

        int sayi = 9;
        double kur=18.9;

        kur = sayi;     // int tipindeki 9 degerini double icine attim java otomatik olarak onu 9.0 olarak atadi
                        //bu donusturme tipine Widening Casting  Implicit Casting

        System.out.println(kur);

        double num1 = 5;

        System.out.println(num1);


    }
}
