package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        for (int i=1 ;i<=6;i++){
            for(int j=1; j<=6;j++){
                System.out.print(1);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");


        for (int i=1; i<=6 ;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }

        System.out.println("------------------------------");

        for (int i =6; 0<=i;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }

}
/*Örnek 1: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
111111
111111
111111
111111
111111
111111*/


/*Örnek 2: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        kulanarak)
        *
        **
        ***
        ****
        *****
        ******

 */

/*
* Örnek 3: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
kulanarak)
******
*****
****
***
**
*/