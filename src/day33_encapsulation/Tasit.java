package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarmi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter methodu da tek bir satirlik islem yapiyor
    // baska class larin private oldugu icin erisemedigi
    // tasit turu bilgisini, class icinden alip
    // istenen farkli class'lar return ediyor


    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde
    // bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }
    // boolean variable lar icin getter method larının ismi
    // isVariableIsmi seklinde olur
    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
