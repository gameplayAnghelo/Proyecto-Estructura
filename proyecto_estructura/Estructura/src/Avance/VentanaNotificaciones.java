package Avance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaNotificaciones extends JFrame {

	private JPanel contentPane;
	private PriorityQueue<Notificacion> colaPrioridad;
	private JTextArea textAreaNotificaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNotificaciones frame = new VentanaNotificaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Color rojoSuave = new Color(255, 153, 153);

	/**
	 * Create the frame.
	 */
	public VentanaNotificaciones() {

		colaPrioridad = new PriorityQueue<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textAreaNotificaciones = new JTextArea();
		textAreaNotificaciones.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textAreaNotificaciones);
		scrollPane.setBounds(50, 50, 600, 400);
		contentPane.add(scrollPane);

		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(800, 590, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame newFrame = new frame();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(rojoSuave);
		contentPane.add(btnNewButton);

		JButton btnRefresh = new JButton("Imprimir");
		btnRefresh.setBounds(550, 461, 100, 30);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesarSiguienteNotificacion();
			}
		});
		contentPane.add(btnRefresh);

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(new ImageIcon(VentanaNotificaciones.class.getResource("/Imagenes/refresh.jpg")));
		btnNewButton_1.setBounds(857, 11, 60, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaNotificaciones.class.getResource("/Imagenes/ventananoti-transformed.jpeg")));
		lblNewLabel.setBounds(0, 0, 934, 619);
		contentPane.add(lblNewLabel);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaNotificaciones newFrame = new VentanaNotificaciones();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});

		// Ejemplo de como añadir notificaciones
		Notificacion noti = new Notificacion("Pedido Aceptado",2);
		agregarNotificacion(noti);

	}

	public void agregarNotificacion(Notificacion notificacion) {
		colaPrioridad.offer(notificacion);
	}

	// Método para obtener y procesar la próxima notificación de mayor prioridad
	public void procesarSiguienteNotificacion() {
		Notificacion notificacion = colaPrioridad.poll();

		if (notificacion != null) {
			// Mostrar la notificación en el JTextArea
			textAreaNotificaciones.append("Notificación: " + notificacion.getMensaje() + "\n");
		} else {
			textAreaNotificaciones.append("No hay notificaciones pendientes.\n");
		}
	}

	public class Notificacion implements Comparable<Notificacion> {
		private String mensaje;
		private int prioridad;

		public Notificacion(String mensaje, int prioridad) {
			this.mensaje = mensaje;
			this.prioridad = prioridad;
		}

		public String getMensaje() {
			return mensaje;
		}

		public int getPrioridad() {
			return prioridad;
		}

		@Override
		public int compareTo(Notificacion otraNotificacion) {
			// Ordenamos las notificaciones por prioridad descendente
			return Integer.compare(otraNotificacion.getPrioridad(), this.prioridad);
		}
	}
}


