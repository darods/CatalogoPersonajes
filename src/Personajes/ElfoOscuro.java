/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Equipamento.Arma.Arco;
import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Armadura.EscamasDragon;
import Equipamento.Montura.LoboInfernal;
import Equipamento.Montura.Montura;

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
