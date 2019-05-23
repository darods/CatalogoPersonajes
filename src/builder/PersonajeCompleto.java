package builder;

import Animaciones.Ataque.AtaqueGeneral;
import Equipamento.Arma.Arma;
import Equipamento.Armadura.Armadura;
import Equipamento.Montura.Montura;
import Personajes.Personaje;

public class PersonajeCompleto {
	
	private Arma arma;
	private Montura montura;
	private Armadura armadura;
	private AtaqueGeneral ataque;
	private Personaje datos;
	 	
	public void SetArma(Arma arma) {
		this.arma=arma;
		
		
	}
	
	public void setDatos(Personaje datos) {
		this.datos=datos;
	}
	
	public void SetArmadura(Armadura armadura) {
		this.armadura=armadura;
	}
	
	public void SetMontura(Montura montura) {
		this.montura=montura;
	}
	
	public void SetAtaque(AtaqueGeneral ataque) {
		this.ataque=ataque;
	}
	
	public String  getArma() {
		return arma.generarArma();
		
	}
	public String getArmadura() {
		return armadura.generarArmadura();

	}
	public String getMontura() {
		return montura.generarMontura();
		
	}
	public String getAtaque() {
		return ataque.getAnimacionAtaque();
		
	}
	
	public String getNombre() {
		return datos.getNombre();
		
	}
	public String getEstatura() {
		return datos.getEstatura();
		
	}
	
	
}
