package builder;

import Factorias.AbstractFactory;

public abstract class ConstructorPersonaje {
	
	protected PersonajeCompleto personaje;
	protected AbstractFactory a;
	
	public void crearPersonaje () {
		personaje = new PersonajeCompleto();
	}
	public PersonajeCompleto getPerosnaje() {
		return personaje;
	}
	
	public abstract void construirArma();
	public abstract void construirArmadura();
	public abstract void construirMontura();
	public abstract void construirAtaque();
	public abstract void construirDatos();


	

}
