package day34_inheritance;

public class Personel {
      /*
      Eger parent class olacak sekilde tasarladiginiz bir class varsa
      veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
      variable ve method'larin a
      access modifier'ini protected
     */

    int persNo;
    String isim="isim belirtilmedi";
    String departman="Departman belirtilmedi";

    public void maas(){

        System.out.println("Tum personelin maasi vardir");
    }
    public void mesai(){

        System.out.println("Tum personel statusune gore mesai yapar");
    }
    public void fazlaMesaiUcreti(){

        System.out.println("personel fazla mesaisini statusune gore alir");
    }
}
