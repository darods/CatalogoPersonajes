/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Equipamento.Arco;
import Equipamento.Arma;
import Equipamento.Armadura;
import Equipamento.EscamasDragon;
import Equipamento.LoboInfernal;
import Equipamento.Montura;

/**
 *
 * @author nasa
 */
public class ElfoOscuro extends Personaje{

    public ElfoOscuro(String nombre, String estatura) {
        super(nombre, estatura);
    }

    @Override
    public Arma crearArma() {
        return new Arco();
    }

    @Override
    public Armadura crearArmadura() {
        return new EscamasDragon();
    }
    
    @Override
    public Montura crearMontura() {
        return new LoboInfernal();
    }
    
}
