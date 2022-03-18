package cartas;

/**
 * Clase que modela una baraja española.
 * 
 * @author MarPerez
 * @version 2.0
 * @see Baraja
 * 
 */
public class BarajaEspanhola extends Baraja {

    /**
     * La inclusión de los números ochos y nueves
     */
    protected boolean incluir8y9 = false;

    /**
     * Metodo que crea la baraja de cartas
     */
    public void crearBaraja() {
    }

    /**
     * Metodo que regresa si se incluyen los ochos y nueves en la baraja
     * @return el incluir8y9
     */
    public boolean getIncluir8y9() {
        return this.incluir8y9;
    }
    
    /**
     * Metodo que establece si se incluyen los ochos y nueves en la baraja
     * @param incluir8y9 Inclusión de ochos y nueves
     */
    public void setIncluir8y9(boolean incluir8y9) {
        this.incluir8y9 = incluir8y9;
    }

    /**
     * Metodo que compara dos barajas de cartas
     * @param baraja Baraja a comparar
     */
    public void compareTo(Baraja baraja) {
        if (baraja instanceof BarajaEspanhola) {
            System.out.println("Las dos barajas son españolas");
        }
        else
        {
            System.out.println("Las barajas son diferentes");
        }
    }    

}
