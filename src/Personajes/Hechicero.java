/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personajes;

import Equipamento.*;

/**
 *
 * @author oscar
 */
public class Hechicero extends Personaje{
	public Hechicero(String nombre, String estatura) {
		super(nombre, estatura);
	}
	@Override
	public Arma crearArma(){
        return new Barita();
    }
	@Override
    public Armadura crearArmadura(){
        return new MantoMagico();
    }
	@Override
    public Montura crearMontura(){
        return new NubeMagica();
    }
}
