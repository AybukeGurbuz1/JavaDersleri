package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil

        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        // "qazwsx"


        str=str.replace(" ","qazwsx");
        System.out.println(str);

        str=str.replaceAll("\\W","");   //  \\W --->harfler ve rakamlar dısındaki tüm krktrler
        System.out.println(str);                       // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");  //   \\d ---> rakamlar (0-9)
        // istenmeyen ozel karakter ve sayilardan kurtulduk

        // simdi space'leri geri getirelim
        str=str.replace("qazwsx"," ");
        System.out.println(str);
    }
}
