package day15_If_Else__Switch_Loops_Summary;

public class C03_Nested_If {

    public static void main(String[] args) {

        //alinin cebinde 100 tl var ise ve zamanı var ise sinamaya gitsin
        // 100 tlsi yok ise evde kalsın
      /*   int aliParasi=120;
         boolean zaman=false;

         if(aliParasi>=100){

             if (zaman){
                 System.out.println("sinamaya gidebilir");
             }else {
                 System.out.println("parası var ama zamanı yok gidemez");
             }
         }else {
             System.out.println("Parası yok gidemez");
         }
*/
        int aliParasi=120;
        boolean zaman=false;

        if(aliParasi>=100&&zaman){
            System.out.println("sinamaya gidebilir");
        }else {
            System.out.println("sinemaya gidemez");
        }



    }
}
