package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";





        int kelimeilkindex = cumle.indexOf(kelime);
        int kelimeSonindex = cumle.lastIndexOf(kelime);

        if (kelimeilkindex==-1) {
            System.out.println("verilen kelime cümlede kullanılmamıs");

        } else if (kelimeilkindex==kelimeSonindex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanılmıs");
        } else {
            System.out.println("verilen kelime cumlede 1 den fazla kullanılmıs");


        }

    }
}
