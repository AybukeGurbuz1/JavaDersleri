package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {


    /*
    map.contains(key) ==> verdiğimiz key in map de olup olmadigini boolean olarak doner
    map.contains(value) ==> bir butun olarak value nun map de olup olmadigini doner

    ONEMLİ NOT: map.contains(value) nun içindeki bir parcayi bulmada ise yaramaz
                eger value
     */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        System.out.println(sinifListMap.containsValue("JDev"));  // false

        // verilen map de JDev degerlerini JavaDeveloper olarak degistirelim
        // map lerde replace tum value yu degistirmek istersek kullanılabilr
        // kısmi değişikliklerde kullanamayız

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Map i guncelleme yapmak için key, yenideger i map e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDevoloper)

        // bunu yapabilmek icin herbir key e ve ona ait value ye ihtiyacim var



      Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each:keySeti
             ) {

            eachValue=sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDevoloper");
            sinifListMap.put(each,eachValue);
            /*
            biz key lerin tamamını aldık
            herbir key in value sunu getirdik
            value uzerindeki degisikliği yapıp
            yeni halini put(key, yeniDeger) ile map e koyduk
             */

        }
        System.out.println(sinifListMap);
    }
}
