package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 2 integer ı toplayıp sonucunu yazdıran
        // bir method oluşturun

        int input1=10;
        int input2=20;

        // method 4 adımda oluşturulur
        // 1. adım method call
        // 2.adım argument eklenmesi gerekiyorsa ekleyelim
        //   eğer method un return type ı void den farklı olacaksa
        //   bir variable oluşturup, method call u assign edelim

        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {
        // 3. adım method deklarasyonunda değiştirilmesi gereken
        // bolumleri değiştir ( acsess modifier, return type vb.. )
        // 4. eğer return type dışında birşeyse 
        //    return keywordu ve dönecek değeri hesaplamalıyız
        System.out.println("girilen iki sayinin toplami :" + (input1+input2));
    }
}
