import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfQuantEstoque;
	private Imagem imagem = new Imagem();
	JLabel lblFoto;
	private JTextField tfCod;
	JComboBox cbCategoria;
	JFormattedTextField ftfPreco;
	JButton btnCadastrar;
	JButton btnAdicionarFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto frame = new TelaCadastroProduto();
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
	public TelaCadastroProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescricao.setBounds(10, 150, 72, 14);
		contentPane.add(lblDescricao);

		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(10, 190, 72, 14);
		contentPane.add(lblCategoria);

		JLabel lblQuantidadeEstoque = new JLabel("Quantidade estoque:");
		lblQuantidadeEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeEstoque.setBounds(10, 230, 137, 14);
		contentPane.add(lblQuantidadeEstoque);

		JLabel lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreco.setBounds(10, 266, 46, 14);
		contentPane.add(lblPreco);

		tfNome = new JTextField();
		tfNome.setEditable(false);
		tfNome.setBounds(150, 144, 209, 30);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		cbCategoria = new JComboBox();
		cbCategoria.setEnabled(false);
		cbCategoria.setEditable(true);
		cbCategoria.setModel(new DefaultComboBoxModel(
				new String[] { "<Adicionar nova categoria>" }));
		cbCategoria.setBounds(150, 184, 167, 30);
		contentPane.add(cbCategoria);

		tfQuantEstoque = new JTextField();
		tfQuantEstoque.setEditable(false);
		tfQuantEstoque.setBounds(150, 224, 62, 30);
		contentPane.add(tfQuantEstoque);
		tfQuantEstoque.setColumns(10);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(
				"C:\\Users\\aluno\\Desktop\\logoLogin.png"));
		lblLogo.setBounds(0, 0, 284, 89);
		contentPane.add(lblLogo);

		
		ftfPreco = new JFormattedTextField();
		ftfPreco.setEditable(false);
		ftfPreco.setBounds(150, 260, 62, 30);
		contentPane.add(ftfPreco);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(
				"C:\\Users\\aluno\\Desktop\\cancelar.png"));
		btnCancelar.setBounds(10, 307, 133, 30);
		contentPane.add(btnCancelar);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setEnabled(false);
		btnCadastrar.setIcon(new ImageIcon(
				"C:\\Users\\aluno\\Desktop\\btn-confirmar.png"));
		btnCadastrar.setBounds(150, 307, 133, 30);
		contentPane.add(btnCadastrar);

		btnAdicionarFoto = new JButton("Adicionar foto");
		btnAdicionarFoto.setEnabled(false);
		btnAdicionarFoto.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\btnAdd.png"));
		btnAdicionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileInterface = new JFileChooser();
				if (fileInterface.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					String caminho = fileInterface.getSelectedFile()
							.getAbsolutePath();
					imagem.addImagem(tfCod.getText()
							, caminho);
					lblFoto.setIcon(imagem.getImagem(tfCod.getText()));
				}
			}
		});
		btnAdicionarFoto.setBounds(609, 228, 151, 30);
		contentPane.add(btnAdicionarFoto);

		lblFoto = new JLabel("");
		lblFoto.setBackground(Color.BLACK);
		lblFoto.setOpaque(true);
		lblFoto.setBounds(397, 11, 363, 210);
		contentPane.add(lblFoto);
		
		JLabel lblCod = new JLabel("COD:");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCod.setBounds(10, 106, 46, 14);
		contentPane.add(lblCod);
		
		tfCod = new JTextField();
		tfCod.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if(event.getKeyCode() == 10 && tfCod.getText().length() >0 ){
					tfNome.setEditable(true);
					tfQuantEstoque.setEditable(true);
					cbCategoria.setEnabled(true);
					ftfPreco.setEditable(true);
					btnAdicionarFoto.setEnabled(true);
					btnCadastrar.setEnabled(true);
					
				}
			}
		});
		tfCod.setBounds(150, 100, 209, 30);
		contentPane.add(tfCod);
		tfCod.setColumns(10);

		try {
			UIManager
					.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			try {

				UIManager
						.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Erro ao mudat look");
			}
		}
	}
}
