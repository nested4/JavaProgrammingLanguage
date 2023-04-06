package day12_SwitchCase;

public class C02_Homework {

    public static void main(String[] args) {
/*
        //Bir program yazın 3 tane numara
        // kabul etsin ve büyük olanı versin.(homework)
        int x,y,z;
        x=60;
        y=65;
        z=70;
      //  int first=Math.max(x,y);
       // int max=Math.max(first,z);
       // System.out.println("max değer: "+max);
               // +(  Math.max(Math.max(x,y),z)   ));

        if(x>=y&&x>=z){
            System.out.println(x);
        }else if(y>=x&&y>=z){
            System.out.println(y);
        }else {
            System.out.println(z);
        }
        */
//3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        //(min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız
        // 1 ,2,3   eşit sayı yok
        // 1,2,2    2
        // 2,2,2    2
        //2,3,2     2

        int x,y,z;
        x=60;
        y=70;
        z=71;
if(x==y){
    System.out.println(x);
}else if(x==z){
    System.out.println(x);
}else if(y==z){
    System.out.println(y);
}else{
    System.out.println("Eşit sayı yok");
}




    }
}
