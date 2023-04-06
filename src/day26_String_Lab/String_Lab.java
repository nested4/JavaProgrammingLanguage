package day26_String_Lab;

public class String_Lab {



    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali



    public static String ilkUcHarfGetir(String str){
        if(str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }






     //Kullanıcıdan bir dize sözcük alın ve her
    // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
    // "   merhaba dünya  "   %%%merhaba%dünya%%

   public static String boslukSilYuzdeEkle(String str){

        return str.replace(" ","%");
   }




    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk
    public static String ikinciYari(String str){
        return str.substring(str.length()/2);
    }
    public static String ikinciYari2(String str){

        // sanatyağı
         //012345678
        if(str.length()%2==0){
            return str.substring(str.length()/2);
        }else {
            return str.substring(str.length()/2+1);
        }
    }

    public static String ikinciYari3(String str){
//                                                (int) 5.0=5
//                                      (int)Math.ceil(4.5 )
       return str.substring( (int) Math.ceil( (double)str.length()/2   )        );
    }





    //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
    // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
    // ilk bulduğu yeri değiştiren metodu yazınız.
    //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

    public static String ilkKelimeDegistir(String str,String eski,String yeni){

        return str.replaceFirst(eski,yeni);
    }




    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu
    // olan trim metodunu kullanmayın.
    // "   harun merhaba nasılsın   "
    // str.substring(start,end+1)
    // harun merhaba nasılsın

    public static String trim(String str){
        int start=0;
        int end=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                start=i;
                break;
            }
        }

        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)!=' '){
                end=i;
                break;
            }
        }

        return str.substring(start,end+1);

    }


    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii


public static String cokluKelimeYazdir(String str,int adet){
      String result="";
    for (int i = 0; i <str.length() ; i++) {
        for (int j = 0; j < adet; j++) {
            result+=str.charAt(i);
        }
    }
    return result;
}

//tek index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3)=haba
    //  subString(String str,int index)


public static String subString(String str,int index){
      String result="";
      //          3 4  5 6       7
    for (int i = index; i < str.length(); i++) {
        result+=str.charAt(i);
    }
    return  result;

}


//çift index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3,5)=ha
    //  subString(String str,int start, int end)




    public  static String subString(String str,int start,int end){
        String result="";
        for (int i = start; i <end ; i++) {
            result+=str.charAt(i);
        }
        return result;
    }


    //Kullanıcıdan bir kelime ve bir karakter alın
    // ve bu kelimenin istenen karakterin kaç adet olduğunu
    // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a 3 Edirne,e 2


    public static int karakterSay(String str, char c){
        String x=c+"";
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
            }
        }
        return count;
    }

    public static int karakterSay2(String str, String c){
       str=str.toLowerCase();
       c=c.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.substring(i,i+1).equals(c)){
                count++;
            }
        }
        return count;
    }

    public static int karakterSay3(String str, String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int startLength=str.length();
        int finalLength=str.replace(c,"").length();
        return startLength-finalLength;
    }



    //Kullanıcıdan bir kelime ve bir harf alın
    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    //(Merhaba, a) Merhb

    public static void main(String[] args) {
        String kelime="Ankara";
        //             0123456
        System.out.println(harfSil2(kelime,'a'));
    }

public  static String harfSil(String str,char target){
        String target2=target+"";
        return str.replace(target2,"");
}

public static String harfSil2(String str,char target){
        String result="";
    for (int i = 0; i <str.length() ; i++) {
        //    a     !=a  false
        if(str.charAt(i)!=target){
            result+=str.charAt(i);
        }
    }
    return result;



}



}
