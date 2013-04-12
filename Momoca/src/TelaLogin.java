import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField pfSenha;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 0, 284, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID Usu\u00E1rio:");
		lblId.setBounds(20, 130, 62, 14);
		panel.add(lblId);
		
		JLabel label = new JLabel("");
		label.setBounds(232, 13, 0, 0);
		panel.add(label);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(20, 170, 62, 14);
		panel.add(lblSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(85, 163, 117, 28);
		panel.add(pfSenha);
		
		tfId = new JTextField();
		tfId.setBounds(85, 123, 117, 28);
		panel.add(tfId);
		tfId.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\LoginIcon.png"));
		btnLogin.setBounds(20, 206, 109, 23);
		panel.add(btnLogin);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\cancelar.png"));
		btnCancelar.setBounds(149, 206, 109, 23);
		panel.add(btnCancelar);
		
		
		try {
			UIManager
					.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro ao mudat look");
		}
	}
}
