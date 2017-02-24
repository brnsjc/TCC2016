package br.com.javaparaweb.conexao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Conexao {

	private Connection conec;
    private Statement exeComando;
    private ResultSet resultado;
    
	public static void main(String[] args){
		// TODO Auto-generated method stub	
	}
	

	public void Conectar(){
		

		java.sql.Connection conexao = null;
		String url = "jdbc:mysql://localhost/agenda";
		String login = "root";
		String senha = "@Ubuntubruno15";
		
		try {
			conexao = DriverManager.getConnection(url,login,senha);
			JOptionPane.showMessageDialog(null,"Conectou caraio !!!");
			//conexao.close();
							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Nao Conectou =/"+e.getMessage());
			e.printStackTrace();
			
		}
	}

	public boolean executarQuery(String sql) throws SQLException {
       
		this.Conectar();
		resultado = exeComando.executeQuery(sql);

        if (resultado.next()) {
            return true;
        } else {
            return false;
        }
    }

	public boolean executarUpdate(String sql) throws SQLException {
     
		this.Conectar();
		int erro;
        erro = exeComando.executeUpdate(sql);
        if (erro == 0) {
            return false;
        } else {
            return true;
        }
    }
}

