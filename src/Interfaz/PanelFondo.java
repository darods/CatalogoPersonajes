/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author oscar
 */
public class PanelFondo extends Container{
    private ImageIcon icono;


    public PanelFondo(){
     
     icono = new ImageIcon("./img/fondoFinal.jpg");
     
  

    
    } 

    public void paint (Graphics g)
     {
       Rectangle r = g.getClipBounds();
       g.setColor(this.getBackground());
       g.fillRect (r.x, r.y, r.width, r.height);
       g.drawImage (icono.getImage(), 0, 0, this.getWidth(),
       this.getHeight(), this.getBackground(), this);
       super.paint(g);
      }
    
}
