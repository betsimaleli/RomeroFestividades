package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import controlador.ConexionBD;
public class FrmRegistroEventos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreEvento;
	private JTextField txtFeccha;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistroEventos frame = new FrmRegistroEventos();
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
	public FrmRegistroEventos() {
	ConexionBD pruebaConexion=new ConexionBD();
	pruebaConexion.abrirBaseDatos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setIcon(new ImageIcon("C:\\MIS PROYECTOS\\CURSO JAVA\\PROYECTO TECNOLOGICO\\IMAGENES PARA LOGO\\Fiesta1.jpg"));
		lblImagen.setBounds(0, 0, 257, 50);
		contentPane.add(lblImagen);
		
		JLabel lblNombre = new JLabel("Nombre Evento");
		lblNombre.setBounds(47, 85, 128, 20);
		contentPane.add(lblNombre);
		
		txtNombreEvento = new JTextField();
		txtNombreEvento.setBounds(160, 85, 276, 20);
		contentPane.add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(32, 435, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lbFecha = new JLabel(" Tipo de Evento");
		lbFecha.setBounds(42, 116, 204, 14);
		contentPane.add(lbFecha);
		
		txtFeccha = new JTextField();
		txtFeccha.setBounds(160, 116, 276, 20);
		contentPane.add(txtFeccha);
		txtFeccha.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 141, 276, 20);
		contentPane.add(textField_1);
		
		JLabel lbFecha_1 = new JLabel("Fecha del Evento");
		lbFecha_1.setBounds(32, 141, 204, 14);
		contentPane.add(lbFecha_1);
		
		JLabel lbHoraInicio = new JLabel("Hora de Inicio");
		lbHoraInicio.setBounds(32, 175, 204, 14);
		contentPane.add(lbHoraInicio);
		
		JLabel lbHoraFinal = new JLabel("Hora Final");
		lbHoraFinal.setBounds(32, 201, 204, 14);
		contentPane.add(lbHoraFinal);
		
		JLabel lbLugarEvento = new JLabel("Lugar del Evento");
		lbLugarEvento.setBounds(32, 231, 204, 14);
		contentPane.add(lbLugarEvento);
		
		JLabel lbBoleteria = new JLabel("Boleteria");
		lbBoleteria.setBounds(32, 259, 204, 14);
		contentPane.add(lbBoleteria);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 175, 276, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 200, 276, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 228, 276, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(160, 256, 276, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(160, 289, 276, 20);
		contentPane.add(textField_6);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(32, 292, 204, 14);
		contentPane.add(lblEstado);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(431, 435, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(241, 435, 89, 23);
		contentPane.add(btnCancelar);
	}
}
