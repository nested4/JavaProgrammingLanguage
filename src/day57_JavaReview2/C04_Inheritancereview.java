package day57_JavaReview2;

 class A{
    public A() {
        System.out.println("The constructor of Class A is executing");
    }

    public int x;
    public final static int y = 33;

    public void methodA(){
         System.out.println("Method A");
     }
}

class B extends A{
    public B() {
        // super();   // no need to call
        System.out.println("The constructor of Class B is executing");
    }

    public void methodA(){
        System.out.println("Method A (overriden by ClassB)");
    }
}







public class C04_Inheritancereview {
    public static void main(String[] args) {

        A objA = new A();
        System.out.println("---------------");
        B objB = new B();
        System.out.println("objB.x = " + objB.x);
        System.out.println("objB.y = " + objB.y);
//        objB.y = 41;  // can not be reassigned
        objB.methodA();

    }
}
