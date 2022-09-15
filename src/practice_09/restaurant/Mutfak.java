package practice_09.restaurant;

public class Mutfak {

    public String yemekler = "adanakebab, urfaciger,kusbasi, kusleme";

    public String arasicak = "yaylacorba, mercimek,duguncorba, corba";

    public String tatlilar = "baklava, sutlac,gullac, kazandibi, kunefe";

    public String icecekler = "ayran, salgam,kola";

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler = adanakebab;
        this.arasicak = mercimek;
        this.tatlilar = kunefe;
        this.icecekler = salgam;

    }

    public Mutfak() {

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\narasicak='" + arasicak + '\'' +
                ",\ntatlilar='" + tatlilar + '\'' +
                ",\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
