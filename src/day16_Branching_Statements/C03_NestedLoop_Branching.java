package day16_Branching_Statements;

public class C03_NestedLoop_Branching {


    public static void main(String[] args) {
/*
       outerLoop: for (int i = 0; i < 3; i++) {
            System.out.print("A");
           innerLoop: for (int j = 0; j <5 ; j++) {
               System.out.print("B");
                  harun: for (int k = 0; k <10 ; k++) {

                          if(k==0){
                            continue outerLoop;
                         }
                         System.out.print("C");
                          }

               }

        }
*/
//   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3

// 0 ile 100
// dahil 30-50 arasını yazdırmadan
// tüm sayıları ekrana yazın
        for (int i = 0; i <=100 ; i++) {
            if(i>30&&i<50){
                continue;
            }
            System.out.print(i+" ");
        }

//// 0 ile 100
//// dahil 13 bülünmeyen sayıları
//// tüm sayıları ekrana yazın
        for (int i = 0; i <=100 ; i++) {
            if(i%13==0){
                continue;
            }
            System.out.print(i+" ");
        }

    }


    }






