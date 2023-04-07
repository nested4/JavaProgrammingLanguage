package day30_Review;

public class C04_LocalVariables {
    /*
    1. Bir metod icerisinde olusturulan bir degiskenin scope 'u o metodun icidir.Baska bir yerde o degiskeni
    kullanamayiz , cagiramayiz. Bu tip degiskenlere LOCAL Degisken
    2. For, while etc dongulerinde kendi scoplari vardir. Loop disinda kullanamayiz
    3.Local degiskenler deger atamadan olusturulabilir. Ancak deger atamadan bu degiskenleri kullanamam.
     */

    public static void main(String[] args) {
     //   System.out.println(C05_ClassLevelVariables.Turkish_PI);
        String isim;
//        System.out.println(isim);  // Local degisken initilize edilemeden kullanilamaz

        int i;
        //i++;  //initilize edilmeyen degisken kullanilamaz

        {
            int i2 = 5;
            System.out.println("i2 = " + i2);
        }
        // System.out.println(i2); i2 is out of scope

        for (int j = 0; j <10 ; j++) {   // j for dongusunun icerisinde bir local degisken disinda kullanilamaz
            System.out.print(j+" ");
        }

        // System.out.println(j);

    }

    public static int xMethod()
    {
      int i=10;
      return i;
    }

}
