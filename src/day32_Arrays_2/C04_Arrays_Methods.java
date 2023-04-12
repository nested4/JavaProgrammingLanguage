package day32_Arrays_2;

import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {

        //System.out.println("kelimeDepola()[2] = " + kelimeDepola()[0]);

      /*  if(uzunlukKontrol(array)){
            System.out.println("uzunluk 5 den büyük");
        }else {
            System.out.println("uzunluk 5 den küçük");
        }
*/

        int array1[]={3,3,5};
        int array2[]={35,3,36};
       arrayYazdir(arrayBirlestir2(array1,array2));


    }
   // Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int[] arrayBirlestir2(int[] arr1,int[] arr2){

        /// array1[]={3,3,5}; array2[]={35,3,36};
        int[] yeniArray=new int[arr1.length+arr2.length];  //yeniArray[]={3,3,5,0,0,0};
        for (int i = 0,j=0; i  <yeniArray.length  ;i++) {    //           0 1 2 3 4 5
            if(i<arr1.length) {
                yeniArray[i]=arr1[i];

            }  else {
                yeniArray[i]=arr2[j];
                //
                j++;
            }
        }
        return yeniArray;


    }




    public static int[] arrayBirlestir(int[] arr1,int[] arr2){
        int[] yeniArray=new int[arr1.length+arr2.length];

        for (int i = 0; i <arr1.length ; i++) {
            yeniArray[i]=arr1[i];
        }
        int j=0;
        for (int i = arr1.length; i <yeniArray.length ; i++) {
            yeniArray[i]=arr2[j];
            j++;
        }
        return yeniArray;

    }







    public static void arrayYazdir(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }

        }
    }
    public static void arrayYazdir(double[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(String[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(char[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    public static void arrayYazdir(boolean[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+"-");
            }
        }
    }
    //İnt array ın elemanlarının toplamını ve çarpımını yeni
    // bir array içinde döndüren bir method yazın.

     public static int[] toplamVeCarpim(int[] arr){
        int toplam=0;
        int carpim=1;
        int yeniArray[]=new int[2];

         for (int i = 0; i <arr.length ; i++) {
             toplam+=arr[i];
             carpim*=arr[i];
         }
         yeniArray[0]=toplam;
         yeniArray[1]=carpim;
         return yeniArray;


     }







    //Int array in elemanlarının toplamını veren bir method yazın

    public static int arrayToplam(int[] arr){
        int result=0;
        for (int sayi:arr){
            result+=sayi;
        }
        return result;

    }
    public static int arrayToplam(double[] arr){
        int result=0;
        for (int i = 0; i <arr.length ; i++) {
            result+=arr[i];
        }
        return result;

    }



    //2 array kabul eden bir method yazın ve arraylerin
    // llk elemanları ile yeni bir array döndürsün.

    public static double[] yeniArray(double[] x,double[] y){
        double[] array=new double[2];
        array[0]=x[0];
        array[1]=y[0];
        return array;

    }
    public static double[] yeniArray(int[] x,int[] y){
        double[] array= {x[0],y[0]};
        return array;

    }










   // Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ilkElemanEsitMi(int[] arr1,int[] arr2){
        return arr1[0]==arr2[0];
    }
    public static boolean ilkElemanEsitMi(String[] arr1,String[] arr2){
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }






    //Bir method yazın int array kabul etsin
    // array in içinde 5 olup olmadığını kontrol etsin.
public static boolean sayiKontrol(int[] array){
    for (int i = 0; i < array.length; i++) {
        if(array[i]==5){
            return true;
        }
    }
      return false;
}

    public static boolean sayiKontrol(int[] array,int sayi){
      for (int x:array){
          if(x==sayi){
              return true;
          }
      }
      return false;

    }


    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean uzunlukKontrol(int[] arr){

       return arr.length>5;

    }






public  static String[] kelimeDepola(){
    String array[]=new String[3];
    Scanner scan=new Scanner(System.in);
    System.out.print("1.kelime: ");
    String kelime1=scan.nextLine();
    array[0]=kelime1;
    System.out.print("2.kelime: ");
    String kelime2=scan.nextLine();
    array[1]=kelime2;
    System.out.print("3.kelime: ");
    String kelime3=scan.nextLine();
    array[2]=kelime3;
    return array;

}


}
