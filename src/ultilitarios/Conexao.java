package ultilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexao {

	private String dataBase = "Momoca";
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:5432/" + dataBase;
	private String usuario = "postgres";
	private String senha = "senacrs";
	private Connection conexao;
	public Statement statement;
	public ResultSet resultSet;

	public boolean conecta() {

		boolean resultado = true;

		try {

			Class.forName(driver);
			conexao = DriverManager.getConnection(url, usuario, senha);

		} catch (ClassNotFoundException driver) {
			JOptionPane.showMessageDialog(null, "Driver não localizado: "
					+ driver);
			resultado = false;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro na conexão com a fonte de dados: " + e);
			resultado = false;
		}

		return resultado;
	}

	public void desconecta() {

		boolean resultado = true;

		try {
			conexao.close();
			JOptionPane.showMessageDialog(null, "Banco fechado");
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel fechar o banco de dados: " + erro);
			resultado = false;
		}
	}

	public void executarSQL(String sql) {
		try {
			statement = conexao
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			resultSet = statement.executeQuery(sql);

		} catch (SQLException sqlex) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel executar o comando SQL: " + sqlex
							+ ", o sql passado foi " + sql);
		}
	}

}