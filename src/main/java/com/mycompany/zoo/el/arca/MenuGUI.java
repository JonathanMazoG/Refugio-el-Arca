package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuGUI extends JFrame implements ActionListener {
    private ArrayList<Cliente> clientes = new ArrayList<>();
private ArrayList<Animal> animales = new ArrayList<>();
private ArrayList<Boleta> boletas = new ArrayList<>();
private ArrayList<Plan> planes = new ArrayList<>();
private ArrayList<Suministro> suministros = new ArrayList<>();
    private JButton btnIngresoCliente, btnIngresoAnimal, btnIngresoBoleta, btnIngresoPlan, btnIngresoSuministro,btnIngresoImprimir;

    public MenuGUI() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú ArcaZoo");

        btnIngresoCliente = new JButton("Ingreso Cliente");
        btnIngresoCliente.addActionListener(this);

        btnIngresoAnimal = new JButton("Ingreso Animal");
        btnIngresoAnimal.addActionListener(this);

        btnIngresoBoleta = new JButton("Ingreso Boleta");
        btnIngresoBoleta.addActionListener(this);

        btnIngresoPlan = new JButton("Ingreso Plan");
        btnIngresoPlan.addActionListener(this);

        btnIngresoSuministro = new JButton("Ingreso Suministro");
        btnIngresoSuministro.addActionListener(this);

       

        btnIngresoImprimir = new JButton("Imprimir");
        btnIngresoImprimir.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(btnIngresoCliente);
        panel.add(btnIngresoAnimal);
        panel.add(btnIngresoBoleta);
        panel.add(btnIngresoPlan);
        panel.add(btnIngresoSuministro);
        
        panel.add(btnIngresoImprimir);

        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btnIngresoCliente) {
            // Abrir la interfaz de ingreso de cliente
            IngresoClienteGUI ingresoClienteFrame = new IngresoClienteGUI(clientes);
            ingresoClienteFrame.setVisible(true);
        } else if (source == btnIngresoAnimal) {
            // Abrir la interfaz de ingreso de animal
            IngresoAnimalGUI ingresoAnimalFrame = new IngresoAnimalGUI(animales);
            ingresoAnimalFrame.setVisible(true);
        } else if (source == btnIngresoBoleta) {
            // Abrir la interfaz de ingreso de boleta
            IngresoBoletaGUI ingresoBoletaFrame = new IngresoBoletaGUI(boletas, clientes, animales);
            ingresoBoletaFrame.setVisible(true);
        } else if (source == btnIngresoPlan) {
            // Abrir la interfaz de ingreso de plan
            IngresoPlanGUI ingresoPlanFrame = new IngresoPlanGUI(planes);
            ingresoPlanFrame.setVisible(true);
        } else if (source == btnIngresoSuministro) {
            // Abrir la interfaz de ingreso de suministro
            IngresoSuministroGUI ingresoSuministroFrame = new IngresoSuministroGUI(suministros);
            ingresoSuministroFrame.setVisible(true);
        } 
    }

   
}