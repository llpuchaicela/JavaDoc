    /** 
    * package Banco es el paquete donde se crean las clases.
    * @author Lilibeth Puchaicela
    * @author Anthony Franco
    * @versión 1.0
    * @since 20/05/2021
    */

package Banco;

    /**
    * Se crea la clase con el nombre Ahorro que extiendede la clase Cuenta
    * y su atributo privado interesAnual con tipo de dato double
    * @see extends Cuenta . Hace referencia a la clase Padre
    */

public class Ahorro extends Cuenta{
    private double interesAnual;

    /*
    * Se crea un constructor que llama a su atributo interesAnual
    * @see Super refiere a los atributos de la clase padre
    */
    
    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

   //Creamos los metodos getters de los atributos Numero e InteresAnual

    
    @Override 
        
    
    /*
    * Metodo sobreescrito getNúmero  
    * @see getNumero, referencia del metodo de clase cuenta
    */
    
    public String getNumero() {
        return "CTA-AH-".concat(super.getNumero());
    }

    public double getInteresAnual() {
        return interesAnual;
    }
    
    /**
    * @param monto: valida si el monto es valido
    * @return monto : devuelve el valor si el monto a retirar es mayor a 0 
    */
    
    private boolean isMontovalido(double monto){
        return monto > 0;
    }

    /**
    * Metodo para retirar un monto de la cuenta
    * @param monto: valida si el monto es valido procede con el retiro
    */
    
    public void retirar(double monto){
        if(isMontovalido(monto)){
            setSaldo(getSaldo()-monto);
        }
    }
}
