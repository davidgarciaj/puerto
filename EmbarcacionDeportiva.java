
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class Velero
     */
    public EmbarcacionDeportiva(String matricula, float eslora, int ano, int potencia)
    {
        super(matricula, eslora, ano);
        this.potencia = potencia;
    }

    /**
     *
     * @return     mastiles
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
    /**
     * 
     * @retun dates of the object
     */
    public String toString(){
        return "---- Embarcación Deportiva ----\n" + super.toString() 
                    + "Potencia(en cv): " + potencia + "----------------------";
    }
}
