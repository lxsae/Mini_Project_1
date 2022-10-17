
package Juego_Ahorcado;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

///////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * @author Ivan 2126012-3743
 * @author Hanner 2122993-3743
 * @author Miguel 2125737-3743
 * @author Sergio 2127467-3743
 *////////////////////////////////////////////////////////////////////////////////////////////////////

public class GUICategoria extends JFrame {
    
    /**
     * Los temas son:
     * (animales,frutas,paises,figuras) 
     */
    private JButton tema1,tema2,tema3,tema4,botonMenu,botonPlay;
    private JPanel principal,segundario,terciario,parabtn,etiqueta; 
    private JLabel etiquetax;
    
    public void intiComponentesC(){
        
        //inicializamos y declaramos nuestro panel principal interfaz de GUICategoria
        
        principal = new JPanel(new BorderLayout());
        principal.setBounds(0,0,900,700);
        

        //Añadimos los paneles restantes

        segundario = new JPanel ();
        segundario.setBounds(0,0,80,80);
        segundario.setOpaque(false);
        segundario.setBorder(null );
        
        

        //Contiene los botones para que el jugador pueda escoger la tematica

        terciario = new JPanel (new GridLayout(2,2));
        terciario.setBounds(130,150,250,150);
        terciario.setOpaque(false);
        terciario.setBorder(null );
        
        
        // Iniciamos el Juego con la tematica seleccionada por el usuario)

        parabtn = new JPanel();
        parabtn.setBounds(200,300,100,80);
        parabtn.setOpaque(false);
        parabtn.setBorder(null );
        
        // ahora debemos de colocar nuestro panel para nuestro titulo que guiara al usuario en las interfaces

        
        etiqueta= new JPanel ();
        etiqueta.setBounds(130, 100,250,50);
        etiqueta.setOpaque(false);
        etiqueta.setBorder(null);
        
        etiquetax = new JLabel();
        etiquetax.setText("<html>ESCOGA LA TEMATICA<p>-----------------------------<p><html>");
        etiquetax.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
        
       
        // Inicializamosdebemos de inicializar nuestros botones 
         
        tema1= new JButton (new ImageIcon("src/imagenes/IconoF.png"));
        tema1.setBorder(null);
        tema1.setContentAreaFilled(false);
        tema2= new JButton (new ImageIcon("src/imagenes/IconoP.png"));
        tema2.setBorder(null);
        tema2.setContentAreaFilled(false);
        tema3= new JButton (new ImageIcon("src/imagenes/IconoA.png"));
        tema3.setBorder(null);
        tema3.setContentAreaFilled(false);
        tema4= new JButton (new ImageIcon("src/imagenes/IconoFR.png"));
        tema4.setBorder(null);
        tema4.setContentAreaFilled(false);
        botonPlay= new JButton (new ImageIcon("src/imagenes/BotonEmpezar.png"));
        botonPlay.setBorder(null);
        botonPlay.setContentAreaFilled(false);
        

        
        final  JToolBar  metodo = new JToolBar();
        JPopupMenu opciones = new JPopupMenu();
            
       opciones.add(new JMenuItem(new AbstractAction("INICIO ") {
       @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(principal, "esta seguro que quieres volver al inicio??");
                setVisible(false);
                GUIMenu x= new GUIMenu ();
                 }
             }));
        opciones.add(new JMenuItem(new AbstractAction("PARA QUE SIRVE ") {
        @Override
           public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(principal, " ");
                 }
             }));         
        opciones.add(new JMenuItem(new AbstractAction("COLABORADORES ") {
        @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(principal, " ");
                 }
             }));     
            


        //Creamos un boton para que el jugador pueda interactuar con el resto de interfaces

        
        botonMenu= new JButton (new ImageIcon("src/imagenes/BotonJuego.png"));
        botonMenu.setBorder(null);
        botonMenu.setContentAreaFilled(false);       
        botonMenu.addMouseListener(new MouseAdapter() {
        
        public void mousePressed(MouseEvent e){
            opciones.show(e.getComponent(),e.getX(),e.getY());
               }
       });
        botonPlay.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e){
            JOptionPane.showMessageDialog(principal, "A JUGAR ");
            setVisible(false);
            GUIjuego x = new GUIjuego();
               }
       });
        
                

        //Agregamos un titulo
 

        terciario.add(tema1);
        terciario.add(tema2);
        terciario.add(tema3);
        terciario.add(tema4);
        

        //Agregamos los botones y los paneles al contenedor principal 
  
        segundario.add(botonMenu);
        parabtn.add(botonPlay);
        etiqueta.add(etiquetax,BorderLayout.NORTH);
        principal.add(etiqueta,BorderLayout.CENTER);
        principal.add(segundario,BorderLayout.CENTER);
        principal.add(terciario,BorderLayout.CENTER);
        principal.add(parabtn,BorderLayout.CENTER);
        
        
    }
    
    
    public GUICategoria(){
        intiComponentesC();
        setTitle("JUEGO_DEL_AHORCADO");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        principal.add(new fondoGUICategoria());
        this.getContentPane().add(principal);
        
    }
    
    public class  fondoGUICategoria extends JPanel{
        @Override
        public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo.png"));
       g.drawImage(imagen.getImage(),0,0, 500, 465,this);
       setOpaque(false);
       super.paint(g);
        }
    }
    

}
