package Juego_Ahorcado;

//Importamos librerias

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

///////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * @author Ivan 2126012-3743
 * @author Hanner 2122993-3743
 * @author Miguel 2125737-3743
 * @author Sergio 2127467-3743
 *////////////////////////////////////////////////////////////////////////////////////////////////////


public class GUIjuego extends JFrame{
    
    public ImageIcon imgs[];
    public static  JButton btns[];
    public String msj[];
    public int ran;
    public int err;
    public String res[];
    
    public JPanel p1,p2,p3,p4,p5,p6;
    public JButton c1,c2,c3,c4,c5,c6,c7,c8,c9;
    public JButton c10,c11,c12,c13,c14,c15,c16,c17,c18;
    public JButton c19,c20,c21,c22,c23,c24,c25,c26,btn1;
    public Image icon;
    public JLabel c27;

    //Inicializamos componentes de nuestra GUIJuego
    public void  inicomponetns(){

        p1 = new JPanel(new BorderLayout());
        p1.setBounds(0,0,900,700);
 
        p2 = new JPanel(new BorderLayout());
        p2.setBounds(0,381,100,30);
        p2.setOpaque(false);
        p2.setBorder(null);


        p3 = new JPanel(new BorderLayout());
        p3.setBounds(2,2,440,100);
        p3.setOpaque(false);
        p3.setBorder(null);
        

        //Contienen las letras del abecedario
        p4 = new JPanel(new GridLayout(3,9)); 
        p4.setBounds(10,280,460,180);
        p4.setOpaque(false);
        
        //Contiene las imagenes del ahorcado
        p5 = new JPanel(new BorderLayout());
        p5.setBounds(280,40,190,235);
        p5.setOpaque(true);
        p5.setBorder(null );

        //para colocar el texto en la GUIJuego 
        p6 = new JPanel(new BorderLayout());
        p6.setBounds(40,170,200,40);
        p6.setBackground(Color.white);
        p6.setOpaque(true);
        p6.setBorder(null );
  
        
        
        
        //le ponemos imagen los botnes para cada una de las letras del abecedario
        
        
        c1= new JButton(new ImageIcon("src/imagenes/LetraA.png"));
        c1.setOpaque(false);
        c1.setBorder(null);
        c1.setContentAreaFilled(false);
        c2= new JButton(new ImageIcon("src/imagenes/LetraB.png"));
        c2.setOpaque(false);
        c2.setBorder(null);
        c2.setContentAreaFilled(false);
        c3= new JButton(new ImageIcon("src/imagenes/LetraC.png"));
        c3.setOpaque(false);
        c3.setBorder(null);
        c3.setContentAreaFilled(false);
        c4= new JButton(new ImageIcon("src/imagenes/LetraD.png"));;
        c4.setOpaque(false);
        c4.setBorder(null);
        c4.setContentAreaFilled(false);
        c5= new JButton(new ImageIcon("src/imagenes/LetraE.png"));
        c5.setOpaque(false);
        c5.setBorder(null);
        c5.setContentAreaFilled(false);
        c6= new JButton(new ImageIcon("src/imagenes/LetraF.png"));
        c6.setOpaque(false);
        c6.setBorder(null);
        c6.setContentAreaFilled(false);
        c7= new JButton(new ImageIcon("src/imagenes/LetraG.png"));
        c7.setOpaque(false);
        c7.setBorder(null);
        c7.setContentAreaFilled(false);
        c8= new JButton(new ImageIcon("src/imagenes/LetraH.png"));
        c8.setOpaque(false);
        c8.setBorder(null);
        c8.setContentAreaFilled(false);
        c9= new JButton(new ImageIcon("src/imagenes/LetraI.png"));
        c9.setOpaque(false);
        c9.setBorder(null);
        c9.setContentAreaFilled(false);
        c10= new JButton(new ImageIcon("src/imagenes/LetraJ.png"));
        c10.setOpaque(false);
        c10.setBorder(null);
        c10.setContentAreaFilled(false);
        c11= new JButton(new ImageIcon("src/imagenes/LetraK.png"));
        c11.setOpaque(false);
        c11.setBorder(null);
        c11.setContentAreaFilled(false);
        c12= new JButton(new ImageIcon("src/imagenes/LetraL.png"));
        c12.setOpaque(false);
        c12.setBorder(null);
        c12.setContentAreaFilled(false);
        c13= new JButton(new ImageIcon("src/imagenes/LetraM.png"));
        c13.setOpaque(false);
        c13.setBorder(null);
        c13.setContentAreaFilled(false);
        c14= new JButton(new ImageIcon("src/imagenes/LetraN.png"));
        c14.setOpaque(false);
        c14.setBorder(null);
        c14.setContentAreaFilled(false);
        c15= new JButton(new ImageIcon("src/imagenes/LetraO.png"));
        c15.setOpaque(false);
        c15.setBorder(null);
        c15.setContentAreaFilled(false);
        c16= new JButton(new ImageIcon("src/imagenes/LetraP.png"));
        c16.setOpaque(false);
        c16.setBorder(null);
        c16.setContentAreaFilled(false);
        c17= new JButton(new ImageIcon("src/imagenes/LetraQ.png"));
        c17.setOpaque(false);
        c17.setBorder(null);
        c17.setContentAreaFilled(false);
        c18= new JButton(new ImageIcon("src/imagenes/LetraR.png"));
        c18.setOpaque(false);
        c18.setBorder(null);
        c18.setContentAreaFilled(false);
        c19=new JButton(new ImageIcon("src/imagenes/LetraS.png"));
        c19.setOpaque(false);
        c19.setBorder(null);
        c19.setContentAreaFilled(false);
        c20= new JButton(new ImageIcon("src/imagenes/LetraT.png"));
        c20.setOpaque(false);
        c20.setBorder(null);
        c20.setContentAreaFilled(false);
        c21= new JButton(new ImageIcon("src/imagenes/LetraU.png"));
        c21.setOpaque(false);
        c21.setBorder(null);
        c21.setContentAreaFilled(false);
        c22= new JButton(new ImageIcon("src/imagenes/LetraV.png"));
        c22.setOpaque(false);
        c22.setBorder(null);
        c22.setContentAreaFilled(false);
        c23= new JButton(new ImageIcon("src/imagenes/LetraW.png"));
        c23.setOpaque(false);
        c23.setBorder(null);
        c23.setContentAreaFilled(false);
        c24= new JButton(new ImageIcon("src/imagenes/LetraX.png"));
        c24.setOpaque(false);
        c24.setBorder(null);
        c24.setContentAreaFilled(false);
        c25= new JButton(new ImageIcon("src/imagenes/LetraY.png"));
        c25.setOpaque(false);
        c25.setBorder(null);
        c25.setContentAreaFilled(false);
        c26= new JButton(new ImageIcon("src/imagenes/LetraZ.png"));
        c26.setOpaque(false);
        c26.setBorder(null);
        c26.setContentAreaFilled(false);
        
        
        setIconImage(icon);
        imgs = new ImageIcon[11];
        btns = new JButton[27];
        msj = new String[3];
        
        
        
        imgs[0] = new ImageIcon(getClass().getResource("/imagenes/BotonJuego.png"));
        imgs[1] = new ImageIcon(getClass().getResource("/imagenes/paso1.png"));
        imgs[2] = new ImageIcon(getClass().getResource("/imagenes/paso2.png"));
        imgs[3] = new ImageIcon(getClass().getResource("/imagenes/paso3.png"));
        imgs[4] = new ImageIcon(getClass().getResource("/imagenes/paso4.png"));
        imgs[5] = new ImageIcon(getClass().getResource("/imagenes/paso5.png"));
        imgs[6] = new ImageIcon(getClass().getResource("/imagenes/paso6.png"));
        imgs[7] = new ImageIcon(getClass().getResource("/imagenes/paso7.png"));
        imgs[8] = new ImageIcon(getClass().getResource("/imagenes/paso8.png"));
        imgs[9] = new ImageIcon(getClass().getResource("/imagenes/paso9.png"));
        imgs[10] = new ImageIcon(getClass().getResource("/imagenes/paso10.png"));
        
        //Declaramos los botnes para cada una de las letras
        btns [1] = c1;
        btns [2] = c2;
        btns [3] = c3;
        btns [4] = c4;
        btns [5] = c5;
        btns [6] = c6;
        btns [7] = c7;
        btns [8] = c8;
        btns [9] = c9;
        btns [10] = c10;
        btns [11] = c11;
        btns [12] = c12;
        btns [13] = c13;
        btns [14] = c14;
        btns [15] = c15;
        btns [16] = c16;
        btns [17] = c17;
        btns [18] = c18;
        btns [19] = c19;
        btns [20] = c20;
        btns [21] = c21;
        btns [22] = c22;
        btns [23] = c23;
        btns [24] = c24;
        btns [25] = c25;
        btns [26] = c26;
        
        //Declaramos las palabras
        msj[0]="Perro".toUpperCase();
        msj[1]="Gato".toUpperCase();
        msj[2]="Animal".toUpperCase();
        
        Escucha escucha=new Escucha();
        
        for (int i =1; i < 27; i++){
            btns[i].addActionListener(escucha);
     
        } 
        
        
        
        //Creamos menu para volver a nuestra pagina principal, donde el jugaor ppodra elegir nuevatematica.
        
              JToolBar  metodo = new JToolBar();
              JPopupMenu opciones = new JPopupMenu();
            
             opciones.add(new JMenuItem(new AbstractAction("MENU INCIO ") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(p1, "NUEVA PARTIDA");
                    setVisible(false);
                    GUIMenu x= new GUIMenu ();
                 
                 }
             }));
              opciones.add(new JMenuItem(new AbstractAction("SALIR DE LA PARTIDA") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  JOptionPane.showMessageDialog(p1, "ESTAS SEGURO QUE QUIERES SALIR DE LA PARTIDA"
                          + "VUELVE CUANDO QUIERAS ");
                  setVisible(false);
                 }
             }));         
            opciones.add(new JMenuItem(new AbstractAction("SELECCIONA OTRA TEMATICA") {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  JOptionPane.showMessageDialog(p1, "SELECIONA OTRA TEMATICA");
                   setVisible(false);
                   GUICategoria c = new GUICategoria();
                  
                 }
             }));    

       //Creamos boton que conitnen los elementos creados anteriormente
       btn1 = new JButton (new ImageIcon("src/imagenes/BotonJuego.png"));
       btn1.setContentAreaFilled(false);
       btn1.setOpaque(false);
       btn1.setBorder(null);      
       btn1.addMouseListener(new MouseAdapter() {
               @Override
               public void mousePressed(MouseEvent e){
                   opciones.show(e.getComponent(),e.getX(),e.getY());
               }
       });
       
       iniciar();
       //Agregamos los objetos correspondientes a us paneles
       metodo.add(btn1); 
      
       p1.add(p3,BorderLayout.CENTER);
       p1.add(p4,BorderLayout.CENTER);
       p1.add(p5,BorderLayout.CENTER);
       p2.add(btn1,BorderLayout.CENTER);
       p3.add(p2,BorderLayout.WEST);
       p1.add(p6,BorderLayout.CENTER); 
       
       //Agregamos los botones que contienen las letras del abecedario sobre nuestro panel4 (p4)
       p4.add(c1);p4.add(c2);p4.add(c3);p4.add(c4);p4.add(c5);p4.add(c6);p4.add(c7);p4.add(c8);
       p4.add(c9);p4.add(c10);p4.add(c11);p4.add(c12);p4.add(c13);p4.add(c14);p4.add(c15);p4.add(c16);
       p4.add(c17);p4.add(c18);p4.add(c19);p4.add(c20);p4.add(c21);p4.add(c22);p4.add(c23);p4.add(c24);
       p4.add(c25);p4.add(c26);
       
       
     
    }
    
    public void iniciar(){

        //ERRORES EN 0
        err = 0;
        btn1.setIcon(imgs[0]);
        txtPalabra.setText("");

        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
    
            
        }

        //para generar una palabra aleatoriamente xD
        ran = (int) 0 + (int) (Math.random() * ((msj.length - 1) + 1));
        //SEPARA EL MENSAJE POR PALABRAS
        String pal[] = msj[ran].split(" ");
        res = new String[msj[ran].length() + 1];
        int j = 0;
        // seran los guiones que van debajo de las letras como una separacion_
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                txtPalabra.setText(txtPalabra.getText() + "_ ");
                res[j++] = "_";
            }
            txtPalabra.setText(txtPalabra.getText() + "\n");
            res[j++] = " ";
        }
    }
    
    public void revisarLetra(ActionEvent e, String[] msj){
        
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra despues de haber sido presionada
        for (int i = 1; i < 27; i++) {
            if (bt == btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la frase
                boolean esta = false;
                for (int j = 0; j < msj[ran].length(); j++) {
                    if (c[0] == msj[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    txtPalabra.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            txtPalabra.setText(txtPalabra.getText() + "\n");
                        } else {
                            txtPalabra.setText(txtPalabra.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador :D
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    
                    if (gano) { 
                        JOptionPane.showMessageDialog(this, "FELICITACIONES GANASTES!!", "Ahorcado",JOptionPane.INFORMATION_MESSAGE);
                        iniciar();
                        return;
                    }
                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    btn1.setIcon(imgs[++err]);
                  
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (err == 5) {
                        JOptionPane.showMessageDialog(this, "HAS PERDIDO\n Intenta con otra palabra la respuesta es: \n" + msj[ran], "Ahorcado",JOptionPane.INFORMATION_MESSAGE);
                        iniciar();
                        return;
                    }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
        }

    }
    @SuppressWarnings("unchecked")
    
    
    
       

    
    public GUIjuego(){
        inicomponetns();
        setTitle("JUEGO_DEL_AHORCADO");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        p1.add(new fondoGUIJuego());
        p3.add(new TituloGUIjuego());
        p5.add(new Ahorcado());
        this.getContentPane().add(p1);
        
       
        
    }

    private static class txtPalabra {

        private static void setText(String string) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static String getText() {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return null; 
        }

        public txtPalabra() {
        }
    }


    //Agregamos imagenes a nuestro fondo
        public class  fondoGUIJuego extends JPanel{
        @Override
        public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo3.png"));
       g.drawImage(imagen.getImage(),0,0, 900, getWidth(),this);
       setOpaque(false);
       super.paint(g);
        }
    }
       public class  TituloGUIjuego extends JPanel{
        @Override
        public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Titulo.png"));
       
       g.drawImage(imagen.getImage(),0,0, 400, 60,this);
       setOpaque(false);
       super.paint(g);
        }
    }
    public class  Ahorcado extends JPanel{
        @Override
        public void paint(Graphics g){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Ahorcado.png"));
       g.drawImage(imagen.getImage(),0,10, 200, 235,this);
       setOpaque(false);
       super.paint(g);
        }
        
    }
    
  class Escucha implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {     
            if((e.getSource() == btns[1]));    
            //System.out.println("Letra A");
         if((e.getSource()== btns[2]));  
        // System.out.println("Letra B");
         
        
                
                }

}
    
}

