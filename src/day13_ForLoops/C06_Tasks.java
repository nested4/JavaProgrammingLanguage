package day13_ForLoops;

public class C06_Tasks {
    public static void main(String[] args) {

        //Bir program yazın ve [0-100] arasındaki tüm sayıları yazdırsın.
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        //Bir program yazın ve 15-100 arasındaki tüm sayıları yan yana yazdırsın.
        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

//0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (100 99 98 97 vs)
        for (int i = 100; 0 <= i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        //Bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırsın.
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        //Bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırsın.

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

        //Bir program yazın ve 1-100 arasındaki sayıların toplamını konsola yazdırın
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; //sum=sum+i
        }
        System.out.println("Sum = "+sum);

        System.out.println();
        System.out.println("----------------------------------------------------");

        // Bir program yazın ve 1-20 ye kadar olan sayıların kuplerini alin çarpın.

        for(int i=1;i<=20;i++){
            System.out.println(i+" "+i*i*i);
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

    //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
    //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)     F=1.8C+32     23 * 1.8 +32
        for(int i =23; i<=50; i++){
            System.out.println(i+"C = "+(i*1.8+32)+"F");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

   //a dan z ye kadar olan harfleri ekrana yazdırın.
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

    //Örnek: 9 sayısının çarpım tablosunu yazdırınız.
        for(int i=1; i<=10;i++){
            System.out.println("9 X "+i+" = "+9*i);
        }


    }
}
