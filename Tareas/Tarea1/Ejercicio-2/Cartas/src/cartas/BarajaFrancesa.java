package cartas;

/**
 * Clase que modela una baraja francesa.
 * 
 * @author MarPerez
 * @version 2.0
 * @see Baraja
 * 
 */
public class BarajaFrancesa extends Baraja {

    /**
     * Metodo que crea la baraja de cartas
     */
    public void crearBaraja() {
    }

    /**
     * Metodo que compara dos barajas de cartas
     * @param baraja Baraja a comparar
     */
    public void compareTo(Baraja baraja) {
        if (baraja instanceof BarajaFrancesa) {
            System.out.println("Las dos barajas son francesas");
        } else {
            System.out.println("Las barajas son diferentes");
        }
    }

}
