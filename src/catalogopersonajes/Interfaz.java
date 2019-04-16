package catalogopersonajes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interfaz extends JFrame{
	
	private JPanel panel_cabezote;
	private JPanel panel_botones;
	private JButton btn_guerrero;
	private JButton btn_hechicero;
	private JButton btn_elfo;

	private ImageIcon img_titulo;
	private JLabel lbl_titulo;
	public Interfaz(){
		
		//COMPONENTES --------------------------------------
		
		img_titulo = new ImageIcon("./img/titulo.png");
		lbl_titulo= new JLabel(img_titulo);
		
		btn_guerrero = new JButton("GUERRERO");
		btn_guerrero.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btn_guerrero.setOpaque(false);
		btn_guerrero.setContentAreaFilled(false);
		btn_guerrero.setPreferredSize(new Dimension(0,58));
		
		btn_hechicero = new JButton("HECHICERO");
		btn_hechicero.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btn_hechicero.setOpaque(true);
		btn_hechicero.setPreferredSize(new Dimension(0,58));
		
		btn_elfo = new JButton("ELFO");
		btn_elfo.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btn_elfo.setOpaque(true);
		btn_hechicero.setPreferredSize(new Dimension(0,58));
		
		
		//---------------------------------------------------
		
		//PANEL BOTONES -------------------------------------
		panel_botones= new JPanel();
		panel_botones.setLayout(new GridLayout(1,3));
		panel_botones.add(btn_guerrero);
		panel_botones.add(btn_hechicero);
		panel_botones.add(btn_elfo);
		
		
		
		//---------------------------------------------------
		
		
		//PANEL CABEZOTE--------------------------------
		
		panel_cabezote = new JPanel();
		panel_cabezote.setLayout(new BorderLayout());
		panel_cabezote.setPreferredSize(new Dimension(0,250));
		panel_cabezote.add(lbl_titulo, BorderLayout.CENTER);
		panel_cabezote.add(panel_botones,BorderLayout.SOUTH);
		
		//----------------------------------------------
		
		
		
		//VENTANA PRINCIPAL -------------------------------
		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setTitle("Catalogo De Personajes");
    	this.setResizable(false);
    	this.setLayout(new BorderLayout());
    	
    	
    	this.add(panel_cabezote,BorderLayout.NORTH);
    	//--------------------------------------------------
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
    	this.setVisible(true);
    	

	}

}
