package day30_Review;

public class C05_ClassLevelVariables {
    /* Bir Class icerisinde tum methodlarin icerisinde bir degiskene erismek istiyorsak
    onu methodlarin disinda, clasin icinde tanimlamam gerekiyor. CLASS LEVEL VARIABLE

    1. Class icerisinde tanimlanan degiskenin scope'u tum classtir.
    2. Class level degiskenlere ilk deger atanmasa da olur.
    3. Deger atanmadan da bu degiskenler kullanilabilir. JAVA bunlara default degerler zaten atar.
    4. static olarak tanimlanan degiskenler, diger tum classlardan Class isimi ile erisilebilir olur.
    5. eger metod da static ise , icerisine static olmayan hirbirsey almaz

     */
    static int turkish_PI=3;
    static String turkishPizza;
    static boolean bl;
    static  char ch;
    static int i;

    int i2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println("turkish_PI = " + turkish_PI);
        System.out.println("turkishPizza = " + turkishPizza);
        System.out.println("bl = " + bl);
        System.out.println("ch = " + ch);
        System.out.println("i = " + i);
//        System.out.println("i2 = " + i2); // instance variable
//        System.out.println("bl2 = " + bl2); // instance variable



    }

    public void yMethod(){
        i++;
        System.out.println(i);
        System.out.println(bl);
        System.out.println(i2); // instance
        System.out.println(bl2);
    }

}
