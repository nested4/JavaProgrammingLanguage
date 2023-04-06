package day06_Type_Casting;

public class HomeWorkAnswer {

    public static void main(String[] args){

        //60 soruluk bir sınavda 4 yanlış 1 doğruyu götürmektedir.
        //Tüm sorulara cevap veren bir öğrencinin 51,25 neti
        //olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?

        int toplamSoruAdedi=60;
        double oran=1;
        double net=20;
       // 60-51.25    8.75  yanlış hemde
        // yaşlarınların götürdüğü doğrılarım var

        double yanlisAdet=(toplamSoruAdedi-net)/(1+1/oran);

        System.out.print(yanlisAdet);




    }

}
