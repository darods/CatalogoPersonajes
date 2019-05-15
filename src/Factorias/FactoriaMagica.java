package Factorias;

import Animaciones.Ataque.AtaqueGeneral;
import Animaciones.Ataque.AtaqueHechicero;
import Equipamento.Arma.Arma;
import Equipamento.Arma.Barita;
import Equipamento.Armadura.Armadura;
import Equipamento.Armadura.MantoMagico;
import Equipamento.Montura.Montura;
import Equipamento.Montura.NubeMagica;
import Personajes.Hechicero;
import Personajes.Personaje;

public class FactoriaMagica extends AbstractFactory{

    @Override
    public Personaje CreateProdructA() {
        return new Hechicero("Merlin principe de las tinieblas","1.50");
    }

    @Override
    public Arma CreateProdructB() {
        return new Barita();
    }

    @Override
    public Armadura CreateProdructC() {
        return new MantoMagico();
    }

    @Override
    public Montura CreateProdructD() {
        return new NubeMagica();
    }

    @Override
    public AtaqueGeneral CreateProductE() { return new AtaqueHechicero("./img/Hechicero/animacionHechicero.gif");}
}
