package day03_EscapeChar_Variables;

public class EscapeCharacters {

    public static void main(String[] args) {

        //  \n  -> Yeni satir aciyor
        //  \t  -> bir tab bosluk birakiyor (4)
        //  \b  -> Backspace
        //  \"  ->  "
        //  \\  ->  \
        //  \r  ->  Satir basina kadar olan karakterleri siler

        System.out.println("Merhaba Dunya!");
        System.out.println("Merhaba\nDunya!");
        System.out.println("Merhaba \t Dunya!");
        System.out.println("Merhaba\bDunya\b");
        System.out.println("Merhaba\"Dunya\"");
        System.out.println("Merhaba\\Dunya");
        System.out.println("Merhaba\rDünya");



    }
}
