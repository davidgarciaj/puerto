
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
    private static final int NUMERO_AMARRES = 4;

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
        while(i < NUMERO_AMARRES && !creado){
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
    public void verEstadoAmarres(){
        for(int i = 0; i < NUMERO_AMARRES; i++){
            if(alquileres[i] == null){
                System.out.println("El amarre " + i + " esta libre");
            }
            else{                
                System.out.println("El amarre " + i + " esta ocupado\n" + alquileres[i]);
            }
        }
    }

    /**
     * 
     */
    public float liquidarAlquiler(int posicion){
        float valor = -1;
        if(posicion >= 0 && posicion < 4){
            if(alquileres[posicion] != null){
                valor = alquileres[posicion].getCosteAlquiler();
                alquileres[posicion] = null;
            }
        }
        return valor;
    }
}
