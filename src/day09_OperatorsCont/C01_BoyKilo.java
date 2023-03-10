package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {

    public static void main(String[] args) {


        //Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini alıp ekrana tek satırda yazdırınız

        //input isminde bir scanner objesi olusturduk

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz (Ornek : 1.78) : ");
        double boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz (Ornek : 80.5) : ");
        double kilo = input.nextDouble();

        System.out.println("Lutfen isminizi giriniz :");
        String isim = input.next(); // ilk kelime

        input.nextLine();
        System.out.println("Soyisminizi giriniz :");
        String soyisim = input.nextLine();

        System.out.println(isim + " " + " boyunuz: " + boy + " m kilonuz: " + kilo + " kg");


    }
}
// Scanner.next() ilk space bosluga kadar olan degerleri alir
// Scanner.nextLine() ilk entere kadar olan degferleri aliyor