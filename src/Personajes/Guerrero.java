/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Equipamento.Arma;
import Equipamento.Armadura;
import Equipamento.Espada;
import Equipamento.MallaDeCota;

/**
 *
 * @author estudiantes
 */
public class Guerrero extends Personaje {
   
	public Guerrero(String nombre, String estatura){
		super(nombre,estatura);
	}
	
	
	@Override
    public Arma crearArma() {
        return new Espada();
    }

    @Override
    public Armadura crearArmadura() {
       return new MallaDeCota();
    }
    
    

 
}
