package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FrmRegistroLocalidades extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistroLocalidades frame = new FrmRegistroLocalidades();
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
	public FrmRegistroLocalidades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 69, 202, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 110, 202, 20);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 151, 202, 20);
		contentPane.add(textField_4);
		
		JLabel lblLocalidad = new JLabel(" Localidad del Evento");
		lblLocalidad.setBounds(34, 72, 151, 20);
		contentPane.add(lblLocalidad);
		
		JLabel lblValorBoletas = new JLabel("Valor de la Boleta");
		lblValorBoletas.setBounds(34, 113, 151, 20);
		contentPane.add(lblValorBoletas);
		
		JLabel lblNumeroDeBoleta = new JLabel("Numero de Boleta");
		lblNumeroDeBoleta.setBounds(34, 154, 151, 20);
		contentPane.add(lblNumeroDeBoleta);
		
		JButton btnGuargar = new JButton("Guardar");
		btnGuargar.setBounds(34, 291, 89, 23);
		contentPane.add(btnGuargar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(198, 291, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(333, 291, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setIcon(new ImageIcon("C:\\MIS PROYECTOS\\CURSO JAVA\\PROYECTO TECNOLOGICO\\IMAGENES PARA LOGO\\Fiesta1.jpg"));
		lblImagen.setBounds(21, 11, 257, 50);
		contentPane.add(lblImagen);
	}
}
