package catalogopersonajes;

import Equipamento.Arma;
import Equipamento.Armadura;
import Equipamento.Montura;
import Personajes.ElfoOscuro;
import Personajes.Guerrero;
import Personajes.Hechicero;
import Personajes.Personaje;

public class CatalogoPersonaje {
	
	public Personaje personaje;
	public Arma arma;
	public Armadura armadura;
	public Montura montura;
	public int opcion;
	
	public CatalogoPersonaje() {

		this.opcion=0;
	}
	
	public CatalogoPersonaje(int opcion){
		this.opcion=opcion;
		
		
		switch (opcion) {
			case 0 :
				
				personaje = new Guerrero("Scar domador de dragones","1.95");
				arma= personaje.crearArma();
				armadura= personaje.crearArmadura();
				montura = personaje.crearMontura();
				break;
				
			case 1 :
				personaje = new ElfoOscuro("Marduk bailarin de la oscuridad","2.10");
				arma= personaje.crearArma();
				armadura= personaje.crearArmadura();
				montura = personaje.crearMontura();
				
				break;
			case 2 : 
				personaje = new Hechicero("Merlin","1.50");
				arma= personaje.crearArma();
				armadura= personaje.crearArmadura();
				montura = personaje.crearMontura();
				break;
					
					
				
		}
			
		

	}
	
	

}
