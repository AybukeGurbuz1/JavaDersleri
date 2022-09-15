package practice_12_okulProje;

public class Ogretmen extends Kisi{

    private String bolum;
    private String sicilNo;

    public Ogretmen(){
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}' +super.toString();   // kisi den bunu alıcaz
                                        // toString yaptıktan sonra sadece bolum ve sicil no geldi
                                       // kendimiz elle yazdık, babanda ki cons getir gibi
    }
}
