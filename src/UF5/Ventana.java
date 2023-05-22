package UF5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Ventana extends JFrame {

    public JPanel panel;
    public Ventana(){

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mundial 2022");
       // setLocation(400, 400);
       // setBounds(400, 400,500,500);
        iniciarComponentes();
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes(){

       colocarPaneles();
       colocarEtiquetas();

    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.cyan);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
        JLabel etiqueta= new JLabel("Click here!",SwingConstants.CENTER);
        panel.add(etiqueta);
        etiqueta.setBounds(100,20,100,20);
        etiqueta.setForeground(Color.black);
        //etiqueta.setOpaque(true);
        etiqueta.setFont(new Font("Bookman Old Style",Font.ITALIC,16));
        //etiqueta.setBackground(Color.white);

        ImageIcon imagen= new ImageIcon("balonMundial.jpg");
        JLabel etiqueta2= new JLabel();
        etiqueta2.setBounds(10,100,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
}
