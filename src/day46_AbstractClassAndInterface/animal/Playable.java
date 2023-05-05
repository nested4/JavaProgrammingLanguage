package day46_AbstractClassAndInterface.animal;

public interface Playable {
    boolean isFriendly = true; // static & final by default

//    public static void method1(){
//        System.out.println(isFriendly);
//    }

    void play(); // abstract method by default

}
