
    /** 
    * package Banco es el paquete donde se crean las clases.
    * @author Lilibeth Puchaicela
    * @author Anthony Franco
    * @versión 1.0
    * @since 20/05/2021
    */
package Banco;


    /**
    * Se crea la clase con el nombre Corriente y sus atributos privados
    * nroMaxCheques y secuencialCh
    * @see extends Cuenta . Hace referencia a la clase Padre
    */

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuencialCh;

    /*
    * Se crea un constructor que llama a sus atributos 
    * @see Super refiere a los atributos de la clase padre
    */
    
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
