
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class AdministracionGUI extends JFrame implements ActionListener {
    private Administracion admin;
    private ArrayList<Cliente> clientes;
    private ArrayList<Animal> animales;
    private ArrayList<Boleta> boletas;
    private ArrayList<Plan> planes;
    private ArrayList<Suministro> suministros;
    private ArrayList<ReporteDeVentas> reportesDeVentas;
    
    private JLabel lblTitulo;
    private JLabel lblNombreCliente;
    private JLabel lblNumVisitas;
    private JTextField txtNombreCliente;
    private JTextField txtNumVisitas;
    private JButton btnAgregarCliente;
    
    public AdministracionGUI() {
        admin = new Administracion();
        clientes = new ArrayList<Cliente>();
        animales = new ArrayList<Animal>();
        boletas = new ArrayList<Boleta>();
        planes = new ArrayList<Plan>();
        suministros = new ArrayList<Suministro>();
        reportesDeVentas = new ArrayList<ReporteDeVentas>();
        
        setTitle("Administración del Arca de Noé");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        
        lblTitulo = new JLabel("Agregar Cliente");
        add(lblTitulo);
        
        JPanel pnlAgregarCliente = new JPanel();
        pnlAgregarCliente.setLayout(new GridLayout(2, 2));
        
        lblNombreCliente = new JLabel("Nombre:");
        pnlAgregarCliente.add(lblNombreCliente);
        
        txtNombreCliente = new JTextField();
        pnlAgregarCliente.add(txtNombreCliente);
        
        lblNumVisitas = new JLabel("Número de visitas:");
        pnlAgregarCliente.add(lblNumVisitas);
        
        txtNumVisitas = new JTextField();
        pnlAgregarCliente.add(txtNumVisitas);
        
        btnAgregarCliente = new JButton("Agregar");
        btnAgregarCliente.addActionListener(this);
        pnlAgregarCliente.add(btnAgregarCliente);
        
        add(pnlAgregarCliente);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarCliente) {
            String nombre = txtNombreCliente.getText();
            int numVisitas = Integer.parseInt(txtNumVisitas.getText());
            Cliente cliente = new Cliente(numVisitas, nombre, numVisitas, nombre, numVisitas);
            clientes = admin.ingresoCliente(cliente, clientes);
            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente");
            txtNombreCliente.setText("");
            txtNumVisitas.setText("");
        }
    }
    
    public static void main(String[] args) {
        AdministracionGUI gui = new AdministracionGUI();
    }
}