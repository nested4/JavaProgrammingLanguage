package day17_Methods;

import java.util.Scanner;

public class C01_Bank_Question {

    public static void main(String[] args) {
        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3

        double money=2000;
        Scanner scan=new Scanner(System.in);
       outerLoop: while (true){
            System.out.println("1:Para ekle 2:para çek 3:bakiye 4:çıkış");
            System.out.print("yapmak istediğinizz işlemi seçiniz: ");
            int tercih= scan.nextInt();
            switch (tercih){
                case 1:
                    while(true){
                        System.out.print("Eklemek isteğiniz tutarı girin: ");
                        double para= scan.nextDouble();
                        money+=para;
                        System.out.print("bir üst menü için 1 basınız işleme devam etmek için 2");
                        int tercih2= scan.nextInt();
                        if (tercih2==1){
                           break;
                        }else if(tercih2==2){
                            continue ;
                        }else {
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                            break outerLoop;
                        }
                    }
                    break;

                case 2:
                    while(true){
                        System.out.print("Çekmek  isteğiniz tutarı girin: ");
                        double para= scan.nextDouble();
                        if(para>money){
                            System.out.println("hesabınızda yeterli bakiye yoktur");
                            continue outerLoop;
                        }
                       money-=para;
                        System.out.print("bir üst menü için 1 basınız işleme devam etmek için 2");
                        int tercih2= scan.nextInt();
                        if (tercih2==1){
                            break;
                        }else if(tercih2==2){
                            continue ;
                        }else {
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                            break outerLoop;
                        }
                    }
                    break;

                case 3:
                    System.out.print("bakiyeniz : "+money);
                    break;
                case 4:
                    break outerLoop;
                default:
                    System.out.println("hatalı işlem tekrar deneyin ");

            }







        }







    }
}
