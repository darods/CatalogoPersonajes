package Factorias;

import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Montura;
import Personajes.Personaje;


public class Client {
    private Personaje personajeFabrica;
    private Arma armaFabrica;
    private Armadura armaduraFabrica;
    private Montura monturaFabrica;

    public Client(AbstractFactory factory){
        personajeFabrica = factory.CreateProdructA();
        armaFabrica = factory.CreateProdructB();
        armaduraFabrica = factory.CreateProdructC();
        monturaFabrica = factory.CreateProdructD();
    }

    public String[] run(){

        return new String[]{personajeFabrica.getNombre(),
                personajeFabrica.getEstatura(),
                armaduraFabrica.generarArmadura(),
                armaFabrica.generarArma(),
                monturaFabrica.generarMontura()
        };
    }
}
