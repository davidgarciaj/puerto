
/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;
    
    public Barco(String matricula, float eslora, int ano){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = ano;
    }

    /**
     *
     * @return        year of the fabrication of this object
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }

    /**
     *
     * @return        eslora
     */
    public float getEslora()
    {
        return eslora;
    }

    /**
     *
     * @return        matricula
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    public abstract int getCoeficienteDeBernua();

    /**
     *
     * @return        dates of this object
     */
    public String toString()
    {
        return "Matricula: " + matricula + "\nEslora: " +
            eslora + "\nAño de Fabricación: " + anoFabricacion + "/n";
    }
}
