package catalogopersonajes;

import Equipamento.Arma;
import Equipamento.Armadura;
import Equipamento.Montura;
import Personajes.Guerrero;
import Personajes.Personaje;

public class CatalogoPersonaje {
	
	Personaje personaje;
	Arma arma;
	Armadura armadura;
	Montura montura;
	int opcion;
	
	
	
	public CatalogoPersonaje(int opcion){
		this.opcion=opcion;
		
		switch (opcion) {
			case 0 :
				
				personaje = new Guerrero("SCAR DOMADOR DE DRAGONES","1.95");
				arma= personaje.crearArma();
				armadura= personaje.crearArmadura();
				montura = personaje.crearMontura();
				break;
				
			case 1 :
				
				break;
				
				
					
					
				
		}
			
		

	}
	
	

}
