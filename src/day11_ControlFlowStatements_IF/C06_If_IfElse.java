package day11_ControlFlowStatements_IF;

public class C06_If_IfElse {

    public static void main(String[] args) {
/*
        //A ve B 2 adet int sayıyı karşılaştırın
        // A büyüktür B den
        // B büyüktür A dan
        // A ve B eşittir

        int a=10;
        int b=20;
        if(a>b){
            System.out.println("A büyüktür B den");
        }else if(a==b){
            System.out.println("A ve B eşittir");
        }else  {
            System.out.println("B büyüktür A dan");
        }
*/
   //Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
   // değil ise y ye 0 atansın
/*
      int x=10,y=0;

      if(x==10){
          y=20;
      } else if(x==20){
          y=30;
      } else if(x==30){
            y=40;
        }else {
          System.out.println("X bulunamadı");
      }


        System.out.println("y = " + y);
*/


    //Bir program yazın sıcaklık 20 derece ve üstü ise String message;
        // degişkenine butterfly flies(kelebekler uçar) assign edilsin.
/*
       String str;
        int degree=19;
        if(degree>=20){
         str="butterfly flies";
        }else {
            str="";
        }
        System.out.println(str);



        // Ayşenin cep harçlığı 5 liradan daha az ise
        // babası ona 10 lira versin.

        int aysePara=1;

        if(aysePara<5){
            aysePara=aysePara+10;
        }
        System.out.println("Ayşenin parası: "+aysePara);


//Write a program;
// 2 numara kabul etsin numaraların eşit olup olmadığını döndürsün.

        int x=10;
        int y=15;
        if(x==y){
            System.out.println("sayı eşit");
        }else {
            System.out.println("sayılar eşit değil");
        }


//Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.

        int x=20;
        int y=20;
        if(x>y){
            System.out.println(x);
        }else if(x==y){
            System.out.println("Sayılar eşit büyük sayı yok");
        } else {
            System.out.println(y);
        }


        //Write a program a,b,c olmak uzere 3 int degişken declare edelim
        // sırasıyla değerler atayalım.
        // a ve b
        // değişkenin toplamı c den fazla ise
        // a ve b nin farkını c ye atasın

        int a,b,c;
        a=20;
        b=30;
        c=30;
        if((a+b)>c){
          //  c=Math.abs((a-b));
          // c=Math.max(a,b)-Math.min(a,b);
            if((a-b)>=0){
                c=a-b;
            }else {
               // c=-(a-b);
                c=b-a;
            }
        }
        System.out.println(c);



        // 3 adet iç açı alsın ve bunu üçgen
        // olup olmadığını kontrol etsin

        int x,y,z;
        x=60;
        y=60;
        z=65;
        if((x+y+z)==180){
            System.out.println("Bu bir üçgendir");
        }else {
            System.out.println("Üçgen değildir");
        }
 */

// Bir program yazın 3 açı kabul
// etsin açılardan biri 90 ise bu bir dik üçgendir mesajı döndürsün.

        int x,y,z;
        x=60;
        y=30;
        z=90;

        if(x+y+z==180){
            if(x==90||y==90||z==90){
                System.out.println("bu bir dik üçgendir");
            }
            else {
                System.out.println("bu üçgen dik üçgen değildir");
            }

        }else {
            System.out.println("bu bir üçgen değildir");
        }

//Bir program yazın
// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
// 2 veya 3 farklı yol ile çözmeye çalışın








    }
}
