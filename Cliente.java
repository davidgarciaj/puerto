
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /** 
     * 
     * @return     dni 
     */
    public String getDni()
    {
        return dni;
    }

    /** 
     * 
     * @return     nombre 
     */
    public String getNombre()
    {
        return nombre;
    }

    /** 
     * 
     * @return     all dates of the object 
     */
    @Override
    public String toString()
    {
        return "------Cliente------\nCliente: " + nombre + "\nDni: " + dni + "\n---------------------";
    }
}
