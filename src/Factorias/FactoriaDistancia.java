package Factorias;

import Animaciones.Ataque.AtaqueElfo;
import Animaciones.Ataque.AtaqueGeneral;
import Equipamento.Armadura.Armadura;
import Equipamento.Armadura.EscamasDragon;
import Equipamento.Montura.LoboInfernal;
import Equipamento.Montura.Montura;
import Personajes.ElfoOscuro;
import Personajes.Personaje;
import Equipamento.Arma.Arco;
import Equipamento.Arma.Arma;

public class FactoriaDistancia extends AbstractFactory{

    @Override
    public Personaje CreateProdructA() {
        return new ElfoOscuro("Marduk bailarin de la oscuridad","2.10");
    }

    @Override
    public Arma CreateProdructB() {
        return new Arco();
    }

    @Override
    public Armadura CreateProdructC() {
        return new EscamasDragon();
    }

    @Override
    public Montura CreateProdructD() {
        return new LoboInfernal();
    }

    @Override
    public AtaqueGeneral CreateProductE() { return new AtaqueElfo("./img/Elfo/animacionElfo.gif"); }
}
