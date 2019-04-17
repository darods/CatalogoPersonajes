package Factorias;

import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Montura;


public abstract class AbstractFactory {
    public abstract Personajes.Personaje CreateProdructA();
    public abstract Arma CreateProdructB();
    public abstract Armadura CreateProdructC();
    public abstract Montura CreateProdructD();
}
