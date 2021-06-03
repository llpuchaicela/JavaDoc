package Banco;

/** 
* package  es el paquete donde se crean las clases.
* @author Lilibeth Puchaicela
* @author Anthony Franco
* @versión 1.0
* @since 20/05/2021
*/

/**
* Se crea la clase con el nombre SecuencialCheque
*/    
  
public class SecuencialCheque {
    private String inicio;
    private String fin;
    
/*
* Creamos los metodos getter y setter del atributo Inicio
*/    
    
    public String getInicio() {
        return inicio;
    }

    
    
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    
/*
* Creamos los metodos getter y setter del atributo Fin
*/

    public String getFin() {
        return fin;
    }    
    
    public void setFin(String fin) {
        this.fin = fin;
    }
}
