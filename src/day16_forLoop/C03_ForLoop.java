package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin
         // bir yerden baslayip bir yere kadar herşeyi tekrardan oluşturma varsa for loop

        int bas=20;     // dinamik
        int son=35;

        for (int i = bas; i <=son ; i++) {

            if (i<son){
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
        }
    }
}
