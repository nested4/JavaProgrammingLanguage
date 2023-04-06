package day21_Class_and_Methods;

public class C03_Fibonacci {

//Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 24//
    //public static void fibonacci(){
    //  for(int i=0; i)



public static void fibonacci(int n){

    int x=0;
    int y=1;
    int z;
    System.out.print(x+" ");
    System.out.print(y+" ");
    for (int i = 0; i <n-2 ; i++) {
        z=x+y;
        System.out.print(z+" ");
        x=y;
        y=z;
    }
}


    public static void main(String[] args) {
       // fibonacci(9);
     //   System.out.println();
      if(fibonacciSonSayi(9)==21){
          System.out.println(fibonacciSonSayi(9));
          return;
      }
        System.out.println(fibonacciSonSayi(9));
        System.out.println("merhaba");
        System.out.println("nasılsınız");

    }
    public static int fibonacciSonSayi(int n){

        int x=0;
        int y=1;
        int z=0;

        for (int i = 0; i <n-2 ; i++) {
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }


}
