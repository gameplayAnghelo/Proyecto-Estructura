package Avance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class Tarjeta {
    String numero;
    String fecha;
    String CVC;

    public Tarjeta(String numero, String fecha, String CVC) {
        this.numero=numero;
        this.fecha=fecha;
        this.CVC=CVC;
    }
}

public class VentanaCarrito extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private HashMap<String, Tarjeta> metodosDePago;
	private JTextField textMonto;
	private JComboBox<Tarjeta> comboBoxTarjetas;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCarrito frame = new VentanaCarrito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCarrito() {
		metodosDePago = new HashMap<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		comboBoxTarjetas = new JComboBox<>();
		comboBoxTarjetas.setBounds(30, 179, 200, 20);
		getContentPane().add(comboBoxTarjetas);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Su compra ha sido agregada al carrito!");
		btnNewButton_1.setBounds(10, 28, 300, 80);
		btnNewButton_1.setEnabled(false);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar otro producto");
		btnNewButton_2.setBounds(700, 47, 200, 80);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu newFrame=new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButtonAgregar = new JButton("Agregar métodos de Pago");
		btnNewButtonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarMetodoDePago("Por tarjeta");
			}
		});
		btnNewButtonAgregar.setBounds(30, 210, 200, 60);
		contentPane.add(btnNewButtonAgregar);
		
		JButton btnNewButton_3 = new JButton("Emitir Factura");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(700, 320, 200, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Num. Tarjeta");
		btnNewButton_4.setBounds(30, 371, 117, 29);
		btnNewButton_4.setEnabled(false);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Vencimiento");
		btnNewButton_4_1.setBounds(30, 472, 117, 29);
		btnNewButton_4_1.setEnabled(false);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Codigo CVC");
		btnNewButton_4_2.setBounds(30, 555, 117, 29);
		btnNewButton_4_2.setEnabled(false);
		contentPane.add(btnNewButton_4_2);
		
		textField = new JTextField();
		textField.setBounds(30, 411, 200, 20);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 255, 128));
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 128));
		textField_1.setBounds(30, 512, 200, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 128));
		textField_2.setBounds(30, 595, 200, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_5 = new JButton("Pago Fisico");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarPago();
			}
		});
		btnNewButton_5.setBounds(307, 555, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("PAGAR");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarPago();
			}
		});
		btnNewButton_5_1.setBounds(500, 555, 117, 29);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_4_3 = new JButton("Ingrese Monto");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4_3.setEnabled(false);
		btnNewButton_4_3.setBounds(292, 371, 117, 29);
		contentPane.add(btnNewButton_4_3);
		
		textMonto = new JTextField();
		textMonto.setColumns(10);
		textMonto.setBackground(new Color(255, 255, 128));
		textMonto.setBounds(296, 411, 151, 20);
		contentPane.add(textMonto);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu newFrame = new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(800, 590, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(800, 591, 117, 29);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaCarrito.class.getResource("/Imagenes/fondocarrito-transformed.jpeg")));
		lblNewLabel.setBounds(0, 0, 934, 620);
		contentPane.add(lblNewLabel);
	}
	
	public void agregarMetodoDePago(String metodo) {
	    String tarjetaN = textField.getText();
	    String fecha = textField_1.getText();
	    String cvc = textField_2.getText();
	    Tarjeta tarjeta = new Tarjeta(tarjetaN, fecha, cvc);
	    metodosDePago.put(metodo, tarjeta);
	    comboBoxTarjetas.addItem(tarjeta); 
	    JOptionPane.showMessageDialog(this, "Método agregado con éxito");
	}


	private void realizarPago() {
	    Tarjeta tarjetaSeleccionada = (Tarjeta) comboBoxTarjetas.getSelectedItem();
	    if (tarjetaSeleccionada != null) {
	        double monto = Double.parseDouble(textMonto.getText());
	        // Aquí se puede añadir la lógica para procesar el pago con la tarjeta seleccionada
	        JOptionPane.showMessageDialog(this, "Pago realizado con éxito usando la tarjeta: " + tarjetaSeleccionada.numero);
	    } else {
	        JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún método de pago");
	    }
	}

}
