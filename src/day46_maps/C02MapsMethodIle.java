package day46_maps;

import java.util.List;
import java.util.Map;

public class C02MapsMethodIle {
    public static void main(String[] args) {

   Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        //value ları sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // Isim ve soyisimlerin birlikte olacagı bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi = " + sinifisimsoyisimList);

        // kac farklı brans varsa bransIsmi = branstakiOgrenciSayisi seklinde yazdirin

}
}
