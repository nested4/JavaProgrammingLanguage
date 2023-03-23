package day19_Custommethods_Return;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println("max(5,10) = " + max(5, 10));
        //find the max number of 10 & 20

        int maxNumber= max(10,20);
        System.out.println(maxNumber);

        //multiply the max number by 3
        int multiplication= maxNumber*3;
        System.out.println(multiplication);
    }


    //a method that returns the biggest number
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}


