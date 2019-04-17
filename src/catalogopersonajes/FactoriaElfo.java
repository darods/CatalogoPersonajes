package catalogopersonajes;

import Personajes.ElfoOscuro;
import Personajes.Personaje;
import Equipamento.Arco;
import Equipamento.Arma;

public class FactoriaElfo extends AbstractFactory{

    @Override
    public Personaje CreateProdructA() {
        return new ElfoOscuro("Marduk bailarin de la oscuridad","2.10");
    }

    @Override
    public Arma CreateProdructB() {
        return new Arco();
    }
}
