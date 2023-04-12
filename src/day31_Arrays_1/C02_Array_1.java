package day31_Arrays_1;

public class C02_Array_1 {

    public static void main(String[] args) {
        //String x="Harun";
        int[] x=new int[5];

        int[] y;
        y=new int[5];

        int z[]=new int[5];
        z[0]=105;
        z[1]=89;
        z[2]=63;
        z[3]=56;
        z[4]=107;


       // System.out.println(z[1]);
    String[] str =new String[3];
    str[0]="Harun";
    str[1]="Serkan";
    str[2]="Emine";
     //   System.out.println(str[1]);




        String str2[]={"Harun","Serkan","Emine"};
       str2[0]="Hatice";
       // System.out.println(str2[2]);
        //String[] str2 =new String[3];
       // str2[0]="Harun";
       // str2[1]="Serkan";
        // str2[2]="Emine";


        //2 değer alan int türünde bir array oluşturun
        // değer atayın sonra ve bu iki değeri
        // toplayın ve ekrna yazdırın

        int[] sayilar=new int[2];
        sayilar[0]=89;
        sayilar[1]=105;
        int toplam=sayilar[0]+sayilar[1];
        System.out.println("toplam = " + toplam);

        int [] sayilar2={89,107};
        int toplam2=sayilar2[0]+sayilar2[1];
        System.out.println("toplam2 = " + toplam2);
    }





}
