package day37_ArrayList;


import java.util.Scanner;

public class C01_Day37Summary {

    public static void main(String[] args) {
     /* Boolean b=Character.isDigit( Integer.toString(100).split("")[0].charAt(0));
                //                                   "100"  [1, 0, 0]     "1"       '1'
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        Integer inW=new Integer(10);
        int inP=5;
        inP=inW;
        inW=inP;

        String s="5";
        Integer k=Integer.valueOf(s);  //return Integer
        int x=Integer.parseInt(s);     // return int
         int[] arr=new int[10];
         arr[0]=x;  // 5,0,0,0,0,0,0,0,0,0
      */

        //Şifreleme validasyon isim / soy isim *21414/=
        Scanner scanner=new Scanner(System.in);
        System.out.print("İsim soy isim");
        String nameSurname=scanner.nextLine();

        if (nameControl(nameSurname)) {
            System.out.println("password giriniz");
        } else {
            System.out.println("hatalı isim soy isim tekrar deneyin");
        }



    }


    /// task2 -- string içindeki sayıları bir array içinde döndüren bir method yazın
    public static int[] textNumbers(String str){
        // asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,////
      String result="";

        for (int i = 0; i <str.length() ; i++) {
                  if(Character.isDigit(str.charAt(i))){
                      result+=str.charAt(i);
                  }
        }
        //"0" "1" "1" "2" "0" "1" "2" "1" "0" "5" "6" "3" "1" "2"
        String[] arr=result.split("");
        int[] arrNew=new int[arr.length];
        for (int i = 0; i <arrNew.length ; i++) {
            arrNew[i]=Integer.parseInt(arr[i]);
        }

        return arrNew;

    }

    public static boolean nameControl(String str){
       //" har/un b"
       // 012345678
      // Kriterler sayı olamaz,boşluk haricinde karakter olamaz sembol olamaz
      for (int i = 0; i <str.length() ; i++) {
          if (Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i))) {
              if(str.charAt(i)==' '|| str.charAt(i)=='-'){
                  continue;
              }
              return false;
          }
          }
      return true;
      }

}



