package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Factorias.*;



public class Interfaz extends JFrame implements ActionListener{


	private PanelFondo Fondo;
	private JButton btn_guerrero;
	private JButton btn_hechicero;
	private JButton btn_elfo;
	private ImageIcon img_titulo = new ImageIcon("./img/titulo.png");
	private JLabel lbl_titulo;
	private JLabel lbl_nombre;
	private JLabel lbl_estatura;
	private JLabel lbl_armadura;
	private JLabel lbl_arma;
	private JLabel lbl_montura;
	private JPanel panelPersonajeH;
	private JPanel panelPersonajeG;
	private JPanel panelPersonajeE;

	private JPanel panelDatos;

	private JLabel personaje;
	private ImageIcon img_hechicero = new ImageIcon("./img/PerHechicero.png");
	private ImageIcon img_guerrero = new ImageIcon("./img/PerGuerrero.png");
	private ImageIcon img_elfo = new ImageIcon("./img/PerElfo.png");

	private String[] datos;





	public Interfaz(){

		Fondo=new PanelFondo();




 //COMPONENTES --------------------------------------
		lbl_nombre= new JLabel();
		lbl_estatura= new JLabel();
		lbl_armadura = new JLabel();
		lbl_arma = new JLabel();
		lbl_montura = new JLabel();

		lbl_nombre.setForeground(Color.WHITE);
		lbl_nombre.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lbl_estatura.setForeground(Color.WHITE);
		lbl_estatura.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lbl_armadura.setForeground(Color.WHITE);
		lbl_armadura.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lbl_arma.setForeground(Color.WHITE);
		lbl_arma.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lbl_montura.setForeground(Color.WHITE);
		lbl_montura.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));


		panelPersonajeH=new JPanel();
		panelPersonajeH.setSize(800,345);
		panelPersonajeH.setLocation(50,310);
		panelPersonajeH.setOpaque(false);
		panelPersonajeH.setLayout(new BorderLayout());

		panelPersonajeG=new JPanel();
		panelPersonajeG.setSize(800,345);
		panelPersonajeG.setLocation(50,310);
		panelPersonajeG.setOpaque(false);
		panelPersonajeG.setLayout(new BorderLayout());


		panelPersonajeE=new JPanel();
		panelPersonajeE.setSize(800,345);
		panelPersonajeE.setLocation(50,310);
		panelPersonajeE.setOpaque(false);
		panelPersonajeE.setLayout(new BorderLayout());


		panelDatos = new JPanel();
		panelDatos.setLayout(new BoxLayout(panelDatos,BoxLayout.Y_AXIS));
		panelDatos.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		panelDatos.setOpaque(false);
		panelDatos.add(lbl_nombre);
		panelDatos.add(lbl_estatura);
		panelDatos.add(lbl_armadura);
		panelDatos.add(lbl_arma);
		panelDatos.add(lbl_montura);


   		lbl_titulo= new JLabel(img_titulo);
   		lbl_titulo.setSize(900,200);
   		lbl_titulo.setLocation(1, 1);


    	btn_guerrero = new JButton();
    	btn_guerrero.setLocation(10, 200);
    	btn_guerrero.setSize(265, 75);
    	btn_guerrero.setBackground(new Color (100,2,4));
    	btn_guerrero.setIcon(new ImageIcon("./img/guerrero.png"));
   		btn_guerrero.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
  		btn_guerrero.setContentAreaFilled(true);
   		btn_guerrero.setPreferredSize(new Dimension(0,58));
    	btn_guerrero.setHorizontalAlignment(SwingConstants.CENTER);
    	btn_guerrero.addActionListener(this);




    	btn_hechicero = new JButton();
    	btn_hechicero.setLocation(600, 200);
    	btn_hechicero.setSize(280, 75);
    	btn_hechicero.setBackground(new Color (100,2,4));
    	btn_hechicero.setIcon(new ImageIcon("./img/hechicero.png"));
    	btn_hechicero.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
    	btn_hechicero.setContentAreaFilled(true);
    	btn_hechicero.setPreferredSize(new Dimension(0,58));
    	btn_hechicero.setHorizontalAlignment(SwingConstants.CENTER);
    	btn_hechicero.addActionListener(this);



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

    	personaje= new JLabel();




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

    	this.getContentPane().add(btn_guerrero);
    	this.getContentPane().add(btn_hechicero);
    	this.getContentPane().add(btn_elfo);
    	this.getContentPane().add(lbl_titulo);
    	this.getContentPane().add(panelPersonajeH);
    	this.getContentPane().add(panelPersonajeG);
    	this.getContentPane().add(panelPersonajeE);


    	//--------------------------------------------------




	}

	private void apagar () {
		panelPersonajeE.setVisible(false);
		panelPersonajeG.setVisible(false);
		panelPersonajeH.setVisible(false);
	}


	private void generarVistaPersonaje(AbstractFactory factory, ImageIcon Icono, JPanel panel){
		apagar();
		Client cliente = new Client(factory);
		datos = cliente.run();

		lbl_nombre.setText(datos[0]);
		lbl_estatura.setText("Estatura : "+ datos[1] + " metros");
		lbl_armadura.setText("Armadura : "+ datos[2]);
		lbl_arma.setText("Arma : " + datos[3]);
		lbl_montura.setText("Montura : " + datos[4]);

		personaje.setIcon(Icono);

		panel.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		panel.add(personaje,BorderLayout.CENTER);
		panel.add(panelDatos,BorderLayout.EAST);


		panel.setVisible(true);

		this.getContentPane().add(panel);


	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn_hechicero) {
			AbstractFactory factory = new FactoriaMagica();
			generarVistaPersonaje(factory,img_hechicero,panelPersonajeH);

		}


		if (e.getSource() == btn_guerrero) {
			AbstractFactory factory = new FactoriaMelee();
			generarVistaPersonaje(factory, img_guerrero, panelPersonajeG);

		}

		if (e.getSource() == btn_elfo){

			AbstractFactory factory = new FactoriaDistancia();
			generarVistaPersonaje(factory, img_elfo, panelPersonajeE);

		}
	}






}
