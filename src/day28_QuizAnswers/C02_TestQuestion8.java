package day28_QuizAnswers;

public class C02_TestQuestion8 {

        public static void main(String s[])
        {
            int a = 34;
            int b = 56;
            int c = 0;
            sum(a,b);
            System.out.println("c = " + c);
        }
        public static int sum(int a, int b)
        {
            System.out.println("a = " + a + " b = " + b);
            int c;
            c = a + b;
            System.out.println("c = " + c);
            return c;
        }
}
