package day31_Arrays_1;

public class C03_Array_2 {

    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;
        System.out.println("array.length = " + array.length);

    /*  for (int i = 0; i <array.length;  i++) {
            System.out.print(array[i]+" ");
        }
*/
        for (int x:array) {
            // x=array[0] 1. döngü
            // x=array[1] 2. döngü
            // x=array[2] 3. döngü
            // x=array[3] 4. döngü
            // x=array[4] 5. döngü
        }

      int ciftSayi=0;
        for (int x:array) {
            if(x%2==0){
                ciftSayi++;
            }
        }
        System.out.println("ciftSayi = "+ciftSayi);
// for each döngüsü kullanarak arraydeki tek sayıları bulun
     int tekSayi=0;
     for (int x:array){
         if(x%2!=0) {
             tekSayi++;
         }
     }
        System.out.println("tekSayi = " + tekSayi);

     // arrayin içerisindeki tüm verileri toplayan ve ekrana yazdırna bir for each loop yapın
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("sum = " + sum);


      int arrayToplam=0;
      for (int x:array){
          arrayToplam+=x;
      }
        System.out.println("arrayToplam = " + arrayToplam);



    }

public static String[] arrrayMethot(){
        String [] array={"harun","mehmet"};
    return array;
}
    public static String arrrayMethot2(String[] arr){

     return arr[0];
    }


}
