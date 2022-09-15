package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        // arb1 objesi uzerinden marka variable na
        //ulasabildim, degistirebildim(set) ve yazdirabildim (get)

        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable na ulasimi
        //tamamen serbest yapilir veya tamamen engelleyebilirim
        //private yaptıgımız model'e ise hic ulasamayiz
        //yani access modifier ya hep ya hic diyor

        //model i degistirelim ama goremeyelim
        //yakiti da  gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanımlamak isterseniz
        // 1. adim - ozel yetki tanimlayacaginiz variable lari private yapin
        //           private bir data ya baska class lardan ulasmak mumkun olmadigindan
        //2. adim  - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla"); // model olarak Corolla yı atadık
        // model i yazdırma imkanımız yok, cunku getter method u yok
        System.out.println(arb1.getYakit()); // elektrikli bilgisini yazdirabildik
        // yakiti degistirremeyiz cunku setter methodu yok
    }
}
