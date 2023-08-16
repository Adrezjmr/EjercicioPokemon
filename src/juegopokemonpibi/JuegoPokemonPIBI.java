package juegopokemonpibi;

import java.util.Scanner;
import java.util.ArrayList;


public class JuegoPokemonPIBI {


    public static void main(String[] args) {

        ArrayList entrenadores = new ArrayList();
        ArrayList pokedex = new ArrayList();
        
        Entrenador acrez = new Entrenador("Acrez");
        
        entrenadores.add(acrez);
        
        Pokemon charmander = new Pokemon("Charmander", "Fuego", 150);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 170);
        Pokemon squirtle = new Pokemon("Squirtle", "Agua", 160);
        
        pokedex.add(bulbasaur);
        pokedex.add(charmander);
        pokedex.add(squirtle);

        int opcion = -1;
        int seleccion = -1;
        

        String tipos[] = {"Agua", "Fuego", "Planta"};

        Scanner teclado = new Scanner(System.in);
        while (opcion != 0) {
            System.out.println("##################################");
            System.out.println("SELECCIONA OPCION");
            System.out.println("1- Ingresar Entrenador");
            System.out.println("2- Seleccionar Entrenador");
            System.out.println("3- Crear Pokemon");
            System.out.println("4- Ver PokeDex");
            System.out.println("5- Caminar por la Hierba Alta");
            System.out.println("6- Mostrar pokemon de entrenador");
            System.out.println("0- Salir");
            System.out.println("##################################");
          
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingresar Entrenador");
                    
                    System.out.print("Ingrese Nombre: ");
                    String nombreEntrenador = teclado.nextLine();
                    
                    Entrenador entrenadorObjeto = new Entrenador(nombreEntrenador);
                    entrenadores.add(entrenadorObjeto);
                    break;
                }
                case 2: {
                    System.out.println("Seleccionar Entrenador");
                    int contador = 0;
                    for (Object anObject : entrenadores) {

                        Entrenador auxiliar = (Entrenador) anObject;

                        System.out.println("El entrenador "
                                + contador + " es " + auxiliar.getNombre());
                        contador += 1;
                    }
                    
                    System.out.print("Seleccionar Entrenador: ");
                    seleccion = teclado.nextInt();
                    teclado.nextLine();
                    

                    break;
                }
                case 3: 
                    System.out.println("Crear Pokemon");
                    
                    System.out.print("Ingrese Nombre: ");
                    String nombrePokemon = teclado.nextLine();
                    

                    System.out.print("Ingrese Tipo: ");
                    int numeroTipo = teclado.nextInt();
                    teclado.nextLine();
                    String tipoSeleccionado = tipos[numeroTipo];
                    
                    
                   System.out.print("Ingrese vida: ");
                    int vida = teclado.nextInt();
                    teclado.nextLine();
                    
                    

                    Pokemon pokemonObjeto = new Pokemon(nombrePokemon,tipoSeleccionado,vida);
                    pokedex.add(pokemonObjeto);
                    break;
                
                case 4: {
                    System.out.println("Ver PokeDex");
                                   int contador = 0;
                    for (Object anObject : pokedex) {

                        Pokemon auxiliar = (Pokemon) anObject;

                        System.out.println("El pokemon # "
                                + contador + " es " + auxiliar.getNombre() + " de tipo " + 
                                auxiliar.getTipo() + " y su vida es " + auxiliar.getVida());
                        contador += 1;
                    }
                    
                    break;
                }
                case 5: {
                    
                    if (seleccion < 0){
                        System.out.println("Entrenador escogido no existe");
                        return;
                    
                    }else if(seleccion > entrenadores.size()){
                        System.out.println("Entrenador escogido no existe");
                        return;
                    }
                    int aleatorio = 0;
                    aleatorio = (int) (Math.random() * pokedex.size());
                    Pokemon pokemonSalvaje = (Pokemon) pokedex.get(aleatorio);
                    Entrenador entrenadorUso = (Entrenador) entrenadores.get(seleccion);
                    
                    System.out.println("Caminar por la Hierba Alta");
                    System.out.println("Un " + pokemonSalvaje.getNombre() + 
                            " salvaje ha aparecido");
                    System.out.println("Que desea hacer? Escoja una "
                            + "de las siguientes opciones");
                    System.out.println("1. Capturar\n2. Huir");
                    int accion = teclado.nextInt();
                    if(accion == 1){
                       
                        entrenadorUso.Atrapar(pokemonSalvaje);
                    
                    
                    }else if(accion == 2){
                        entrenadorUso.Huir();
                }

                    break;
                }
                
                case 6:{
                    Entrenador mostrarPokemones = (Entrenador) entrenadores.get(seleccion);
                    
                    mostrarPokemones.Mostrar();
                        
                    }
                    
                    break;
                
                case 0: {
                    System.out.println("Saliendo del programa, todos los datos serán Borrados");
                    break;
                }
                default: {
                    System.out.println("No existe la opción");
                    break;
                }
            }

        }
    }

}
