package catalogopersonajes;

import Equipamento.Arma;
import Personajes.Personaje;

public class Client {
    private Personaje personajeFabrica;
    private Arma armaFabrica;

    public Client(AbstractFactory factory){
        personajeFabrica = factory.CreateProdructA();
        armaFabrica = factory.CreateProdructB();
    }

    public void run(){
        System.out.printf(personajeFabrica.getEstatura());
    }
}
