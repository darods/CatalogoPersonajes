package Factorias;

import Animaciones.Ataque.AtaqueGeneral;
import Animaciones.Ataque.AtaqueGuerrero;
import Equipamento.Arma.Arma;
import Equipamento.Arma.Espada;
import Equipamento.Armadura.Armadura;
import Equipamento.Armadura.MallaDeCota;
import Equipamento.Montura.Caballo;
import Equipamento.Montura.Montura;
import Personajes.Guerrero;
import Personajes.Personaje;

public class FactoriaMelee extends AbstractFactory{
    @Override
    public Personaje CreateProdructA() {
        return new Guerrero("Scar domador de dragones","1.95");
    }

    @Override
    public Arma CreateProdructB() {
        return new Espada();
    }

    @Override
    public Armadura CreateProdructC() {
        return new MallaDeCota();
    }

    @Override
    public Montura CreateProdructD() {
        return new Caballo();
    }

    @Override
    public AtaqueGeneral CreateProductE() {return new AtaqueGuerrero("./img/Guerrero/animacionGuerrero.gif"); }


}
