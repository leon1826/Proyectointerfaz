  
package main.Client.Login_Usuario;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author Santiago Sanchez Alvarez
 */

public class LoginTemplate extends JFrame{// se hereda del JFrame para que tenga capacidades graficas
    
    private LoginComponent LoginComponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjgraficos;
    private JPanel pInicio;
    private JLabel lSesion,lNotienecuenta,lcreeuna;
    private JTextField tcorreo,tcontraseña;
    private JPasswordField tcontrasena;
    private JButton bSiguiente, bSalir;
    
    ///Objetos decoradores
    private Cursor cTexto;
    private Border bordercorreo;
    private Font fontfuente,fontVista;
    private ImageIcon iSalir,iDim;
    
    
            
    public LoginTemplate(LoginComponent LoginComponent){//constructor 
        
        
        sRecursos = RecursosService.getService();
        sObjgraficos = ObjGraficosService.getService();
        
        this.LoginComponent = LoginComponent;
        this.crearObjetosdecoradores();
        this.crearJPanels();
        this.crearJLabel();
        this.crearJFieldtext();
        this.crearJpassword();
        this.crearJButton();
        this.Ventana();
        
       
    }
    public void crearObjetosdecoradores(){
        
        cTexto = new Cursor(Cursor.TEXT_CURSOR);
        fontfuente = new Font("Segoe UI",Font.PLAIN,25);
        bordercorreo = BorderFactory.createMatteBorder(0, 0,
                2,0, Color.BLACK);
        iSalir = new ImageIcon("Recursos/IMG/Salir.png");
        
    }
    
    public void crearJPanels(){
        
        ///panel central
        pInicio = sObjgraficos.construirJPanel((1000-400)/2,(500-400)/2,
                400, 400, Color.WHITE);
                this.add(pInicio);
    }
    ///(String texto,int X,int Y,
            //int Ancho,int Largo,Font fonds,Color colorfuente,cCursor)
    public void crearJLabel (){
        lSesion = sObjgraficos.contruirJLabels("Iniciar sesión",
                30,60,200,50,fontfuente,Color.BLACK,cTexto,null);
        pInicio.add(lSesion);
        
        lNotienecuenta = sObjgraficos.contruirJLabels("¿No tiene una cuenta?",
                30,230,130,30,null, Color.BLACK, cTexto,null);
        pInicio.add(lNotienecuenta);
        
        lcreeuna = sObjgraficos.contruirJLabels("Cree una.",
                160,230,60,30,null, Color.BLUE,sRecursos.getCursorMano(),
                null);
        lcreeuna.addMouseListener((MouseListener) LoginComponent);
        pInicio.add(lcreeuna);
        
    }
    
    public void crearJFieldtext(){
        tcorreo = new JTextField("Correo electrónico,teléfono o Skype");
        tcorreo.setSize(330,40);
        tcorreo.setLocation((400-330)/2,150);
        tcorreo.setBackground(Color.WHITE);
        tcorreo.setForeground(Color.DARK_GRAY);
        tcorreo.setHorizontalAlignment(SwingConstants.LEFT);
        tcorreo.setBorder(bordercorreo);
        tcorreo.addMouseListener(LoginComponent);
        pInicio.add(tcorreo);
        tcontraseña = new JTextField();
    }
    
    public void crearJButton(){
        /*String Texto, int X,int Y,int Ancho
            ,int Largo, Color colorfondo,ImageIcon imagen ,
            Cursor cursor,boolean esSolido*/
        bSiguiente = new JButton();
        bSiguiente = sObjgraficos.construirJButton("Siguiente",250
                ,300, 120,30,Color.BLUE, null,
                sRecursos.getCursorMano(),Color.WHITE,null,true);
        bSiguiente.addActionListener(LoginComponent);
        bSiguiente.addMouseListener(LoginComponent);
        pInicio.add(bSiguiente);
        //bSalir
        
        bSalir = new JButton();
        iDim = new ImageIcon(iSalir.getImage().getScaledInstance(30,
                30,Image.SCALE_AREA_AVERAGING));
        bSalir = sObjgraficos.construirJButton(null,900,20,
                30,30,null,iDim,sRecursos.getCursorMano(),null,
                null,false);
        bSalir.addActionListener(LoginComponent);
        this.add(bSalir);
       
    }
    
    
    public void crearJpassword(){
        tcontrasena = new JPasswordField();
        //tcontrasena=sObjgraficos.contruirJPasswordField("contrasena", (400-330)/2 , 200, 330,40, Color.WHITE, null);
        tcontrasena.setText("contrasena");
        tcontrasena.setSize(330,40);
        tcontrasena.setLocation((400-330)/2,180);
        tcontrasena.setBackground(Color.WHITE);
        tcontrasena.setBorder(sRecursos.getBorde());
        tcontrasena.setHorizontalAlignment(SwingConstants.LEFT);
        tcontrasena.addMouseListener(LoginComponent);
        tcontrasena.setCaretColor(Color.CYAN);
        
        pInicio.add(tcontrasena);
    }
    
    public void Ventana(){
        this.setLayout(null);
        this.setSize(1000, 500);//se usa para darle un tmaño a la ventana 
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);//SE USA PARA QUE QUEDE A FULLSCREEN
        this.setUndecorated(true);
        this.setLocationRelativeTo(this);//this relativo a si misma y null el mismo efecto posicion en el eje de la x y y
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sRecursos.getColorVerde());//para dar color al fondo
        this.setVisible(true);//en lo preferible siempre de ultimas mostrar
    }
    
    ///metodos get---------------------------------------------
    
    public JButton getBSiguiente(){
        return this.bSiguiente;
    }
    
    public JButton getBSalir(){
        return this.bSalir;
    }
    public JLabel getlCreeuna(){
        return this.lcreeuna;
    }
    public JTextField getTcorreo(){
        return this.tcorreo;
    }  
    
    public JPasswordField getTcontrasena(){
        return this.tcontrasena;
    }
}
///metodos set configurar y get obtener 