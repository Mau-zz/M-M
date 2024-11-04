import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formularioc extends JFrame implements ActionListener {

    // Declaración de componentes
    private JLabel labelNombre, labelCorreo, labelTelefono, labelContraseña;
    private JTextField textNombre, textCorreo, textTelefono;
    private JPasswordField textContraseña;
    private JButton botonEnviar;

    // Constructor del formulario
    public Formularioc() {
        // Configuración de la ventana
        setTitle("Formulario de Registro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicialización de componentes
        labelNombre = new JLabel("Nombre:");
        labelCorreo = new JLabel("Correo:");
        labelTelefono = new JLabel("Teléfono:");
        labelContraseña = new JLabel("Contraseña:");

        textNombre = new JTextField();
        textCorreo = new JTextField();
        textTelefono = new JTextField();
        textContraseña = new JPasswordField();

        botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(this);

        // Agregar componentes al formulario
        add(labelNombre);
        add(textNombre);
        add(labelCorreo);
        add(textCorreo);
        add(labelTelefono);
        add(textTelefono);
        add(labelContraseña);
        add(textContraseña);
        add(new JLabel()); // Espacio en blanco
        add(botonEnviar);

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método para manejar el evento de botón
    @Override
    public void actionPerformed(ActionEvent e) {
        // Validación de campos vacíos
        if (textNombre.getText().isEmpty() || textCorreo.getText().isEmpty() ||
            textTelefono.getText().isEmpty() || textContraseña.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener valores ingresados
            String nombre = textNombre.getText();
            String correo = textCorreo.getText();
            String telefono = textTelefono.getText();
            String contraseña = new String(textContraseña.getPassword());

            // Mostrar información en consola
            System.out.println("Nombre: " + nombre);
            System.out.println("Correo: " + correo);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Contraseña: " + contraseña);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(this, "Formulario enviado exitosamente.");
        }
    }

    // Método principal para ejecutar el formulario
    public static void main(String[] args) {
        new Formulario();
    }
}
