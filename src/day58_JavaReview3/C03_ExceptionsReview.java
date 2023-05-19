package day58_JavaReview3;

public class C03_ExceptionsReview {
    public static void main(String[] args) throws Exception {


//        List<Car> MyGarage;
//        MyGarage = new ArrayList<>();
//
//        while(true){
//            MyGarage.add(new Tofas());
//        }
//
        //OutOfMemoryError Can not be handles, resourses are limited, can not be done anything
//
//        methodWithRuntimeException();
//        System.out.println("Bye bye Java!");

        String str = "ABC";


        try {
            int  num = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.err.println("Invalid numeric format "+str);
            e.printStackTrace();
        } finally {
            System.out.println("Hi Guys");
        }


        System.out.println("Bye bye Java"); //NumberFormatException


    }

    public static void methodWithRuntimeException() throws Exception{
        throw  new RuntimeException(" This is a Runtime Exception");
    }
}
