package com.mycompany.zoo.el.arca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AgregarCliente extends JFrame implements ActionListener {
    private Administracion admin;
    private ArrayList<Cliente> clientes;
    

    private JPanel pnlTitulo;
    private JPanel pnlAgregarCliente;
    private JLabel lblTitulo;
    private JLabel lblNombreCliente;
    private JLabel lblNumVisitas;
    private JTextField txtNombreCliente;
    private JTextField txtNumVisitas;
    private JButton btnAgregarCliente;

    public AgregarCliente() {
        admin = new Administracion();
        clientes = new ArrayList<>();
      

        setTitle("Administración del Arca de Noé");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Configurar panel del título
        pnlTitulo = new JPanel();
        lblTitulo = new JLabel("Agregar Cliente");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        pnlTitulo.add(lblTitulo);
        add(pnlTitulo, BorderLayout.NORTH);

        // Configurar panel de agregar cliente
        pnlAgregarCliente = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Nombre del cliente
        gbc.gridx = 0;
        gbc.gridy = 0;
        lblNombreCliente = new JLabel("Nombre:");
        pnlAgregarCliente.add(lblNombreCliente, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        txtNombreCliente = new JTextField(15);
        pnlAgregarCliente.add(txtNombreCliente, gbc);

        // Número de visitas
        gbc.gridx = 0;
        gbc.gridy = 1;
        lblNumVisitas = new JLabel("Número de visitas:");
        pnlAgregarCliente.add(lblNumVisitas, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        txtNumVisitas = new JTextField(15);
        pnlAgregarCliente.add(txtNumVisitas, gbc);

        // Botón de agregar cliente
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        btnAgregarCliente = new JButton("Agregar cliente");
        btnAgregarCliente.addActionListener(this);
        pnlAgregarCliente.add(btnAgregarCliente, gbc);

        add(pnlAgregarCliente, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarCliente) {
            try {
                String nombre = txtNombreCliente.getText();
                int numVisitas = Integer.parseInt(txtNumVisitas.getText());
                Cliente cliente = new Cliente(numVisitas, nombre, numVisitas, nombre, numVisitas);
                clientes = admin.ingresoCliente(cliente, clientes);
                JOptionPane.showMessageDialog(this, "Cliente agregado correctamente");
                txtNombreCliente.setText("");
                txtNumVisitas.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El número de visitas debe ser un valor numérico.");
            }
        }
    }
public static void main(String[] args) {
        AgregarCliente gui = new AgregarCliente();
    }
}