package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class IngresoClienteGUI extends JFrame {
    
    private JTextField idField, nameField, ageField, tipoField, numVisitasField;
    private JButton addButton;
    private ArrayList<Cliente> clientes;
    
    public IngresoClienteGUI(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        
        // Configuración de la ventana principal
        setTitle("Agregar Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Creación de los elementos de la interfaz gráfica
        JPanel panel = new JPanel(new GridLayout(6, 2));
        idField = new JTextField();
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        nameField = new JTextField();
        panel.add(new JLabel("Nombre:"));
        panel.add(nameField);
        ageField = new JTextField();
        panel.add(new JLabel("Edad:"));
        panel.add(ageField);
        tipoField = new JTextField();
        panel.add(new JLabel("Tipo:"));
        panel.add(tipoField);
        numVisitasField = new JTextField();
        panel.add(new JLabel("Número de Visitas:"));
        panel.add(numVisitasField);
        addButton = new JButton("Agregar");
        panel.add(new JLabel(""));
        panel.add(addButton);
        
        // Configuración del botón agregar
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarCliente();
            }
        });
        
        // Agregar el panel a la ventana principal
        add(panel);
        
        // Mostrar la ventana
        setVisible(true);
    }
    
    private void agregarCliente() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String tipo = tipoField.getText();
        int numVisitas = Integer.parseInt(numVisitasField.getText());
        Cliente cliente = new Cliente(id, name, age, tipo, numVisitas);
        Administracion admin = new Administracion();
        clientes = admin.ingresoCliente(cliente, clientes);
        JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente.");
    }
    
}