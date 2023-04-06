package day12_SwitchCase;

public class C05_Example {
    public static void main(String[] args) {
        // öğrencinin ortalamasını alın
        // ortalama 50 altında ise zayıf
        // 50 dahil  70 arası orta
        // 70 dahil  85 arası iyi
        // 85 ve üzeri pekiyi ekrana yazdırsın
        // 95 ve üzerimi diye kontrol edin 95 ve üzerinde ise
        // onur belgesi almaya hak kazındız
/*
        double ort=49;
        if(ort<50){
            System.out.println("Zayıf");
        }else if(ort>=50&&ort<70){
            System.out.println("orta");
        }else if(ort>=70&&ort<85){
            System.out.println("iyi");
        }else {
            System.out.println("pekiyi");
        }
*/
        double ort=96;
        if(ort<50){
            System.out.println("Zayıf");
        }else if(ort<70){
            System.out.println("orta");
        }else if(ort<85){
            System.out.println("iyi");
        }else {
            System.out.println("pekiyi");
            if(ort>=95){
                System.out.println("başarı belgesi almaya hak kazandınız");
            }

        }

    }
}
