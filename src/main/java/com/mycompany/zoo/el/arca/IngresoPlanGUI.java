package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class IngresoPlanGUI extends JFrame {
    private JTextField numberOfSlotsField;
    private JTextField descriptionField;
    private JTextField tipoAnimalField;
    private JTextField precioField;
    private JButton submitButton;
    private JLabel messageLabel;
    private Boleta[] boletas;
    private ArrayList<Plan> planList;


    public IngresoPlanGUI(Boleta[] boletas) {
        this.boletas = boletas;
        setTitle("Ingreso de Plan");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        JLabel numberOfSlotsLabel = new JLabel("Número de slots:");
        numberOfSlotsField = new JTextField(10);
        add(numberOfSlotsLabel);
        add(numberOfSlotsField);

        JLabel descriptionLabel = new JLabel("Descripción:");
        descriptionField = new JTextField(10);
        add(descriptionLabel);
        add(descriptionField);

        JLabel tipoAnimalLabel = new JLabel("Tipo de animal:");
        tipoAnimalField = new JTextField(10);
        add(tipoAnimalLabel);
        add(tipoAnimalField);

        JLabel precioLabel = new JLabel("Precio:");
        precioField = new JTextField(10);
        add(precioLabel);
        add(precioField);

        submitButton = new JButton("Ingresar");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numberOfSlotsString = numberOfSlotsField.getText();
                String description = descriptionField.getText();
                String tipoAnimal = tipoAnimalField.getText();
                String precioString = precioField.getText();

                try {
                    int numberOfSlots = Integer.parseInt(numberOfSlotsString);
                    double precio = Double.parseDouble(precioString);
                    Plan plan = new Plan(numberOfSlots, description, tipoAnimal, precio);
                    planList.add(plan);
                    // Agregar el plan a la lista de planes del programa
                    // y mostrar un mensaje de éxito en la interfaz
                    messageLabel.setText("Plan ingresado exitosamente");
                } catch (NumberFormatException ex) {
                    messageLabel.setText("Error: Ingrese números válidos en los campos correspondientes");
                }
            }
        });
        add(submitButton);

        messageLabel = new JLabel("");
        add(messageLabel);

        setVisible(true);
    }
    public IngresoPlanGUI(ArrayList<Plan> planes) {
    }
  
}