package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
           /*
           try blogu yapmaya calistigimiz ama risk oldugunu düsündügümüz
                     islemleri yazmak için kullanılır
           catch den sonraki parantez karsilamyıi beklediğimiz exception turunu
                    javaya söylemek icicn kullanılır
           catch blogu  :  java ya söylediğimiz exception (istisnai durum)gerceklesise
                            Java'nin yapmasini istedigimiz islem

           catch  blogunun onundeki paranteze karsilasmayi bekledigimiz
           exception ı yazabilir veya
           her turlu Exception da devreye girmesini istiyorsak
           tum xceptionların parent ı olan excepption yazabiliriz
            */

            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu,dikkatli ol");
            }


            b--;
            sayac++;
        }
    }
}
