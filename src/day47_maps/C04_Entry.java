package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        //Map in her bir elemanı alt alta yazdirin
        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }
        // Map in elemanlarında varsa tester kurs ismini QA olarak değiştirelim

        String eachValue;
        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}
