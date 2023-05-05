package day35_Arrays_Summary;

public class LabContinue {

    public static void main(String[] args) {

       // System.out.println(Arrays.toString(createArray(15, 8)));
        int[] array1={5,4,11};
        int[] array2={1,2,3,4};
        System.out.println(ikinciArraydeVarMi(array1, array2));

    }

// 2 array kabul eden, ilk array in
// içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa
// true yer almıyorsa false yazdıran metodu yazınız.
//[5,4,3,2,1] , [1,2,3,4,5,7,9] true [5,4,3,2,1,7,5] , [1,2,3,4,5] false


    public static boolean ikinciArraydeVarMi(int[] arr1,int[] arr2){

       firstloop: for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i]==arr2[j]){
                    continue firstloop;
                }
            }
            return false;
        }
        return true;




    }






    //2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    //createArray(8,15) → [8,9,10,11,12,13,14,15]
    public static int[] createArray(int x,int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
       int[] resultArray=new int[max-min+1];
        for (int i = min,j=0; i <=max ; i++,j++) {
            resultArray[j]=i;
        }
      return resultArray;
    }
}
