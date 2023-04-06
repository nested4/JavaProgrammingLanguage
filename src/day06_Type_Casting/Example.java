package day06_Type_Casting;

public class Example {
    public static void main(String[] args){
      /*  int toplamSoruAdedi=60;
        double oran=10;
        int yanlisAdet=20;

        //  60-20-20/4 doğrularım gitti

        double net=toplamSoruAdedi-yanlisAdet-yanlisAdet/oran;

        System.out.print(net);
        */
////Ali sınıfta 7-7 halı saha maçı planlamak ve
//        // oynanan maçta hakem olmak istiyor,
//        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.


/*
        int sinifMevcudu=19;
        int hakem=2;
        int oyuncuSayisi=16;

        int kalan=sinifMevcudu-oyuncuSayisi-hakem;
        System.out.print(kalan);
*/
        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.

        int okulMevcudu=188;
        int hakemSayisi=1;
        int takımOyuncuSayisi=7;

        int kalan=okulMevcudu%(takımOyuncuSayisi*2+hakemSayisi);
        System.out.print(kalan);

    }

}
