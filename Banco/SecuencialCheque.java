package Banco;

/** 
* package Banco es el paquete donde se crean las clases.
* @author Lilibeth Puchaicela
* @author Anthony Franco
* @versión 1.0
* @since 20/05/2021
*/

/**
* Se crea la clase con el nombre SecuencialCheque
* con atributos privados de tipo String Inicio y fin
*/    
  
public class SecuencialCheque {
    private String inicio;
    private String fin;
    
/*
* Creamos los metodos getter  del atributo Inicio
*/    


    public String getFin() {
        return fin;
    }    
  
    public String getInicio() {
        return inicio;
    }

    

/*
* Creamos los metodos setter del atributo Fin
*/
    
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    
    
    public void setFin(String fin) {
        this.fin = fin;
    }
}
