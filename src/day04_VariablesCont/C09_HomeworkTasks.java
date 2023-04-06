package day04_VariablesCont;

public class C09_HomeworkTasks {
    public static void main(String[] args){
//        1- Haydi! I am ready to be a java pro ☺ ifadesini konsola
//        yazdırın.
        System.out.println("I am ready to be java pro ☺");

//        2- 1 den 5 kadar olan sayıları tek satır kod ile konsolda alt
//        alta yazdırın.
        System.out.println("1\n2\n3\n4\n5");

//        3- "hello world" yazdırın
        System.out.println("\"hello world\"");

//        4- 21'' monitor    yazdırın
        System.out.println("21'' monitor");
        System.out.println("21\" monitor");

//        5- 'eve geç kalma' dedi yazdırın
        System.out.println("'eve geç kalma' dedi");

//        6-
        System.out.println("  ************");
        System.out.println("         **");
        System.out.println("         **");
        System.out.println("         **");
        System.out.println("         **");
        System.out.println("**       **");
        System.out.println(" **      **");
        System.out.println("  **    **");
        System.out.println("    ****");

//        7-Ahmet
//          GÜL
//          30 yaşımdayım
//          İstanbul da yasıyorum.
//          şeklindeki pankartı tek satır kodla konsola yazdırın.
        System.out.println("Ahmet\nGÜL\n30 yaşındayım\nİstanbul da yaşıyorum.");

//        8- 3 degişken oluşturun(declare) int, String ve char tipinde olsun ve
//        farklı değerler atayarak(assign), konsolda aşağıda ki gibi yazdırın.
//        Example:"35,Ahmet,M"veya "30,Ayşe,W"
        int i;
        String str;
        char ch;

        i=42;
        str="Salih";
        ch='M';
        System.out.println("\""+i+","+str+","+ch+"\"");


//        9- bro1 ve bro2 ikiz kardeşlerin yaşlarını tek satırda declare edin ve yaşlarını
//        assign edin. konsola yazdırın.
        int bro1=10,bro2=bro1;
//        int bro1=10;
//        int bro2=bro1;

        System.out.println("İkiz kardeşelerin yaşı "+bro2);

//        10- LPG, motorin, gasoline yakıt tiplerini tek satırda string türünde
//        tanımlayın(declare).
        String LPG,motorin,gasoline;
        //şimdi ayrı satırlarda assigning/atama yapacağız.
        LPG = "10";
        motorin = "26";
        gasoline = "22";


//        11- Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
//        İfadesini bir değişkene atayın ve yıl başka bir değişken ile
//        kontrol edilebilsin.

        int a = 1543;
        int b = 1455;
        int c = 1354;
        int d = 1453;
        System.out.println("Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.");
        System.out.println("Fatih Sultan Mehmet "+ 1453 +" yılında İstanbul u fethetmiştir.");
        System.out.println("Fatih Sultan Mehmet "+ d +" yılında İstanbul u fethetmiştir.");

        int correctAnswer = 1453;
        boolean result_sonuc =d==correctAnswer;
        System.out.println("d sıkkı "+d+" cevabı "+result_sonuc+" dur");

//        12- Bir program yazın. Yarıçapı (radius) x olan çemberin alanını
//        versin. Yarıçap(radius) ve alan(area) olmak üzere 2 değişken
//        oluşturun. Reminder: Pi=3.14
        //dairenin alanı   =   pr²=p*r*r    =    Pİ*radius*radius
        //çemberin çevresi(primeter) = 2*Pİ*radius

        int radius = 10;
        double Pİ = 3.14;

        double area = Pİ*radius*radius;
        double primeter = 2*Pİ*radius;

        System.out.println("Yarışapı "+radius+"cm " +
                "olan çemberin çevresi "+primeter+"cm " +
                " çemberin alanı "+area+"cm² dır");

    }
}
