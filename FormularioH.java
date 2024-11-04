import javax.swing.*;
   

public class FormularioH extends JFrame{

private JLabel label1;

public FormularioH(){
setLayout(null);
label1 = new JLabel("Majo");
label1.setBounds(600,100,2000000000,3000000000);
add(label1);

}

public static void main(String arg[]){

FormularioH Formulario1 = new FormularioH();
Formulario1.setBounds(0,0,400,300);
Formulario1.setVisible(true);
Formulario1.setLocationRelativeTo(null);



}




}