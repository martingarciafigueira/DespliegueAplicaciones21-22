package cartas;

/**
 * Clase que permite modelar una carta.
 * 
 * @author MarPerez
 * @version 2.0
 *
 */
public class Carta {
    /**
     * El numero de la carta
     */
    private int numero;
    
    /**
     * El palo de la carta
     */
    private int palo;
    
    /**
     * @param numero Numero que se le asignará a la carta
     * @param palo Palo que se le asignará a la carta
     */
    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * Metodo que regresa el numero de la carta
     * @return el numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo que regresa el palo de la carta
     * @return el palo
     */
    public int getPalo() {
        return palo;
    }
    
    /**
     * Metodo que establece el numero de la carta
     * @param numero Numero a establecer
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Metodo que establece el palo de la carta
     * @param palo Palo a establecer
     */
    public void setPalo(int palo) {
        this.palo = palo;
    }

    /* (sin Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        return "La carta es el " + this.numero + " de " + this.palo + "<br>";
    }
    
}
