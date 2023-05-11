package day52_Collections2;

import java.util.HashSet;
import java.util.Set;

public class C04_SetPractice2 {
    public static void main(String[] args) {


        String str = "Yattın mi Yorgun musun Uyu düşünme beni Ben ki hiç düşünülmedim senden öncesini";

        // Bu String icinde kac tane farkli harf var?
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(5);
//        set1.add(10);
//        set1.add(15);
//        set1.add(15);
//        set1.add(15);
//        System.out.println(set1);
//        set1.remove(15);
//        System.out.println(set1);

        System.out.println("uniqueLetterCount(str) = " + uniqueLetterCount(str));


    }



    public static int uniqueLetterCount(String str){
        String[] arr = str.replace(" ", "").split("");
        Set<String> uniqueCharSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueCharSet.add(arr[i]);
        }
        return uniqueCharSet.size();
    }
}
/*Gökyüzünde dans eden yıldızlarla,
Rüzgarın şarkısını dinlerken,
Kalbim coşar, heyecanla çarpar,
Bu şiirde duygularımı bulurken.

Bir gülüşün yeter bana,
Hayata anlam katar,
Bir dokunuşun yetişir uzaklardan,
Yüreğimde umutlar filizlenir baharlarla.

Gözlerin, o kahverengi gözlerin,
Beni anlamaya yetiyor,
Sözcükler yetersiz kalır,
Aşkımı anlatmaya göğüs gerecek kadar.

Bu şiirde sınırlar yok,
Kelime sınırlarını aşar,
Duygular hürce dolaşır satırlarda,
Aşkın ateşiyle yanar sözcükler, cümlelerle baş başa.

Hayatın renklerini tüm canlılığıyla hissederken,
Ruhum dans eder serbestçe,
Kelimelerle resmederim düşlerimi,
Bu şiirde bulurum huzuru ve sevinci.

Yazdığım her satırda bir parça ben var,
Biraz hüzün, biraz umut,
Düşlerim ve gerçeklerim,
Bu şiirde bir araya gelir, birleşir tutkulu bir nutuk.

Gel, serbest ol bu şiirde sen de,
Kelimelerin dans ettiği dünyaya katıl,
Dile gelmez duygularını ifade et,
Bu serbest şiirde özgürce konuş, sınırları yık.

İşte sana serbest bir şiir,
Sözcüklerin özgürce dans ettiği bir dünya,
Dilediğin gibi oku, yorumla, hisset,
Çünkü bu şiir, seninle can buldu, tamamlanmış bir ahenk oldu.
                              ChatGPT 2023/05/11
*/