package day34_Arrays_4;

public class C07_ArrayLab {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,3,3};
        System.out.println(sumOfArrayElements(numbers));
        System.out.println(sumOfEvenElements(numbers));
        System.out.println(sumOfThrees(numbers));

    }
    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static double sumOfArrayElements(double[] arr){
        double sum=0;
        for (double i : arr) {
            sum+=i;
        }
        return sum;
    }

//    Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int sumOfEvenElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i%2==0){
            sum+=i;
            }
        }
        return sum;
    }

    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThrees(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i==3){
                sum+=i;
            }
        }
        return sum;
    }




}
