package day34_Arrays_4;

import java.util.Arrays;

public class C06_2dArrayTask {
    public static void main(String[] args) {
        String str ="merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.deepToString(splitArray(str)));

    }

    //«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
    //insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    public static String[][] splitArray(String str){
        String[] words = str.split(" ");
        String[] strArr1 = Arrays.copyOfRange(words, 0, 3);
        String[] strArr2 = Arrays.copyOfRange(words, 3, 5);

        String[][] result= {strArr1,strArr2};
        return result;

    }
}
