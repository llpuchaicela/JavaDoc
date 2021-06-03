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
* Creamos los metodos getter  del atributo Inicio y Fin
*/    


    public String getFin() {
        return fin;
    }    //Cierro metodo
  
    public String getInicio() {
        return inicio;
    } //Cierro metodo

    

/*
* Creamos metodo setter del atributo Inicio
* @param Inicio , atributo de clase SecuencialCheque
*/
    
    public void setInicio(String inicio) {
        this.inicio = inicio;
    } //Cierro metodo
    

/*
* Creamos metodo setter del atributo Fin
@param Fin , atributo de clase SecuencialCheque
*/
    
    public void setFin(String fin) {
        this.fin = fin;
    }//Cierro metodo
}
