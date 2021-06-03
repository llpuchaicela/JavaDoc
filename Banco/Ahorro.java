package Banco;

public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    @Override
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
