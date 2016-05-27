
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
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        this.numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
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
     * @return    dates of the object
     */
    public String toString(){
        return "-------- Alquiler de Amarre --------\n" + cliente + "\n" + barco +
                  "\nDias de permanenecia: " + numeroDias +
                  "\n------------------------------------";    
    }
}
