package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class IngresoBoletaGUI extends JFrame {
    private JLabel clienteLabel, precioLabel, planLabel, fechaLabel, descuentoLabel;
    private JTextField clienteText, precioText, planText, fechaText, descuentoText;
    private JButton ingresarButton;
    private ArrayList<Boleta> boletaList;

    
    public IngresoBoletaGUI(ArrayList<Boleta> boletas, ArrayList<Cliente> clientes, ArrayList<Animal> animales) {
        // Configurar la ventana
        setTitle("Ingresar Boleta");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear los componentes de la interfaz
        clienteLabel = new JLabel("Cliente:");
        precioLabel = new JLabel("Precio:");
        planLabel = new JLabel("Plan:");
        fechaLabel = new JLabel("Fecha:");
        descuentoLabel = new JLabel("Descuento:");
        clienteText = new JTextField(20);
        precioText = new JTextField(20);
        planText = new JTextField(20);
        fechaText = new JTextField(20);
        descuentoText = new JTextField(20);
        ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ingresarBoleta();
            }
        });
        
        // Agregar los componentes a la ventana
        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(clienteLabel);
        panel.add(clienteText);
        panel.add(precioLabel);
        panel.add(precioText);
        panel.add(planLabel);
        panel.add(planText);
        panel.add(fechaLabel);
        panel.add(fechaText);
        panel.add(descuentoLabel);
        panel.add(descuentoText);
        panel.add(new JLabel(""));
        panel.add(ingresarButton);
        add(panel);
        
        // Mostrar la ventana
        setVisible(true);
    }
    
    /**
     * 
     */
    private void ingresarBoleta() {
        String cliente = clienteText.getText();
        double precio = Double.parseDouble(precioText.getText());
        String plan = planText.getText();
        String fecha = fechaText.getText();
        double descuento = Double.parseDouble(descuentoText.getText());
        
        // Crear la boleta con los datos ingresados
        Cliente c = new Cliente();
        cliente = c.getName();
        Plan p = new Plan();
        plan = p.getDescription();
        Boleta b = new Boleta(c, precio, p, fecha, descuento);
        
        // Agregar la boleta al array de boletas
        // (asumiendo que el array es un parámetro de la interfaz)
         boletaList.add(b);
        
        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Boleta ingresada con éxito.");
        
        // Limpiar los campos de texto
        clienteText.setText("");
        precioText.setText("");
        planText.setText("");
        fechaText.setText("");
        descuentoText.setText("");
    }
  
    public static void main(String[] args) {
        IngresoBoletaGUI gui = new IngresoBoletaGUI(null, null, null);
    }
  }