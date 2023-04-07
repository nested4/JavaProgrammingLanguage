package day30_Review;

public class C07_FrequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequencyOfWord("Java Java JavaJavaJava JavaPython CC++RubyC#Java","Java"));
    }

    public static int frequencyOfWord(String sentence, String word){
        int frequency=0;
        while (sentence.contains(word)){
           sentence= sentence.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }
}

// Cumle icerisinde kelime sayisina donen bir metod yaziniz