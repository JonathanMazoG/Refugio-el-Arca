package com.mycompany.zoo.el.arca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class IngresoSuministroGUI extends JFrame {

    private JTextField nameField;
    private JTextField dateField;
    private JTextField priceField;
    private JButton addButton;
    private JTextArea suministrosArea;
    private Suministro[] suministros;

    public IngresoSuministroGUI(Suministro[] suministros) {
        this.suministros = suministros;
        setTitle("Ingreso de Suministros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    public IngresoSuministroGUI(ArrayList<Suministro> suministros2) {
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(new JLabel("Nombre:"), c);

        c.gridx = 1;
        nameField = new JTextField(20);
        panel.add(nameField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(new JLabel("Fecha de compra:"), c);

        c.gridx = 1;
        dateField = new JTextField(20);
        panel.add(dateField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(new JLabel("Precio:"), c);

        c.gridx = 1;
        priceField = new JTextField(20);
        panel.add(priceField, c);

        c.gridx = 1;
        c.gridy = 3;
        addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String date = dateField.getText();
                float price = Float.parseFloat(priceField.getText());
                Suministro s = new Suministro(name, date, price);
                suministrosArea.append(s.toString() + "\n");
                addSuministro(s);
                clearFields();
            }
        });
        panel.add(addButton, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        suministrosArea = new JTextArea(10, 20);
        suministrosArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(suministrosArea);
        panel.add(scrollPane, c);

        add(panel);
    }

    private void addSuministro(Suministro s) {
        for (int i = 0; i < suministros.length; i++) {
            if (suministros[i] == null) {
                suministros[i] = s;
                return;
            }
        }
    }

    private void clearFields() {
        nameField.setText("");
        dateField.setText("");
        priceField.setText("");
    }
}