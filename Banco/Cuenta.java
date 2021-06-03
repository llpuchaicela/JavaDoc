package Banco;

    /** 
    * package  es el paquete donde se crean las clases.
    * @author Lilibeth Puchaicela
    * @author Anthony Franco
    * @versión 1.0
    * @since 20/05/2021
    */

import java.time.LocalDate;

    /**
    * Se crea la clase con el nombre Cuenta la cual será 
    * que tiene atributos privados
    * Y se importa la clase LocalDate 
    */

public class Cuenta {
    private double saldo; 
    protected String numero; 
    private LocalDate fechaApertura;

    /*
    *Se crea el constructor donde se utiliza los parametros para saldo y numero
    *y la fechaApertura que seria la fecha actual.
    */
    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura= LocalDate.now();
    }
    
    /*
    * Creamos los metodos getters de los atributos saldo y nombre
    */

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
    /*
    * Creamos los metodos setters de los atributos saldo y nombre
    */
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /*
    * Metodo para validar que no admita saldos negativos
    * @param  saldo que define la cantidad de dinero que tiene el la cuenta
    * @exception throw que lanza un mensaje "saldo negativo"
    * @throw "Excepcion"  que nos indica que el saldo es negativo o no se cumple la condición.
    */
    
    public  void setSaldo(double saldo) {
        if(!validarSaldoNoNegativo(saldo)){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Saldo negativo");
        }

    }
    
    /**
    * Metodo privado para validar saldo negativo
    * @param saldo define el valor del saldo que tiene la clase
    * @return saldo si su valor es menor que 0
    */
    
    private boolean validarSaldoNoNegativo(double saldo){
        return saldo < 0;
    }

    /**
    * Metodo publico depositar 
    * @param monto define el valor que va a depositar en la cuenta
    * @exception throw que lanza un mensaje "Monto negativo o igual a 0"
    * @throws excepcion que presenta un mensaje cuando la condicion no se cumple.
    */
    
    public void depositar(double monto){
        if(monto>0){
            this.saldo= this.saldo+ monto;
        }else{ 
            throw new IllegalArgumentException("Monto negativo o igual a 0");
        }
    }

}
