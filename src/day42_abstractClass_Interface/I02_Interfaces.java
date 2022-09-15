package day42_abstractClass_Interface;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface I02_Interfaces {
    /*
    Interface bir class değildir

    Abstract class lar java da abstraction(soyutlaştırma/kural koyma)
    işlevini yapıyordu
    Ancak bir class da abstract olmayan method lar da olabilir
    bu da full abstraction yapmaya izin vermez

    Eğer Java da içinde hiç concrete method olmasın
    dediğimiz bir class oluşturmak istiyorsanız
    bunu class değil Interface yapmalisiniz

    1-INTERFACE LERDE CONCRETE METHOD OLMAZ
    2-Interface ler full abstraction yaptığından Interface lerden obje oluşturulamaz

    Hatirladiğiniz gibi  Interface olan List den direk obje olusturamiyorduk
    List<String> liste = new list <>();  calismaz
    Bunun yerine constructor ı List in child i olan ArrayList den seçeriz

    List<String> liste = new ArrayList<>();

    3-Class larda bir child birden fazla parent edinemez
      Ancak Interface'lerde concrete method olmadigindan
      biz her methodu

     */


}
