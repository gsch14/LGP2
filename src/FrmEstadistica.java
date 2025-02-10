import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrmEstadistica extends JFrame {
    JTextField txtDato;
    JList lstMuestra;
    JTextField txtEstadistica;
    public FrmEstadistica() {

        setSize(600, 300);
        setTitle("Estadística");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblDato = new JLabel("Dato");
        lblDato.setBounds(10, 10, 100, 25);
        getContentPane().add(lblDato);

        txtDato = new JTextField();
        txtDato.setBounds(80, 10, 100, 25);
        getContentPane().add(txtDato);
         
        JLabel lblDatos = new JLabel("Muestra");
        lblDatos.setBounds(210, 10, 100, 25);
        getContentPane().add(lblDatos);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(80, 40, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(80, 70, 100, 25);
        getContentPane().add(btnQuitar);

        lstMuestra = new JList();
        JScrollPane spMuestra=new JScrollPane(lstMuestra);
        spMuestra.setBounds(210, 40, 100, 150);
        getContentPane().add(spMuestra);

        JButton btnEstadistica=new JButton("calcular");
        btnEstadistica.setBounds(10,200,100,25);
        getContentPane().add(btnEstadistica);

        JComboBox cmbEstadistica=new JComboBox();
        String[] opciones=new String[]{"Sumatoria", "Promedio", "División", "Máximo","Minimo", "Moda"};
        DefaultComboBoxModel mdlEstadisctica=new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(mdlEstadisctica);
        cmbEstadistica.setBounds(110,200,100,25);
        getContentPane().add(cmbEstadistica);

        txtEstadistica = new JTextField();
        txtEstadistica.setBounds(210, 200, 100, 25);
        getContentPane().add(txtEstadistica);



         // eventos de la GUI
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
         // declarar el arreglo que almacenará los datos de la muestra
    private double[] muestra = new double[1000];
    private int totalDatos = -1;

    private void agregarDato() {
        double dato = Double.parseDouble(txtDato.getText());
        totalDatos++;
        muestra[totalDatos] = dato;
        mostrarMuestra();
    }
    private void mostrarMuestra() {
        String[] strMuestra = new String[totalDatos + 1];
        for (int i = 0; i <= totalDatos; i++) {
            strMuestra[i] = String.valueOf(muestra[i]);
        }
        lstMuestra.setListData(strMuestra);
    }

    private void quitarDato() {
        JOptionPane.showMessageDialog(null, "Hizo clic en QUITAR");
    }

}

