package Banco;

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secunecialCh;


    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    public SecuencialCheque getSecunecialCh() {
        return secunecialCh;
    }

    public void setSecunecialCh(SecuencialCheque secunecialCh) {
        this.secunecialCh = secunecialCh;
    }
}
