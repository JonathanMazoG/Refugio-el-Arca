package com.mycompany.zoo.el.arca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AgregarPlanGUI extends JFrame {

    private JTextField numberOfSlotsField;
    private JTextField descriptionField;
    private JTextField tipoAnimalField;
    private JTextField precioField;
    private JButton agregarButton;
    private ArrayList<Plan> planList;

    public AgregarPlanGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Agregar Plan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel numberOfSlotsLabel = new JLabel("Número de espacios:");
        numberOfSlotsField = new JTextField(10);

        JLabel descriptionLabel = new JLabel("Descripción:");
        descriptionField = new JTextField(10);

        JLabel tipoAnimalLabel = new JLabel("Tipo de animal:");
        tipoAnimalField = new JTextField(10);

        JLabel precioLabel = new JLabel("Precio:");
        precioField = new JTextField(10);

        agregarButton = new JButton("Agregar");

        JPanel contentPane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        contentPane.add(numberOfSlotsLabel, c);
        c.gridx = 1;
        contentPane.add(numberOfSlotsField, c);
        c.gridx = 0;
        c.gridy = 1;
        contentPane.add(descriptionLabel, c);
        c.gridx = 1;
        contentPane.add(descriptionField, c);
        c.gridx = 0;
        c.gridy = 2;
        contentPane.add(tipoAnimalLabel, c);
        c.gridx = 1;
        contentPane.add(tipoAnimalField, c);
        c.gridx = 0;
        c.gridy = 3;
        contentPane.add(precioLabel, c);
        c.gridx = 1;
        contentPane.add(precioField, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        contentPane.add(agregarButton, c);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numberOfSlots = Integer.parseInt(numberOfSlotsField.getText());
                    String description = descriptionField.getText();
                    String tipoAnimal = tipoAnimalField.getText();
                    double precio = Double.parseDouble(precioField.getText());

                    Plan plan = new Plan(numberOfSlots, description, tipoAnimal, precio);
                    //planList.add(plan);   
                

                    // Agregar el plan a la base de datos o a la lista de planes
                    // ...

                    JOptionPane.showMessageDialog(AgregarPlanGUI.this, "Plan agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AgregarPlanGUI.this, "Error en el formato de los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }

    

}