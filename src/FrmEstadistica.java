
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class FrmEstadistica extends JFrame {

JTextField txtDato;
JList
    public FrmEstadistica() {
        setSize(600, 300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblDato = new JLabel("Dato");
        lblDato.setBounds(30, 10, 100, 25);
        getContentPane().add(lblDato);

        txtDato = new JTextField("");
        txtDato.setBounds(80, 10, 100, 25);
        getContentPane().add(txtDato);

        JLabel lblDatos = new JLabel("Muestra de Datos");
        lblDatos.setBounds(300, 10, 100, 25);
        getContentPane().add(lblDatos);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(80, 40, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(80, 70, 100, 25);
        getContentPane().add(btnQuitar);

        lstMuestra=new JList<>();
        lstMuestra.setBounds(300, 40, 100, 150);
        getContentPane().add(lstMuestra);

        // Eventos
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                agregarDato();
            }
        });

        btnQuitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                quitarDato();
            }
        });
    }
    //Declarar el arreglo que almacenará los datos de la muestra
    private double[] muestra=new double[1000];
    private int datosTotales = -1;

    private void agregarDato() {
        double dato=Double.parseDouble(txtDato.getText());
        datosTotales++;
        muestra[datosTotales] = dato;
    }
    private void mostrarMuestra(){
       String[]strMuestra=new String[datosTotales];
       for(int i=0;i<=datosTotales;i++){
          strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstMuestra.setListData(strMuestra);
    };

    private void quitarDato() {
        JOptionPane.showMessageDialog(null, "Hizo click en quitar");

    }

}