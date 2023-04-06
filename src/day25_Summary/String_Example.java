package day25_Summary;

import java.util.Scanner;

public class String_Example {

    //length();
   // girilen String bir ifadenin uzunluğunu döndüren metodu yazınız





//length()
public static int uzunluk(String str){
    return str.length();
}

    // toLowerCase()
public static String harfleriKucult(String str){
    return str.toLowerCase();
}
//toUpperCase()
public static String harfleriBuyut(String str){
    return str.toUpperCase();
}

//charAt()

    // merhaba
    // 0123456

    public static char karakterGetir(String str,int index){
    return str.charAt(index);
    }


//concat()
    public static String birlestir(String a,String b){
    return a.concat(b);
    }
    public static String birlestir2(String a,String b){
        return a+b;
    }

//contains()
    public static boolean iceriyorMu(String str,String kontrolEdilecekKelime){
    return str.contains(kontrolEdilecekKelime);
    }

    public static boolean iceriyorMu2(String str,String kontrolEdilecekKelime){
    if(str.indexOf(kontrolEdilecekKelime)<0){
        return false;
    }
    return true;

    }

  //Trim()   stringin başında ve sonundaki boşlukları siliyor

    public static String bosluklariSil(String str){

    return  str.trim();
    }

    //replace()  benim verdiğim değer ile değiştir.

    public static String kelimeDegistir(String str,String eskiKelime,String yeniKelime){
    return str.replace(eskiKelime,yeniKelime);
    }

    //replaceFirst()

    public static String kelimeDegistirIlk(String str,String eskiKelime,String yeniKelime){
        return str.replaceFirst(eskiKelime,yeniKelime);
    }

//indexOf()


    // merhaba
    // 0123456
    // abak

    public static int ilkIndexNoGetir(String str,String kelime){
    return str.indexOf(kelime);
    }
    public static int ilkIndexNoGetir(String str,char kelime){
        return str.indexOf(kelime);
    }

    public static  int ikinciKelimedeVarMi(String str1,String str2){
     return str2.indexOf( str1.trim().charAt(0));
    }

    //lastIndexOf()

    public static int sonIndexNoGetir(String str,char kelime){
        return str.lastIndexOf(kelime);
    }
    public static int sonIndexNoGetir(String str,String kelime){
        return str.lastIndexOf(kelime);
    }

    //Merhaba
    //0123456
    //a 6

//equals()

    public static boolean esitMi(String a,String b){


    return a.equals(b);

    }

//equalsIgnorecase()
public static boolean esitMiBuyukKucukIhmalEt(String a,String b){

    return a.equalsIgnoreCase(b);

}
 //== referansları kontrol eder


    //isEmpty()

    public static boolean tamamenBosMu(String str){

    return str.isEmpty();
    }

    //isBlank()
    public static boolean spaceHaricindeKarakterVarMi(String str){

        return str.isBlank();
    }


//starsWith()
    public static boolean baslıyorMu(String kelime, String kontrolEdilecekKelime){
    return kelime.startsWith(kontrolEdilecekKelime);
    }
  //  endsWiths
  public static boolean bitiyorMu(String kelime, String kontrolEdilecekKelime){
      return kelime.endsWith(kontrolEdilecekKelime);
  }


  //substring(int beginIndex)
    //substring(int beginIndex, int endIndex)

    public  static String indektenItibarenYaz(String str,int index){
    return str.substring(index);
    }

    public  static String indektenItibarenYaz(String str,int startIndex,int endIndex){
        return str.substring(startIndex,endIndex);
    }

    //Merhaba
    //0123456

//method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
//eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
//sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
//kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
//ise kullanıcıyı aynı sürece sokun ..(

    public static boolean soru5(String a,String b){
    if(a.equalsIgnoreCase(b)){
        System.out.println( "kelimeler aynı");
        return true;
    }
     if(a.length()==b.length()){
         System.out.println( "girdiğiniz kelimelerin karekter sayısı eşit");
         return true;
    }
        System.out.println( "kelimeler aynı değil ve  uzunlukları aynı değil");
     return false;

    }



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
     boolean flag=true;
     while (flag){
         System.out.print("1.kelime: ");
         String str5= scan.nextLine();
         System.out.print("2.kelime: ");
         String str6= scan.nextLine();
         flag=!soru5(str5,str6);
     }

        // str5.length()==0   isEmpty() true
     //  str5.replace(" ","").length()==0  is blank true
    }



}
