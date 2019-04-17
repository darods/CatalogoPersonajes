package Factorias;

import Equipamento.Arma.Arma;


public abstract class AbstractFactory {
    public abstract Personajes.Personaje CreateProdructA();
    public abstract Arma CreateProdructB();
}
