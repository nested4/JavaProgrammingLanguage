package day28_QuizAnswers;

public class C07_CodingAnswer4 {
    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
    }

    public static int factorial(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
/*5DK 4- Girilen sayının faktoriyelini döndüren bir metot yazınız.
 */