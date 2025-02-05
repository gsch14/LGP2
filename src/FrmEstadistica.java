import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmEstadistica extends JFrame{

    public FrmEstadistica() {
       setSize(600,300);
       setTitle("Estadistica");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       getContentPane().setLayout(null);

       JLabel lblDato=new JLabel("Dato");
       lblDato.setBounds(30,10,100,25);
       getContentPane().add(lblDato);

       JTextField txtDat0=new JTextField("");
       txtDat0.setBounds(80,10,100,25);
       getContentPane().add(txtDat0);

       JLabel lblDatos=new JLabel("Muestra de Datos");
       lblDatos.setBounds(300,10,100,25);
       getContentPane().add(lblDatos);

       JButton btnAgregar=new JButton("Agregar");
       btnAgregar.setBounds(80,40,100,25);
       getContentPane().add(btnAgregar);

       JButton btnQuitar=new JButton("Quitar");
       btnQuitar.setBounds(80,70,100,25);
       getContentPane().add(btnQuitar);
       
    }
}