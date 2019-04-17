package Factorias;

import Equipamento.Arma.Arma;
import Equipamento.Arma.Barita;
import Personajes.Hechicero;
import Personajes.Personaje;

public class FactoriaHechicero extends AbstractFactory{

    @Override
    public Personaje CreateProdructA() {
        return new Hechicero("Merlin principe de las tinieblas","1.50");
    }

    @Override
    public Arma CreateProdructB() {
        return new Barita();
    }
}
