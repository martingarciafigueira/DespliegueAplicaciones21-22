package cartas;

/**
 * Clase abstracta que modela una baraja y la gestiona.
 * 
 * @author MarPerez
 * @version 2.0
 * 
 */
public abstract class Baraja implements BarajaCartas {

    /**
     * El conjunto de cartas que componen la baraja
     */
    protected Carta[] cartas;
    
    /**
     * La posicion de la siguiente carta de la baraja
     */
    protected int posSiguienteCarta = 0;
    
    /**
     * El numero total de cartas de la baraja
     */
    protected static int NUM_CARTAS = 40;

    /**
     * Metodo que regresa el conjunto de cartas de la baraja
     * @return las cartas
     */
    public Carta[] getCartas() {
        return cartas;
    }

    /**
     * Metodo que regresa la posición de la siguiente carta de la baraja
     * @return el posSiguienteCarta
     */
    public int getPosSiguienteCarta() {
        return posSiguienteCarta;
    }

    /**
     * Metodo que regresa el numero de cartas que compone la baraja
     * @return el NUM_CARTAS
     */
    public static int getNUM_CARTAS() {
        return NUM_CARTAS;
    }

    /**
     * Metodo que establece las cartas que conforman la baraja
     * @param cartas Cartas a establecer
     */
    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    /**
     * Metodo que establece ela posicion de la siguiente la carta de la baraja
     * @param posSiguienteCarta Posicion de la siguiente carta a establecer
     */
    public void setPosSiguienteCarta(int posSiguienteCarta) {
        this.posSiguienteCarta = posSiguienteCarta;
    }
    
    /**
     * Metodo que establece el numero de cartas total de la baraja
     * @param NUM_CARTAS Numero de cartas
     */
    public static void setNUM_CARTAS(int NUM_CARTAS) {
        NUM_CARTAS = NUM_CARTAS;
    }

    /**
     * Metodo que añade una carta a la baraja
     * @param unaCarta Carta a añadir
     */
    protected void addCarta(Carta unaCarta) {
        this.cartas[cartas.length - 1] = unaCarta;
    }
    
    /**
     * Metodo abstracto que crea la baraja de cartas
     */
    abstract void crearBaraja();

    /**
     * Metodo que regresa las cartas barajadas
     */
    public void barajar() {
    }

    /**
     * Metodo que regresa las siguiente carta de la baraja
     */
    public void siguienteCarta() {
    }

    /**
     * Metodo que regresa las cartas disponibles de la baraja
     */
    public void cartasDisponibles() {
    }
    
    /**
     * Metodo que regresa un número de cartas pedidas
     * @param cartasPedidas las cartas pedidas por el jugador
     */
    public void repartirCartas(int cartasPedidas) {
    }
    
    /**
     * Metodo que regresa las cartas repartidas
     */
    public void cartasRepartidas() {
    }
    
    /**
     * Metodo que regresa la baraja de cartas
     */
    public void mostrarBaraja() {
    }

}
