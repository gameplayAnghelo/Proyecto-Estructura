package Avance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaReserva extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnAntesDeElegir;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReserva frame = new VentanaReserva();
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
	public VentanaReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(254, 157, 270, 26);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 255, 128));
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Numero de platos");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(80, 141, 150, 60);
		contentPane.add(btnNewButton);
		
		JButton btnFecha = new JButton("Fecha");
		btnFecha.setEnabled(false);
		btnFecha.setBounds(80, 241, 150, 60);
		contentPane.add(btnFecha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 128));
		textField_1.setBounds(254, 257, 270, 26);
		contentPane.add(textField_1);
		
		JButton btnNewButton_1_1 = new JButton("Hora");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.setBounds(80, 341, 150, 60);
		contentPane.add(btnNewButton_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 128));
		textField_2.setBounds(254, 357, 270, 26);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Tiempo");
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.setBounds(80, 441, 150, 60);
		contentPane.add(btnNewButton_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 255, 128));
		textField_3.setBounds(254, 457, 270, 26);
		contentPane.add(textField_3);
		
		btnNewButton_1 = new JButton("Elegir los platos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu newFrame=new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}});
		btnNewButton_1.setBounds(632, 151, 150, 40);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Emitir Factura");
		btnNewButton_2.setBounds(632, 304, 150, 40);
		contentPane.add(btnNewButton_2);
		
		btnAntesDeElegir = new JButton("Antes de elegir los platos, por favor complete los datos");
		btnAntesDeElegir.setEnabled(false);
		btnAntesDeElegir.setBounds(80, 21, 400, 60);
		contentPane.add(btnAntesDeElegir);
		
		btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.setBounds(800, 590, 117, 29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VentanaMenu newFrame = new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(835, 587, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(835, 587, 89, 23);
		contentPane.add(btnNewButton_4);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaReserva.class.getResource("/Imagenes/fondo2.jpeg")));
		lblNewLabel.setBounds(0, 0, 934, 621);
		contentPane.add(lblNewLabel);
	}
}

