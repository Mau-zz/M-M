import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane;
    private JTextArea textarea1;

    public Terminos() {
        setLayout(null);
        setTitle("Licencia de Uso");
        getContentPane().setBackground(new Color(30, 30, 30)); //color de fonfo
        setIconImage(new ImageIcon("C:/Users/Alys/Desktop/java/icon.png").getImage());

        label1 = new JLabel("Términos y Condiciones");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", Font.BOLD, 14));
        label1.setForeground(new Color(175, 71, 232));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", Font.PLAIN, 9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES DE WEB DESIGN TOOLS" +
                          "\n\n            1.  ACEPTACIÓN DE LOS TÉRMINOS\n" + //
                                                            "AL UTILIZAR LOS SERVICIOS DE WEB DESIGN TOOLS, ACEPTAS Y TE COMPROMETES A CUMPLIR CON ESTOS TÉRMINOS Y CONDICIONES.SI NO ESTÁS DE ACUERDO CON ALGUNO DE ESTOS TÉRMINOS, POR FAVOR, NO UTILICES NUESTROS SERVICIOS.." +
                          "\n            2.  MODIFICACIONES DE LOS TÉRMINOS\n" + //
                                                            "WEB DESIGN TOOLS SE RESERVA EL DERECHO A MODIFICAR O ACTUALIZAR ESTOS TÉRMINOS Y CONDICIONES EN CUALQUIER MOMENTO Y SIN PREVIO AVISO. ES RESPONSABILIDAD DEL USUARIO REVISAR ESTOS TÉRMINOS PERIÓDICAMENTE PARA ESTAR AL TANTO DE CUALQUIER CAMBIO.." +
                          "\n            C.  ALEXTECH ACADEMY NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                          "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                          "\n          (ALEXTECH ACADEMY Y EL AUTOR JHON), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                          "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)" +
                          "\n          SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                          "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                          "\n          http://www.alextech-academy.com");

        scrollPane = new JScrollPane(textarea1);
        scrollPane.setBounds(-5, 40, 575, 200);
        add(scrollPane);

        check1 = new JCheckBox("Yo acepto");
        check1.setBounds(10, 250, 100, 20);
        check1.addChangeListener(this);
        check1.setBackground(new Color(30,30,30));
        check1.setForeground(new Color(175, 71, 232));
        add(check1);

        boton1 = new JButton("CONTINUAR");
        boton1.setBounds(10, 290, 110, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        boton1.setBackground(new Color(30,30,30));
        boton1.setForeground(new Color(175, 71, 232));
        add(boton1);

        boton2 = new JButton("RECHAZAR");
        boton2.setBounds(130, 290, 110, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(false);
        boton2.setBackground(new Color(30,30,30));   // fondo y color modififcado
        boton2.setForeground(new Color(175, 71, 232));
        add(boton2);

        ImageIcon imagen = new ImageIcon("C:/Users/Alys/Desktop/java/icon.png");  // Ruta de ejemplo
        label2 = new JLabel(imagen);
        label2.setBounds(300, 250, 240, 150);
        add(label2);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected()) {
            boton1.setEnabled(true);
            boton2.setEnabled(true);
        } else {
            boton1.setEnabled(false); // se modifico segun la logica del usuario
            boton2.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            JOptionPane.showMessageDialog(this, "Has aceptado los términos.");
        } else if (e.getSource() == boton2) {
            JOptionPane.showMessageDialog(this, "Has rechazado los términos.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Terminos ventanalicencia = new Terminos();
        ventanalicencia.setBounds(0, 0, 550, 440);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}
