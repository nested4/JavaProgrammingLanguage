package day15_If_Else__Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switc_Case_Example {

    public static void main(String[] args) {
        //byte,short,int,char,String
/*
       int x=2;

       switch (x){
           case 1:
               System.out.println("A");
                break;
           case 2:
               System.out.println("B");
               break;
           case 3:
               System.out.println("C");
               break;
           case 4:
               System.out.println("D");
               break;
           case 5:
               System.out.println("E");
               break;
           default:
               System.out.println("F");
       }

*/

        // et menü, sebze menü, çocuk menü (1-2-3)
        // etmenü pirzola 50 ,tavuk 30
        // sebze menü enginar 30 ,roka salatası 40
        // çocuk menü patatez kızartması 10, makarna 5 tl

        Scanner scan=new Scanner(System.in);
        System.out.print("et menü, sebze menü, (1-2): ");
        int tercih_1= scan.nextInt();
        switch (tercih_1){

            case 1:

                System.out.print("pirzola mı(1) tavuk mu (2):");
                int tercih_2= scan.nextInt();
                switch (tercih_2){
                    case 1:
                        System.out.println("pirzola 50TL");
                        break;
                    case 2:
                        System.out.println("tavuk 30tl");
                    break;
                    default:
                        System.out.println("hatalı giriş");

                }
            break;

            case 2:

                System.out.print("enginar (1) rokasalatası (2):");
                int tercih_3= scan.nextInt();
                switch (tercih_3){
                    case 1:
                        System.out.println("enginar 10TL");
                        break;
                    case 2:
                        System.out.println("roka salatası 5tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;

            default:
                System.out.println("Hatalı giriş");
        }
      /*  System.out.println("1. katında Resepsion, Güvenlik ve Oda hizmetler var."+
"2 katında Yemekhane, Dinlenme salonu ve Room1,Room2"+
"3.katında ise Room3,Room4,Room5,Room6 vardır.");

        System.out.println("kat: ");
        int kat= scan.nextInt();
        scan.nextLine();
        System.out.println("Oda seçin ");
        String oda= scan.nextLine();
        */
//CONTROL FLOW STATEMENTS



    }
}
