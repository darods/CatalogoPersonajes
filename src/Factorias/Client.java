package Factorias;

import Animaciones.Ataque.AtaqueGeneral;
import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Montura;
import Personajes.Personaje;
import builder.ConstructorPersonaje;
import builder.PersonajeCompleto;


public class Client {
    private ConstructorPersonaje constructorPersonaje;
   
    public void setConstructorPersonaje(ConstructorPersonaje cp){
    	this.constructorPersonaje = cp;
    }
    
    public PersonajeCompleto getPersonaje () {
    	return constructorPersonaje.getPerosnaje();
    }

    public void construirPersonaje(){
    	constructorPersonaje.crearPersonaje();
    	constructorPersonaje.construirArma();
    	constructorPersonaje.construirArmadura();
    	constructorPersonaje.construirAtaque();
    	constructorPersonaje.construirMontura();
    	constructorPersonaje.construirDatos();

       
    }
}
