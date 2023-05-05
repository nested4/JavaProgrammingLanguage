package day37_ArrayList;

import java.util.ArrayList;

public class C04_ArrayList3 {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
      /*  listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500); */
        System.out.println(dublicate(listOfNums));
        // printListNumbers(listOfNums);
    }
    //5,10,15,15,20,25,25,100,100,500 rakamlarını
// listOfNums isili bir ArrayListe atın ve
//printListNumbers(listOfNums); methodu ile yazdıralım.
    public static void printListNumbers(ArrayList arrList){
        for (int i = 0; i < arrList.size() ; i++) {
            System.out.print(arrList.get(i)+" ");
        }
    }
//sum(listOfNums); methodu ile de toplam değeri döndürelim.

    public static int sum(ArrayList<Integer> arrayList){
        int result=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            result+=arrayList.get(i);
        }
        return result;

    }

    //duplicate(listOfNums); methodu ile de değerleri dublicate edip list i döndürelim.

    public static ArrayList<Integer> dublicate(ArrayList<Integer> arrList){

        ArrayList<Integer> arrListYeni=new ArrayList<>();

        for (int i = 0; i <arrList.size() ; i++) {
            arrListYeni.add(arrList.get(i));
            arrListYeni.add(arrList.get(i));
        }
        return arrListYeni;

    }

    //"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    // toIntList(stringNums); methodu Integer bir arrayList e convert edip döndürelim.

    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){

        ArrayList<Integer> arrIntList=new ArrayList<>();

        for (int i = 0; i <arrStringList.size() ; i++) {
                arrIntList.add(Integer.valueOf( arrStringList.get(i)));
        }
        return  arrIntList;

    }

    // yeni bir arrayList oluşturun içerisine 5 adet sayı ekleyin
    // dondur(int x) x kadar sayıları kendi içerinde döndürsün
    //  1 2 3 4 5    dondur(int 1)  51234    dondur(int 3)  34512  dondur(2)    45123 yeni bir arrylist






    //squared(listOfNums); methodu ile de değerleri kendi ile çarpıp list i döndürün. ödev

  //ArrayList<Integer> myList = getList(20);//return method System.out.println(myList); ödev
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
}

