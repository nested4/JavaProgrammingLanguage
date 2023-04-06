package day11_ControlFlowStatements_IF;

public class C04_IF_ELSE {

    public static void main(String[] args) {

        double f=50;
        double k=55;
        double ort=(f+k)/2;
        double gecmeNotu=50;
        if(ort>gecmeNotu){
            System.out.println("Ali geçti");
        }else {
            System.out.println("Ali kaldı");
        }

        //fizik kimya ve matematik notlarını konsoldan alsın
        //ortalama 80 üzerinde ise geçti yazsın
        // 80 ve altında ise kaldınız yazsın
    }
}
