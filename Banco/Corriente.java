
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
    * @param saldo, atributo de clase padre Cuenta
    * @param numero, atributo de clase padre Cuenta
    */
    
    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }// Cierro constructor

    /*
    * Creamos los metodos getter del atributo NroMaxCheques y secuencialCh
    */
    
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }//Cierro metodo
    
    public SecuencialCheque getSecuencialCh() {
        return secuencialCh;
    }//Cierro metodo
    
    /*
    * Creamos metodo setter del atributo NroMaxCheques
    * @param nroMaxCheques, atributo de clase corriente 
    * indica el número de cheques
    */

    
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }//Cierro metodo

    /*
    * Creamos metodo setter del atributo secunecialCh
    * @param secuencialCh, atributo de clase corriente
    */

    public void setSecuencialCh(SecuencialCheque secuencialCh) {
        this.secuencialCh = secuencialCh;
    }//Cierro metodo
}
