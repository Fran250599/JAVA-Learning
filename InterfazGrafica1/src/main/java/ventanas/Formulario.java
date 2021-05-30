package ventanas;

import javax.swing.*;
import java.awt.event.*;

//JFrame es para el diseño
//ActionListener nos ayuda a escuchar los eventos cuando pasan
public class Formulario extends JFrame implements ActionListener {

    //Campo para texto
    private JTextField textField1;
    
    //Etiqueta
    private JLabel label1;
    
    //Boton
    private JButton boton1;
    
    
    public Formulario(){
        
        //Metodo para diseñar la ventana
        
        //Evita que se coloque donde el programa quiera
        setLayout(null);

        //Evita creación de demonio (Que se siga ejecutando el 
        //programa en segundo plano) 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //LABEL
        //Creacion de la etiqueta
        label1 = new JLabel("Mensaje");
        
        //Aqui se elijen las coordenadas de la etiqueta
        //               X, Y, WIDTH, HEIGHT
        label1.setBounds(15,10, 100, 30);
        
        //Agregar o generar etiqueta
        add(label1);
        
        
        
        //TEXT FIELD
        //Misma logica de arriba
        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);
        
        //Button
        //Misma logica de arriba
        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        add(boton1);
        
        //Agregamos un evento
        //el cual será programado en el siguiente metodo
        boton1.addActionListener(this);

    }

    //Metodo para capturar el evento por medio del 
    //parametro 'e'
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Atrapa el evento boton1 y lo programa
            if(e.getSource() == boton1){
                String cadena = textField1.getText();
                JOptionPane.showMessageDialog(null, cadena);
                
                //Cerrar interfaz grafica
                //System.exit(0);
            }
    }
    
    public static void main(String[] args) {
        
        Formulario formulario = new Formulario();
        formulario.setBounds(0, 0, 300, 150);
        formulario.setVisible(true);
        formulario.setResizable(true);
        
        //Inicia la interfaz al centro de la pantalla
        formulario.setLocationRelativeTo(null);
        
        
    }
}