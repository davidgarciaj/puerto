import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private ArrayList<Alquiler> alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }

    /**
     * 
     */
    public int addAlquiler(int dias, Cliente cliente, Barco barco){
        boolean creado = false;
        boolean exist = false;
        int posicion = -1;
        int i = 0;
        int t;
        while(i < NUMERO_AMARRES && !creado){
            t = i;
            while(t < alquileres.size()){
                if(alquileres.get(t).getPosicion() == i){                    
                    exist = true;
                }
                t++;
            }
            if(!exist || t > alquileres.size()){
                posicion = i;
                alquileres.add(i, new Alquiler(dias, cliente, barco, i));
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
        int t = 0;
        for(int i = 0; i < alquileres.size() && t < NUMERO_AMARRES; i++){
            if(alquileres.get(i).getPosicion() == i){                
                System.out.println("El amarre " + t + " esta ocupado\n" + alquileres.get(i));
            }
            else{                
                System.out.println("El amarre " + t + " esta libre");
                i--;
            }
            t++;
        }
    }

    /**
     * 
     */
    public float liquidarAlquiler(int posicion){
        float valor = -1;
        boolean find = false;
        if(posicion >= 0 && posicion < NUMERO_AMARRES){
            int i = 0;
            while (i < alquileres.size() && !find){
                if(alquileres.get(i).getPosicion() == posicion){
                    valor = alquileres.remove(i).getCosteAlquiler();
                    find = true;
                }
            }
        }
        return valor;
    }
}
