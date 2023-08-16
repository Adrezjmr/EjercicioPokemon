/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopokemonpibi;

/**
 *
 * @author CETECOM
 */
public class Pokemon {
    private String nombre, tipo;
    private int vida;

    public Pokemon(String nombre, String tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }
    
    
}
