
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] alquileres;
    private int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * 
     */
    public int addAlquiler(int dias, Cliente cliente, Barco barco){
        boolean creado = false;
        int posicion = -1;
        int i = 0;
        while(posicion < NUMERO_AMARRES && !creado){
            if(alquileres[i] == null){
                alquileres[i] = new Alquiler(dias, cliente, barco);
                posicion = i;
                creado = true;
            }
            i++;
        }
        return posicion;
    }

    /**
     * 
     */
    public void verEstadoAmarre(){
        for(int i = 0; i < NUMERO_AMARRES; i++){
            if(alquileres[i] == null){
                System.out.println(alquileres[i]);
            }
        }
    }

    /**
     * 
     */
    public float liquidarAlquiler(int posicion){
        Alquiler alquiler = alquileres[posicion];
        alquileres[posicion] = null;
        return alquiler.getCosteAlquiler();
    }
}
