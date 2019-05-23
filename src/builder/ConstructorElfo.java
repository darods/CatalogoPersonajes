package builder;

import Factorias.AbstractFactory;
import Factorias.FactoriaDistancia;
import Factorias.FactoriaMagica;
import Factorias.FactoriaMelee;

public class ConstructorElfo extends ConstructorPersonaje {
	
	public ConstructorElfo() {
		a = new FactoriaDistancia();

	}

	@Override
	public void construirArma() {
		personaje.SetArma(a.CreateProdructB());
		
		
	}

	@Override
	public void construirArmadura() {
		personaje.SetArmadura(a.CreateProdructC());

	}

	@Override
	public void construirMontura() {
		personaje.SetMontura(a.CreateProdructD());

	}

	@Override
	public void construirAtaque() {
		personaje.SetAtaque(a.CreateProductE());

	}
	
	@Override
	public void construirDatos() {
		personaje.setDatos(a.CreateProdructA());
		
	}

}
