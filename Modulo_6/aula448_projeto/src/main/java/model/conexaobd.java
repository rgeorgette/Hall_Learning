package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaobd {
	public Connection conexao;
	public conexaobd() {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/projeto_final";
				String user = "root";
				String senha = "";
				conexao = DriverManager.getConnection(url, user , senha);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
