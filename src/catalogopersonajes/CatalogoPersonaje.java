package catalogopersonajes;

import Equipamento.Arma;
import Equipamento.Armadura;
import Personajes.Guerrero;
import Personajes.Personaje;

public class CatalogoPersonaje {
	
	Personaje personaje;
	Arma arma;
	Armadura armadura;
	int opcion;
	
	
	
	public CatalogoPersonaje(int opcion){
		this.opcion=opcion;
		
		switch (opcion) {
			case 0 :
				
				personaje = new Guerrero("SCAR DOMADOR DE DRAGONES","1.90");
				arma= personaje.crearArma();
				armadura= personaje.crearArmadura();
				break;
				
			case 1 :
				
				break;
				
				
					
					
				
		}
			
		

	}
	
	

}
