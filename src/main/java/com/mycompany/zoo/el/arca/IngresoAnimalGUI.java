package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class IngresoAnimalGUI extends JFrame implements ActionListener {

    private JTextField txtNombre, txtEtapa;
    private JButton btnAgregar, btnCancelar;
    private ArrayList<Animal> animalList;

    public IngresoAnimalGUI(ArrayList<Animal> animalList) {
        initComponents();
        this.animalList = animalList;
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso Animal");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);
        panel.add(new JLabel("Etapa:"));
        txtEtapa = new JTextField();
        panel.add(txtEtapa);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);

        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(btnAgregar);
        btnPanel.add(btnCancelar);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btnAgregar) {
            // Agregar el animal a la lista y cerrar la ventana
            int id = animalList.size() + 1;
            String nombre = txtNombre.getText();
            String etapa = txtEtapa.getText();
            Animal animal = new Animal(id, nombre, etapa);
            animalList.add(animal);
            dispose();
        } else if (source == btnCancelar) {
            // Cerrar la ventana sin agregar el animal a la lista
            dispose();
        }
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }
}
