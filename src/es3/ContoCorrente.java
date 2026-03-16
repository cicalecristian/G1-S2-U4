package es3;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

//    public void preleva(double x) {
//        if (nMovimenti < maxMovimenti) saldo = saldo - x;
//        else saldo = saldo - x - 0.50;
//        nMovimenti++;
//    }

    public void preleva(double x) throws BancaException {
        try {
            if (nMovimenti < maxMovimenti) {
                saldo -= x;
                if (saldo < 0) {
                    throw new BancaException("il conto è in rosso");
                }
            } else {
                System.out.println("Hai raggiunto il numero massimo di movimenti");
            }
        } finally {
            nMovimenti++;
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
