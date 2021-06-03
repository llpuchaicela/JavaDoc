package Banco;

/** 
* package  es el paquete donde se crean las clases.
* @author Lilibeth Puchaicela
* @author Anthony Franco
* @versión 1.0
* @since 20/05/2021
*/

/**
* Se crea la clase con el nombre Corriente
*/

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secunecialCh;


    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    /*
    * Creamos los metodos getter y setter del atributo NroMaxCheques
    */
    
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
