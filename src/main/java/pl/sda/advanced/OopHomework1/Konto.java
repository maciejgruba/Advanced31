package pl.sda.advanced.OopHomework1;

public class Konto {
    private double stanKonta;
    private String wlascicielKonta;

    public Konto(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public Konto(String wlascicielKonta) {
        this.wlascicielKonta = wlascicielKonta;
    }
    public  double wplataNaKonto(){
        double kwotaWplaty = 100;
        double result = (stanKonta + kwotaWplaty);
        return result;
    }
}
