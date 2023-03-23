package day19_Custommethods_Return;

public class C01_PractiseTasks2 {
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println("----------------------------------");
        double myBagWeight= kgToLb(23);
        System.out.println("myBagWeight = " + myBagWeight);
        System.out.println("----------------------------------");
        signOfNumber(-6);
        signOfNumber(6);
        signOfNumber(0);
        System.out.println("----------------------------------");
        eachCharInString("Muratgilin damindan atlayamadim");
        System.out.println("----------------------------------");
        calculator(10,2,'+');
        calculator(10,2,'-');
        calculator(10,2,'*');
        calculator(10,2,'/');
        calculator(10,2,'?');
        calculator(10,2,'!');
        calculator(10,2,'1');


    }

    //	1. create a method that can can convert lira to dollar

    /**
     * a method that can can convert lira to dollar
     * @param TL
     */
    public static void tlToDollar(int TL){
        System.out.println(TL+" TL makes "+Math.round((TL/19.04)*100)/100.0+" USD");
    }

    //	2. create a method that can convert kg to lb

    /**
     * a method that can convert kg to lb
     * @param kg
     * @return
     */
    public static double kgToLb(double kg){
        double result=0;
        result=Math.round((kg*2.20462262)*100)/100.0;
        return result;
    }
    //	3. create a method that can determine if the given integer is positive, negative or zero

    public static void signOfNumber(int number){
        if(number<0) {
            System.out.println(number+" is a negative number");
        }
        else if (number>0) {
            System.out.println(number+" is a positive number");
        }
        else {
            System.out.println(number+" is zero");
        }
    }

    //	4. create a method named printEachChar that can print each characters of a string

    /**
     * a method named printEachChar that can print each characters of a string
     * @param str
     */
    public static void eachCharInString(String str){
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

  //  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
//	prints the calculation result

    /**
     * a method named calculator that passes three arguments (num1, num2, mathOperator),
     *prints the calculation result
     * @param num1
     * @param num2
     * @param mathOperator
     */
    public static void calculator(double num1, double num2, char mathOperator ){
        boolean valid = mathOperator=='+' || mathOperator =='-' || mathOperator =='*' || mathOperator=='/';
        if(valid){
            switch (mathOperator){
                case '+':
                    System.out.println(num1+num2);
                    break;

                case '-':
                    System.out.println(num1-num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '/':
                    System.out.println(num1/num2);

            }
        }else{
            System.err.println("Invalid Math Operator "+mathOperator);
        }

    }




}

