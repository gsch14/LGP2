import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmRomanos extends JFrame{
    public FrmRomanos(){
        setSize(350,250);
        setTitle("Conversión Romanos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblArabigo=new JLabel("Número arábigo");
        lblArabigo.setBounds(10,10,100,25);
        getContentPane().add(lblArabigo);

        JTextField txtArabigo=new JTextField();
        txtArabigo.setBounds(100,10,100,25);
        getContentPane().add(txtArabigo);

        JButton btnCalcular=new JButton("Convertir");
        btnCalcular.setBounds(10,40,100,25);
        getContentPane().add(btnCalcular);

        JTextField txtRomano=new JTextField();
        txtRomano.setBounds(110,40,100,25);
        txtRomano.setEnabled(false);
        getContentPane().add(txtRomano);

        btnCalcular.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                convertirARomano();
            }
        });
    }
}


