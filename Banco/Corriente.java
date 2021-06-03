package Banco;

/** 
* package Banco es el paquete donde se crean las clases.
* @author Lilibeth Puchaicela
* @author Anthony Franco
* @versión 1.0
* @since 20/05/2021
*/

/**
* Se crea la clase con el nombre Corriente y sus atributos privados
* nroMaxCheques y secuencialCh
*/

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuencialCh;


    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    /*
    * Creamos los metodos getter del atributo NroMaxCheques
    */
    
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }
    
    public SecuencialCheque getSecuencialCh() {
        return secuencialCh;
    }
    
    /*
    * Creamos los metodos setter del atributo NroMaxCheques
    */

    
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }


    public void setSecuencialCh(SecuencialCheque secuencialCh) {
        this.secuencialCh = secuencialCh;
    }
}
