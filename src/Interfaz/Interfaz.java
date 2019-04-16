package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import catalogopersonajes.CatalogoPersonaje;
import javafx.scene.text.Font;



public class Interfaz extends JFrame implements ActionListener{
	

	private PanelFondo Fondo;
	private JButton btn_guerrero;
	private JButton btn_hechicero;
	private JButton btn_elfo;
	private ImageIcon img_titulo;
	private JLabel lbl_titulo;
	private PanelGuerrero panelGuerrero;
	private PanelElfo panelElfo;
	private PanelHechicero panelHechicero;
	


	private int opcion=0;
	
	private CatalogoPersonaje user;
	
	

	
	
	public Interfaz(){
		
		Fondo=new PanelFondo();
		
		
		
	        
 //COMPONENTES --------------------------------------

   		
		img_titulo = new ImageIcon("./img/titulo.png");
   		lbl_titulo= new JLabel(img_titulo);
   		lbl_titulo.setSize(900,200);
   		lbl_titulo.setLocation(1, 1);
   		
   		
    	btn_guerrero = new JButton();
    	btn_guerrero.setLocation(10, 200);
    	btn_guerrero.setSize(265, 75);
    	btn_guerrero.setBackground(new Color (100,2,4));
    	btn_guerrero.setIcon(new ImageIcon("./img/Guerrero.png"));
   		btn_guerrero.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
  		btn_guerrero.setContentAreaFilled(true);
   		btn_guerrero.setPreferredSize(new Dimension(0,58));
    	btn_guerrero.setHorizontalAlignment(SwingConstants.CENTER);
     
   		
    	btn_hechicero = new JButton();
    	btn_hechicero.setLocation(600, 200);
    	btn_hechicero.setSize(280, 75);
    	btn_hechicero.setBackground(new Color (100,2,4));
    	btn_hechicero.setIcon(new ImageIcon("./img/hechicero.png"));
    	btn_hechicero.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
    	btn_hechicero.setContentAreaFilled(true);
    	btn_hechicero.setPreferredSize(new Dimension(0,58));
    	btn_hechicero.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	btn_elfo = new JButton();
    	btn_elfo.setLocation(318,175);
    	btn_elfo.setSize(228, 130);
    	btn_elfo.setBackground(new Color (100,2,4));
    	btn_elfo.setIcon(new ImageIcon("./img/elfo.png"));
    	btn_elfo.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
    	btn_elfo.setContentAreaFilled(true);
    	btn_elfo.setPreferredSize(new Dimension(0,58));
    	btn_elfo.setHorizontalAlignment(SwingConstants.CENTER);
    	btn_elfo.addActionListener(this);
    	
    	
    	
    	
   		
   		
   		//---------------------------------------------------
   		
    	//VENTANA PRINCIPAL-----------------------------------

		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setTitle("Catalogo De Personajes");
    	this.setResizable(false);
    	this.setContentPane(Fondo);
    	this.setVisible(true);
    	
    	//----------------------------------------------------
		
    	

		//DISTRIBUCION -------------------------------
    	
//    	this.getContentPane().setLayout(new BorderLayout());
    	this.getContentPane().add(btn_guerrero);
    	this.getContentPane().add(btn_hechicero);
    	this.getContentPane().add(btn_elfo);
    	this.getContentPane().add(lbl_titulo);
    	//this.getContentPane().add(navegacion);
    	
 		
    	//--------------------------------------------------
    	
    
    

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_elfo) {
			

			
		}		
	}
	
	

	
  

}
