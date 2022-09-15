package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulumdugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu, var olan eski ürünler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler= new ArrayList<>();
        //listede ki ikram ın yerine biskrem koyalim
        //ikram ı da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler Listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);



    }
}
