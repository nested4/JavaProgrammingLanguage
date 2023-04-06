package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_If_Else_Example {

    public static void main(String[] args) {
  // hava sıcaklığı 20 derecenin altında ise hava soğuk
        // 20 ve üzerinde ise hava sıcak yazsın
        /*
double c=19.9;
if(c>=20){
    System.out.println("hava sıcak");
}else{
    System.out.println("hava soğuk");
}
*/
        //kullanıcıdan bir tam sayı alın
        // ekrana tekmi çift mi olduğunu
        // yazdıran programı yazın
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi: ");
        int number= scan.nextInt();
        boolean result=(number%2==0);
        if(result){
            System.out.println("Çift");
        }else {
            System.out.println("Tek");
        }





    }
}
