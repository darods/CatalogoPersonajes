/*
< * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogopersonajes;

import Factorias.AbstractFactory;
import Factorias.Client;
import Factorias.FactoriaCaballero;
import Interfaz.Interfaz;

/**
 *
 * @author estudiantes
 */
public class Controlador {

	
    public static void main(String[] args) {
    	
    	Interfaz ventana = new Interfaz();
        AbstractFactory factory1 = new FactoriaCaballero();
        Client c1 = new Client(factory1);

        c1.run();


    }
    
   
    
    
    
   
    
}
