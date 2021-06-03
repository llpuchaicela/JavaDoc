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

    public final void setSaldo(double saldo) {
        if(!validarSaldoNoNegativo(saldo)){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Saldo negativo");
        }

    }
    private boolean validarSaldoNoNegativo(double saldo){
        return saldo < 0;
    }



    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura= LocalDate.now();
    }



    public void depositar(double monto){
        if(monto>0){
            this.saldo= this.saldo+ monto;
        }else{
            throw new IllegalArgumentException("Monto negativo");
        }
    }

}
