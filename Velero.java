
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int mastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int mastiles, String matricula, float eslora, int ano)
    {
        super(matricula, eslora, ano);
        this.mastiles = mastiles;
    }

    /**
     *
     * @return     mastiles
     */
    public int getCoeficienteBernua()
    {
        return mastiles;
    }
    
    /**
     * 
     * @retun dates of the object
     */
    public String toString(){
        return "---- Velero ----\n" + super.toString() 
                    + "Nº de mastiles: " + mastiles;
    }
}
