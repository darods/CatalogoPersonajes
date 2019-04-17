/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Montura;

/**
 *
 * @author estudiantes
 */
public abstract  class Personaje {
    private String nombre;
    private String estatura;
    private String rutaImagen;
    
    public Personaje(String nombre , String estatura) {
    	this.nombre = nombre;
    	this.estatura = estatura;
    }
	
    public String getNombre() {
		return nombre;
	}


	public String getEstatura() {
		return estatura;
	}

}
