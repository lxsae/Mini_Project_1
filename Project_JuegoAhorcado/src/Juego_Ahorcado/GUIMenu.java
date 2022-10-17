package Juego_Ahorcado;

// Importamos las librerias

import Juego_Ahorcado.GUIjuego;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JToolBar;

///////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * @author Ivan 2126012-3743
 * @author Hanner 2122993-3743
 * @author Miguel 2125737-3743
 * @author Sergio 2127467-3743
 *////////////////////////////////////////////////////////////////////////////////////////////////////


public class GUIMenu extends JFrame{
    
public JPanel panelP,panelS,panelI;
private JLabel  titulo_juego;
public JButton PlayNow,Opcionesx;
private JMenu menu;
private JMenuItem menuX,menuY,menuZ;



/**
 * Inicilizamos todos nuestros elementos que se encuentran en nuestra interface GUIMenu
 */
    
    public void elementos(){
        
      //Panel Princicipal sobre el JFrame
       
        panelP = new JPanel(new BorderLayout());
        panelP.setBounds(0,0,550,538);
        
      //Panel2 contiene titulo 
        panelS = new JPanel(new BorderLayout());
        panelS.setBounds(150,100,260,220);
        panelS.setOpaque(false);
        
      //Panel3 COntenedor de bontones e informacion del juego
        panelI = new JPanel(new GridLayout(2,1));
        panelI.setBounds(150,260,260,160);
        panelI.setOpaque(false);
       
      
      //Inicializamos todos los componentes que tendra nuestro PanelP (Panel Principal)
        titulo_juego = new JLabel();
        titulo_juego.setText("<html> ............ <p> JUEGO-------<p>AHORCADO<html>");
        titulo_juego.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
        titulo_juego.setForeground(Color.BLACK.darker());
        


      /**
       * Instamciamos evento para el bototn Palynow, el cual abrira la interface de categoria donde
       * el jugador podra elegir la tematica del juego.
       */
       manejoEventos x = new manejoEventos();

       PlayNow = new JButton (new ImageIcon("src/imagenes/Boton.png"));
       PlayNow.setContentAreaFilled(false);
       PlayNow.setOpaque(false);
       PlayNow.setBorder(null);
       PlayNow.setBounds(0,0,50,60);
       PlayNow.addActionListener(x);
     
    /**
     * Implementamos un meno el cual brinadara informacion sobre el juego 
     * a nuestro usuario(Jugador); informacion como:
     * Jugar
     * Como Jugar
     * Para que Sirve
     * Colaboradores
     */
             final  JToolBar  metodo = new JToolBar();
              JPopupMenu opciones = new JPopupMenu();
            
             opciones.add(new JMenuItem(new AbstractAction("COMO JUGAR ") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  JOptionPane.showMessageDialog(panelI, "Para jugar debes acertar la palabra segun la categoria seleccionada\n (Recuerda solo tienes 10 intentos");
                 }
             }));
              opciones.add(new JMenuItem(new AbstractAction("PARA QUE SIRVE ") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  JOptionPane.showMessageDialog(panelI, "Sirve para ejecitar nuestra mente y\n llevar un buen auto control");
                 }
             }));         
            opciones.add(new JMenuItem(new AbstractAction("Colaboradores") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  JOptionPane.showMessageDialog(panelI, "Ivan-Hanner-Miguel-Sergio");
                 }
             }));         
                     
       //Creamos boton instrucciones
       Opcionesx = new JButton(new ImageIcon("src/imagenes/BOTON2_.png"));
       Opcionesx.setOpaque(false);
       Opcionesx.setBorder(null);
       Opcionesx.setContentAreaFilled(false);   
       Opcionesx.addMouseListener(new MouseAdapter() {
       
       @Override
       public void mousePressed(MouseEvent e){
             opciones.show(e.getComponent(),e.getX(),e.getY());
               }
       });
       
        //Agregamos los paneles al panel principal de nuestra GUIMenu
         metodo.add(Opcionesx); 
         panelP.add(panelS,BorderLayout.CENTER);
         panelP.add(panelI,BorderLayout.CENTER);
         panelS.add(titulo_juego,BorderLayout.NORTH);
         panelI.add(PlayNow,BorderLayout.CENTER);
         panelI.add(Opcionesx,BorderLayout.CENTER);
                     
    }  
   

    
    public GUIMenu(){    
        elementos();
        setTitle("JUEGO_AHORCADO");
        setSize(553,576);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        panelP.add(new fondoGUI());
        this.getContentPane().add(panelP);
    }
    

    
    public class  fondoGUI extends JPanel{
        @Override
        public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo.png"));
       g.drawImage(imagen.getImage(),0,0, getHeight(), getWidth(),this);
       setOpaque(false);
       super.paint(g);
        }
    }
    class  manejoEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
              setVisible(false);
               GUICategoria c = new GUICategoria();
        
        }
     
     
 } 

    
}
