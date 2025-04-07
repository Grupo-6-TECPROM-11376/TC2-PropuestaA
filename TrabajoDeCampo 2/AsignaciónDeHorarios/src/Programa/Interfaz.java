package Programa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNuevoProfesor;
	private JButton btnEditarProfesores;
	private JButton btnRemoverProfesores;
	private JButton btnEditarDatosSalones;
	private JButton btnRemoverSalones;
	private JButton btnImportarBaseDeDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido ¿Qué desea hacer?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(140, 54, 361, 33);
		contentPane.add(lblNewLabel);
		
		btnNuevoProfesor = new JButton("Asignar nuevo profesor");
		btnNuevoProfesor.addActionListener(this);
		btnNuevoProfesor.setBounds(93, 134, 181, 23);
		contentPane.add(btnNuevoProfesor);
		
		JButton btnNuevoSalón = new JButton("Asignar nuevo salón");
		btnNuevoSalón.setBounds(366, 134, 181, 23);
		contentPane.add(btnNuevoSalón);
		{
			btnEditarProfesores = new JButton("Editar datos de los profesores");
			btnEditarProfesores.addActionListener(this);
			btnEditarProfesores.setBounds(93, 168, 181, 23);
			contentPane.add(btnEditarProfesores);
		}
		{
			btnRemoverProfesores = new JButton("Remover profesores");
			btnRemoverProfesores.setBounds(93, 202, 181, 23);
			contentPane.add(btnRemoverProfesores);
		}
		{
			btnEditarDatosSalones = new JButton("Editar datos de los salones");
			btnEditarDatosSalones.addActionListener(this);
			btnEditarDatosSalones.setBounds(366, 168, 181, 23);
			contentPane.add(btnEditarDatosSalones);
		}
		{
			btnRemoverSalones = new JButton("RemoverSalones");
			btnRemoverSalones.setBounds(366, 202, 181, 23);
			contentPane.add(btnRemoverSalones);
		}
		{
			btnImportarBaseDeDatos = new JButton("Importar Información de Bases de Datos");
			btnImportarBaseDeDatos.setBounds(191, 256, 259, 23);
			contentPane.add(btnImportarBaseDeDatos);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEditarDatosSalones) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnEditarProfesores) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnNuevoProfesor) {
			do_btnNuevoProfesor_actionPerformed(e);
		}
	}
	protected void do_btnNuevoProfesor_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	}
}
