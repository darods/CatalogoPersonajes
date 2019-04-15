package catalogopersonajes;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz extends JFrame{
	
	JLabel nombre ;
	
	public Interfaz(){
		
		
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setTitle("Catalogo De Personajes");
    	
    	
    	CatalogoPersonaje a = new CatalogoPersonaje(0);
    	nombre = new JLabel (a.personaje.getNombre());
    	
    	this.add(nombre);
    
    	
    	this.setVisible(true);
    	

	}

}
