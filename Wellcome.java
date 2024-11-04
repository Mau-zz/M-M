import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Wellcome extends JFrame implements ActionListener{

private JTextField textfield1;
private JLabel label1,label2,label3,label4;
private JButton boton1;




public Wellcome(){
setLayout(null);
setTitle("hello motherfucker");
getContentPane().setBackground(new Color(30, 30, 30));
setIconImage(new ImageIcon("C:/Users/Alys/Desktop/java/logo2.png").getImage());

ImageIcon imagen = new ImageIcon("C:/Users/Alys/Desktop/java/logo2.png");
label1 = new JLabel(imagen);
label1.setBounds(0,0,600,150);
add(label1);

label2 = new JLabel("Bienvenido");
label2.setBounds(240,180,300,30);
label2.setFont(new Font("Moving the bote",4,18));
label2.setForeground(new Color(175, 71, 232));
add(label2);


label3 = new JLabel("Ingrese Nombre de Usuario");
label3.setBounds(240,240,300,30);
label3.setFont(new Font("Moving the bote",4,18));
label3.setForeground(new Color(175, 71, 232));
add(label3);


label4 = new JLabel("@2024 Fldsmdfr - Corporation");
label4.setBounds(240,420,200,30);
label4.setFont(new Font("Moving the bote",4,12));
label4.setForeground(new Color(175, 71, 232));
add(label4);


textfield1 = new JTextField();
textfield1.setBounds(240,280,220,25);
textfield1.setBackground(new Color (255,255,255));
textfield1.setFont(new Font("Moving the bote",4,14));
textfield1.setForeground(new Color(0,0,0));
add(textfield1);


boton1 = new JButton("INGRESAR");
boton1.setBounds(240,320,220,30);
boton1.setBackground(new Color(255,255,255));
boton1.setFont(new Font("Moving the bote",4,14));
boton1.setForeground(new Color (175, 71, 232));
boton1.addActionListener(this);
add(boton1);
}


public void actionPerformed(ActionEvent m){
if(m.getSource() ==boton1){

}


}

public static void main(String args[]){
Wellcome ventanaWellcome = new Wellcome();
ventanaWellcome.setBounds(0,0,650,500);
ventanaWellcome.setVisible(true);
ventanaWellcome.setResizable(false);
ventanaWellcome.setLocationRelativeTo(null);


}

}