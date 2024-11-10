import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane;
    private JTextArea textarea1;

    public Licencia() {
        setLayout(null);
        setTitle("Licencia de Uso");
        setIconImage(new ImageIcon("C:/Users/Alys/Desktop/java/logo1png").getImage());

        // Label para los términos y condiciones
        label1 = new JLabel("Terminos y Condiciones");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale mano", 1, 14));
        label1.setForeground(new Color(175, 71, 232));
        add(label1);

        // Área de texto para mostrar los términos
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale mano", 0, 9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                          "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA ALEXTECH ACADEMY DE JHON." +
                          "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                          "\n            C.  ALEXTECH ACADEMY NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                          "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                          "\n          (ALEXTECH ACADEMY Y EL AUTOR JHON), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                          "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                          "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                          "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                          "\n          http://www.alextech-academy.com");

        // Agregar el área de texto dentro de un JScrollPane
        scrollPane = new JScrollPane(textarea1);
        scrollPane.setBounds(10, 40, 575, 200);
        add(scrollPane);

        // Checkbox para aceptar los términos
        check1 = new JCheckBox("Yo acepto");
        check1.setBounds(10, 290, 300, 20);
        check1.addChangeListener(this);
        add(check1);

        // Botón CONTINUAR, inicialmente deshabilitado
        boton1 = new JButton("CONTINUAR");
        boton1.setBounds(10, 320, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false); // Deshabilitado hasta que se acepte
        add(boton1);

        // Botón RECHAZAR
        boton2 = new JButton("RECHAZAR");
        boton2.setBounds(120, 320, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true); // Botón siempre habilitado
        add(boton2);

        // Imagen de logo
        ImageIcon imagen = new ImageIcon("C:/Users/Alys/Desktop/java/logo1png"); // Usa una ruta válida
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    // Método que se llama cuando cambia el estado del JCheckBox
    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected()) {
            boton1.setEnabled(true); // Habilitar el botón CONTINUAR si se ha aceptado
        } else {
            boton1.setEnabled(false); // Deshabilitar el botón CONTINUAR si no se ha aceptado
        }
    }

    // Método para manejar eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            JOptionPane.showMessageDialog(this, "¡Gracias por aceptar los términos!");
            // Aquí puedes cerrar la ventana o hacer alguna otra acción
        } else if (e.getSource() == boton2) {
            JOptionPane.showMessageDialog(this, "Has rechazado los términos. El programa se cerrará.");
            System.exit(0); // Cierra la aplicación si se rechaza
        }
    }

    public static void main(String args[]) {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0, 0, 600, 360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}


