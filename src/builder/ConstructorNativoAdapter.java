package builder;

import java.lang.reflect.Constructor;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Factorias.FactoriaMagica;
import Logica.ConstructorElfos;
import Presentacion.*;

public class ConstructorNativoAdapter extends ConstructorPersonaje{
	Presentacion.Constructor e = new Presentacion.ConstructorElfos();
    Presentacion.Director dir = new Director(e);
    Presentacion.Personaje perso = dir.obtenerPersonaje();
	
	
	public ConstructorNativoAdapter() throws UnsupportedAudioFileException, LineUnavailableException {
		
	};

	@Override
	public void construirArma() {
		perso.getMiArmaDesc();
		
	}

	@Override
	public void construirArmadura() {
		perso.getmiArmadura();
	}

	@Override
	public void construirMontura() {
		perso.getmiMonturaImg();
	}

	@Override
	public void construirAtaque() {
		perso.Atacar();
	}

	@Override
	public void construirDatos() {
		perso.getmiVida();
	}
}
