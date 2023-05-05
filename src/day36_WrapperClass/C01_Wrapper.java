package day36_WrapperClass;

public class C01_Wrapper {

    public static void main(String[] args) {
        int x=5;
        Integer y=new Integer(5);
        char c='e';
        Character cW=new Character('e');
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isDigit('A'));
         System.out.println(Integer.max(50, 60));
        System.out.println(Double.max(40.5, 40.6));
Short s=new Short((short) 100);
        Short s1=new Short("a100");
      //  System.out.println(s1+20);
        Float f=new Float(4.5);
     //   System.out.println(f);


        Integer sayiW=new Integer(10);
        int sayiP=20;

        sayiP=sayiW;
        sayiW=sayiP;












    }

}
