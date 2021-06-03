package Banco;

/** 
* package  es el paquete donde se crean las clases.
* @author Lilibeth Puchaicela
* @author Anthony Franco
* @versión 1.0
* @since 20/05/2021
*/

public class SecuencialCheque {
    private String inicio;
    private String fin;

/**
* Se crea la clase con el nombre SecuencialCheque
*/    
  
    
/*
* Creamos el metodo getter del atributo Inicio
*/    
    
    public String getInicio() {
        return inicio;
    }

    
    
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    
/*
* Creamos el metodo getter del atributo Fin
*/    

    public String getFin() {
        return fin;
    }

/*
* Creamos el metodo setter del atributo Fin
*/    
    
    public void setFin(String fin) {
        this.fin = fin;
    }
}
