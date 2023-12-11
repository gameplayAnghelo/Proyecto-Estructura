package Avance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class Cliente {
    String nombreApellido;
    String ci;
    String direccion;
    String correo;
    String telefono;
    String nit;

    public Cliente(String nombreApellido, String ci, String direccion, String correo, String telefono, String nit) {
        this.nombreApellido = nombreApellido;
        this.ci=ci;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.nit = nit;
    }
}

public class VentanaGestion extends JFrame {

    private JPanel contentPane;
    private JTextField textField; // Nombre y Apellido
    private JTextField textField_1; // Carnet C.I
    private JTextField textField_2; // Dirección
    private JTextField textField_3; // Correo
    private JTextField textField_4; // Teléfono
    private JTextField textField_5; // NIT
    TextArea textArea;
    private JTextField txtBuscar;
    private HashMap<String, Cliente> clientes;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaGestion frame = new VentanaGestion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VentanaGestion() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 950, 660);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

       
       

        textField = new JTextField();
        textField.setBackground(new Color(255, 255, 128));
        textField.setBounds(400, 70, 400, 30);
        contentPane.add(textField);
        textField.setColumns(10);

         textArea = new TextArea();
        textArea.setBackground(new Color(255, 255, 128));
        textArea.setBounds(289, 442, 400, 200);
        contentPane.add(textArea);

        textField_1 = new JTextField();
        textField_1.setBackground(new Color(255, 255, 128));
        textField_1.setColumns(10);
        textField_1.setBounds(400, 130, 400, 30);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setBackground(new Color(255, 255, 128));
        textField_2.setColumns(10);
        textField_2.setBounds(400, 190, 400, 30);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBackground(new Color(255, 255, 128));
        textField_3.setBounds(400, 250, 400, 30);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBackground(new Color(255, 255, 128));
        textField_4.setBounds(400, 307, 400, 30);
        contentPane.add(textField_4);

        JButton btnNombreApellido = new JButton("Nombre y Apellido");
        btnNombreApellido.setEnabled(false);
        btnNombreApellido.setBounds(197, 72, 150, 40);
        contentPane.add(btnNombreApellido);

        JButton btnCarnetCI = new JButton("Carnet C.I");
        btnCarnetCI.setEnabled(false);
        btnCarnetCI.setBounds(197, 132, 150, 40);
        contentPane.add(btnCarnetCI);

        JButton btnDireccion = new JButton("Dirección");
        btnDireccion.setEnabled(false);
        btnDireccion.setBounds(197, 192, 150, 40);
        contentPane.add(btnDireccion);

        JButton btnCorreo = new JButton("Correo");
        btnCorreo.setEnabled(false);
        btnCorreo.setBounds(197, 252, 150, 40);
        contentPane.add(btnCorreo);

        JButton btnTelefono = new JButton("Telefono");
        btnTelefono.setEnabled(false);
        btnTelefono.setBounds(197, 309, 150, 40);
        contentPane.add(btnTelefono);

        JButton btnNIT = new JButton("NIT");
        btnNIT.setEnabled(false);
        btnNIT.setBounds(197, 368, 150, 40);
        contentPane.add(btnNIT);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBackground(new Color(255, 255, 128));
        textField_5.setBounds(401, 371, 400, 30);
        contentPane.add(textField_5);

        JButton btnFormularioDatos = new JButton("FORMULARIO DE DATOS");
        btnFormularioDatos.setEnabled(false);
        btnFormularioDatos.setBounds(367, 8, 250, 40);
        contentPane.add(btnFormularioDatos);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarCliente();
            }
        });
        btnGuardar.setBounds(706, 442, 150, 40);
        contentPane.add(btnGuardar);
        
        // Botón de buscar
        JButton btnBuscar = new JButton("Buscar por CI");
        btnBuscar.setBounds(90, 518, 100, 25);
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreCli = txtBuscar.getText();
                buscarCliente(nombreCli);
            }
        });
        contentPane.add(btnBuscar);
        txtBuscar = new JTextField();
        txtBuscar.setBounds(50, 469, 190, 25);
        contentPane.add(txtBuscar);
        
        JButton btnNewButton = new JButton("Regresar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		frame newFrame = new frame();
				newFrame.setVisible(true);
				setVisible(false);
        	}
        });
        btnNewButton.setBounds(800, 590, 117, 29);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(VentanaGestion.class.getResource("/Imagenes/fondogestion-transformed.jpeg")));
        lblNewLabel.setBounds(-12, 0, 1746, 621);
        contentPane.add(lblNewLabel);
        
        

        // Inicializar el HashMap
        clientes = new HashMap<>();
    }

    public void agregarCliente() {
        String ci = textField_1.getText();
        Cliente cliente = new Cliente(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText());
        clientes.put(ci, cliente);
        
            // Mostrar la información del cliente en el TextArea
            textArea.append("Cliente Añadido: \n");
            textArea.append("CI: " + cliente.ci + "\n");
            textArea.append("Nombre y Apellido: " + cliente.nombreApellido + "\n");
            textArea.append("Dirección: " + cliente.direccion + "\n");
            textArea.append("Correo: " + cliente.correo + "\n");
            textArea.append("Teléfono: " + cliente.telefono + "\n");
            textArea.append("NIT: " + cliente.nit + "\n\n");
      
    }
    public void mostrarInformacionCliente(String ci) {
       
        Cliente cliente = clientes.get(ci);

        // Mostramos la información del platillo si lo encontramos
        if (ci != null) {
            String mensaje = "Nombre: " + cliente.ci + "\nCI: " + cliente.nombreApellido + "\nDireccion: " + cliente.direccion+ "\nCorreo: " + cliente.correo+ "\nTelefono: "+ cliente.telefono+ "\nNIT: " +cliente.nit;
            JOptionPane.showMessageDialog(this, mensaje, "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Set<String> obtenerNombresPlatillos() {
        return clientes.keySet();
    }
    public void buscarCliente(String nombreCli) {
        // Llamamos a la función mostrarInformacionPlatillo con el nombre ingresado
        mostrarInformacionCliente(nombreCli);
    }
    
}
