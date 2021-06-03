package Banco;
/**
* Esta clase es 
*
*
*/

public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    @Override
    
    /*
    * Creamos los metodos getters de los atributos Numero e InteresAnual
    */
    
    public String getNumero() {
        return "CTA-AH-".concat(super.getNumero());
    }

    public double getInteresAnual() {
        return interesAnual;
    }
    private boolean isMontovalido(double monto){
        return monto >0;
    }

    public void retirar(double monto){
        if(isMontovalido(monto)){
            setSaldo(getSaldo()-monto);
        }
    }
}
