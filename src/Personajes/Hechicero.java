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
public class Hechicero {
    public Arma crearArma(){
        return new Barita();
    }
    public Armadura crearArmadura(){
        return new MantoMagico();
    }
    public Montura crearMontura(){
        return new NubeMagica();
    }
}
