
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Velero
     */
    public Yate(String matricula, float eslora, int ano, int potencia, int camarotes)
    {
        super(matricula, eslora, ano, potencia);
        this.camarotes = camarotes;
    }

    /**
     *
     * @return     mastiles
     */
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * 
     * @retun dates of the object
     */
    public String toString(){
        return "---- Yate ----\n" + super.toString() 
                    + "Camarotes: " + camarotes;
    }
}
