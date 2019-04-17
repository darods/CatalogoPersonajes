package catalogopersonajes;

import Equipamento.Arma;
import Equipamento.Espada;
import Personajes.Guerrero;
import Personajes.Personaje;

public class FactoriaCaballero extends AbstractFactory{
    @Override
    public Personaje CreateProdructA() {
        return new Guerrero("Scar domador de dragones","1.95");
    }

    @Override
    public Arma CreateProdructB() {
        return new Espada();
    }
}
