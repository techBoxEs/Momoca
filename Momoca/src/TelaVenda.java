import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.Color;


public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable tbListaProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
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
	public TelaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total R$");
		lblTotal.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblTotal.setBounds(465, 505, 161, 58);
		contentPane.add(lblTotal);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("Verdana", Font.PLAIN, 35));
		textField.setText("135,54");
		textField.setBounds(624, 505, 194, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 163, 440, 400);
		contentPane.add(scrollPane);
		
		tbListaProdutos = new JTable();
		tbListaProdutos.setToolTipText("");
		tbListaProdutos.setEnabled(false);
		scrollPane.setViewportView(tbListaProdutos);
		tbListaProdutos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Pre\u00E7o"
			}
		));
		

		try {
			UIManager
					.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro ao mudat look");
		}
	}
}
