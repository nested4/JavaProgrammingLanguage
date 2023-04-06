package day12_SwitchCase;

public class C07_Switch_Case_Exaple {


    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.
/*
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayi 1: ");
        double x= scan.nextDouble();
        System.out.print("Sayi 2: ");
        double y= scan.nextDouble();
        System.out.print("lütfen işlem seçiniz (+,-,*,/): ");
        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println(x+y);
               break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
           default:
                System.out.println("hatalı giriş");

        }

*/
        // haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
        // 1 Pazartesi
        // 3  çarşamba
        // 7 Pazar
/*
   int weekDay=8;

   switch (weekDay){
       case 1:
           System.out.println("pazartesi");
           break;
       case 2:
           System.out.println("salı");
           break;
       case 3:
           System.out.println("çarşamba");
           break;
       case 4:
           System.out.println("perşembe");
           break;
       case 5:
           System.out.println("cuma");
           break;
       case 6:
           System.out.println("cumartesi");
           break;

       case 7:
           System.out.println("pazar");
           break;
       default:
           System.out.println("hatalı giriş 1 ile 7 dahil arasında bir gün giriniz");

   }


*/

//Bir program yazın switch yapısını kullanın.
// Şu beden numaralarını : small(38-40-42),
// medium(44-46-48), large(50-52-54) yakalasın. Aşağıdaki şekilde çıktı alın.
        //Example output: 50 numara bir large bedendir.

        int beden=60;
        switch (beden){
            case 38,40,42:
                System.out.println("small");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
                System.out.println("bedeniniz elimizde yoktur");

        }


    }
}
