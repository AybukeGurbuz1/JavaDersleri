package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
          System.out.println(str);
          deger atamasi yapmadan bir variable ı kullanmaya calisirsaniz
          Java Compile Time da bunu farkeder ve size izin vermez
        */

        str=null;

        //System.out.println(str.length());
        //NullPointerException

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj;  // ClassCastException

        /*
        String str2="Hava civa";
        Integer sayi2=str2;
        java bazi casting islemlerinde compile time da izin vermez

        Ancak bazen syntax uygun olabilir

        */

        Thread.sleep(5000);
    }
}
