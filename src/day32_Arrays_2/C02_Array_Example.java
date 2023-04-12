package day32_Arrays_2;

import java.util.Scanner;

public class C02_Array_Example {

    public static void main(String[] args) {
        //kullanıcıdan 3 adet kelime alın ve bu 3 farklı kelimeyi
        // array içerisine atalım
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

        System.out.print("Girmiş olduğun kelimelerden hangi kelimeyi istiyorsun 1-2-3");
        int tercih= scan.nextInt();

       switch (tercih){
           case 1:
               System.out.print(array[0]);
               break;
           case 2:
               System.out.print(array[1]);
               break;
           case 3:
               System.out.print(array[2]);
               break;
           default:
               System.out.println("Hatalı giriş");
       }



    }


}
