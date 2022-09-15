package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimlifiyat(satisFiyati));  //90

        System.out.println(satisFiyati); //100

        System.out.println(indirimlifiyat(satisFiyati)); // 90

        // iki farkli method da satisFiyati isminde variable olabilir
        // java buna itiraz etmez cunku , scope ları farklıdır

    }
    public static double indirimlifiyat(double orjinalFiyat) {
        // methodumuz %10 indirim yapip
        // yeni fiyatı main mrthod a döndürsün
        double satisFiyati=orjinalFiyat*0.9;

        return orjinalFiyat*0.9;


}}


