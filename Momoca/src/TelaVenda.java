import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;


public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JDiag jDiag;
	private JTextField textField_3;
	private JTable table;

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
		setBounds(100, 100, 889, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTotal = new JLabel("Total R$");
		lblTotal.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblTotal.setBounds(10, 528, 161, 58);
		contentPane.add(lblTotal);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("Verdana", Font.PLAIN, 35));
		textField.setText("135,54");
		textField.setBounds(181, 528, 197, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblProduto = new JLabel("Valor Unit\u00E1rio R$");
		lblProduto.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblProduto.setBounds(480, 408, 180, 31);
		contentPane.add(lblProduto);
		
		JTextPane txtpnFarinhaDeManioca = new JTextPane();
		txtpnFarinhaDeManioca.setEditable(false);
		txtpnFarinhaDeManioca.setText("FARINHA DE MANDIOCA - GRANFINO - 500GR");
		txtpnFarinhaDeManioca.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtpnFarinhaDeManioca.setBounds(480, 323, 363, 74);
		contentPane.add(txtpnFarinhaDeManioca);
		
		JLabel lblPreoUnitrio = new JLabel("Qnt");
		lblPreoUnitrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreoUnitrio.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblPreoUnitrio.setBounds(766, 246, 77, 31);
		contentPane.add(lblPreoUnitrio);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setText("12345643434");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(480, 282, 249, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("C\u00F3digo de Barras");
		lblQuantidade.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblQuantidade.setBounds(480, 246, 233, 31);
		contentPane.add(lblQuantidade);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("5");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(766, 282, 77, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(480, 25, 363, 210);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("5,99");
		textField_3.setBounds(721, 412, 122, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 454, 422);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Valor", "Qnt", "Total"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(359);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Op\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(480, 450, 363, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("F2 Inserir C\u00F3digo de Barras");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 24, 191, 20);
		panel.add(lblNewLabel_1);

		try {
			UIManager
					.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro ao mudat look");
		}
	}
}
