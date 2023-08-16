package juegopokemonpibi;
import java.util.ArrayList;

public class Entrenador {
    
    private String nombre;
    
    
    private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getPokemones() {
        return pokemones;
    }
    
    
    
    
    
    public void Atrapar(Pokemon Parametro){
        
        Pokemon atrapado = (Pokemon) Parametro;
        
        if((int)(pokemones.size()) <= 5){
            System.out.println(Parametro.getNombre() + " Atrapado!");
            pokemones.add(atrapado);
        }else{
            System.out.println(nombre + " ya tiene el maximo de pokemones");
        }
        
        
        
    
    }
   
    
    public void Huir(){
        System.out.println("Has escapado...");
    }
    
    
    public void Mostrar(){
    
        for (Pokemon pokemone : pokemones) {

            System.out.println("El entrenador " + nombre + " tiene a " + 
                    pokemone.getNombre() + " en su equipo\n");
            
            
        }
    
    }
}
