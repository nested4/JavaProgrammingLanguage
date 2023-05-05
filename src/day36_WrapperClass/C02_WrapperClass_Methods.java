package day36_WrapperClass;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {

       //valueOf()    int ve string ve çağrıldığı
       // metoda göre değer oluşturuyor
       String s="123";
       double x=  Double.valueOf(s);
       double y=x+5;
      //  System.out.println(y);

        //parseInt()
        int z=Integer.parseInt("123");
       // System.out.println("z = " + z);

     Integer t= Integer.valueOf("123");
        int m= t.intValue();
       // System.out.println("m = " + m);











/*
        String str="Bugün hava 40 derece";
       // hava sıcaklığı 10 derece daha artar ise hava sıcaklığı kaç derece olur?

        String[] strArray=str.split(" ");
        System.out.println("strArray[2] = " + strArray[2]);

        int result=Integer.parseInt(strArray[2]);
        */
/*
        String str="Bugün hava 20 derece;Bugün hava mevsim normallerinde";
        // 40 ve üzerinde ise "Bugün hava çok sıcak"
        // Altında ise bugün hava mevsim normallerinde


        int havaSicakligi=Integer.parseInt(str.split(" ")[2]);
        String expectedResult1="Bugün hava çok sıcak";
        String expectedResult2="Bugün hava mevsim normallerinde";
        String actualResult=str.split(";")[1];
      if(havaSicakligi>=40){
          System.out.println(expectedResult1.equalsIgnoreCase(actualResult) );
      }else {
          System.out.println(expectedResult2.equalsIgnoreCase(actualResult) );
      }

*/

      //"Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kaç yaşında olur?
        //Ali 37 yaşında olur.


        String str="Ali'nin doğum yılı 1996";
        String[] strArrayName=str.split("'");
        String name=  strArrayName[0];
        String[] strArrayYil=str.split(" ");
        String yil=strArrayYil[strArrayYil.length-1];
        int onYilSonrakiYasi=2023-Integer.parseInt(yil)+10;
        System.out.println(name+" "+onYilSonrakiYasi+" yaşında olur.");

    }
}
