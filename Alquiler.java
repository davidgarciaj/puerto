
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private int posicion;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco, int posicion)
    {
        this.numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
        this.posicion = posicion;
    }

    /**
     * 
     * @return     numero de dias que el barco permanece en el amarre 
     */
    public float getCosteAlquiler()
    {
        return numeroDias *(MULTIPLICADOR_ESLORA * barco.getEslora()) 
                + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }

    /**
     * 
     * @return     posicion del amarre 
     */
    public int getPosicion()
    {
        return posicion;
    }
    
    /**
     * 
     * @return    dates of the object
     */
    public String toString(){
        return "-------- Alquiler de Amarre --------\n" + cliente + "\n" + barco +
                  "\nDias de permanenecia: " + numeroDias +
                  "\n------------------------------------";    
    }
}
