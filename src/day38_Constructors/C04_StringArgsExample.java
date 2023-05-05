package day38_Constructors;

public class C04_StringArgsExample {
    //ozel bir metod
    //args arguments kisaltilimis
    //String[] args
    //bu argumanlar disaridan girilen veriler

    public static void main(String[] args) {

        System.out.println("args.length = " + args.length);

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("------------------------");
        args[0]="isa";
        args[1]="musa";

        for (String arg : args) {
            System.out.println(arg);
        }

    }

}
