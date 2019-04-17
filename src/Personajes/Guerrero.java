/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Caballo;
import Equipamento.Arma.Espada;
import Equipamento.Armadura.MallaDeCota;
import Equipamento.Montura.Montura;

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
    
    @Override
    public Montura crearMontura() {
       return new Caballo();
    }
    

 
}
