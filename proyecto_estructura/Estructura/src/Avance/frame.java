package Avance;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Color amarilloPalido = new Color(255, 255, 153); // Puedes ajustar estos valores

	/**
	 * Create the frame.
	 */
	public frame() {
		setTitle("Sistema de gestion de Fast Food");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/sabrigotalba/Desktop/FondoRestaurante.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton_2 = new JButton("Notifiaciones y alertas");
		btnNewButton_2.setBounds(340, 500, 210, 80);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaNotificaciones newFrame = new VentanaNotificaciones();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setBackground(amarilloPalido);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Gestion de clientes");
		btnNewButton_1.setBounds(350, 300, 200, 80);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGestion newFrame = new VentanaGestion();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(amarilloPalido);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(385, 100, 117, 80);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu newFrame = new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(amarilloPalido);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(frame.class.getResource("/Imagenes/fondo.jpeg")));
		lblNewLabel.setBounds(0, 0, 946, 632);
		contentPane.add(lblNewLabel);

		ImageIcon ImageIcon2 = new ImageIcon("C:\\Users\\jhony\\Downloads\\BURGER.png");

		/**************************************
		 * INICIO DE LABEL
		 **************************************************/

	}
}



