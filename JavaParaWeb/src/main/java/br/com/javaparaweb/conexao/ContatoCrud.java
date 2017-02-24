package br.com.javaparaweb.conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ContatoCrud {
	
	
	public void Salvar(Contato contato){
		
		Connection conexao = this.GerarConexao();
		
		PreparedStatement inserT = null;
		
		String sql = "insert into contato(nome,telefone,email,dt_cad,obs) values(?,?,?,?,?)";
		
		try {
			
			inserT = conexao.prepareStatement(sql);
			
			//inserT.setString(1, contato.getNome());
			//inserT.setString(2, contato.getTelefone());
			//inserT.setString(3, contato.getEmail());
			//inserT.setDate(4, contato.getDataCadastro());
			//inserT.setString(5, contato.getObs());
			//inserT.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao incluir Contato: "+ e.getMessage());
			
			e.printStackTrace();
		}finally{
			
			try {
				inserT.close();
				conexao.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				System.out.println("Erro ao fechar op de inserção: "+ e.getMessage());
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

	public void Atualizar(Contato contato){}
	
	public void Excluir(Contato contato){}
	
	public List<Contato> Listar(){
		
		Connection cone = this.GerarConexao();
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Statement consulta = null;
		ResultSet resultado = null;
		Contato contato = null;
		
		String sql = "select * from contato";
		
		try {
			consulta= cone.createStatement();
			resultado = consulta.executeQuery(sql);
			
			while(resultado.next()){
				
				System.out.println(resultado.getString("telefone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;}

	public Contato BuscarContato(int valor){
		return null;}
	
	public Connection GerarConexao(){
		Connection conexao = null;

		try {
			// Registrando a classe JDBC no sistema em tempo de execução
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/agenda";
			String usuario = "root";
			String senha = "@Ubuntubruno15";
			conexao =  DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out
					.println("Classe não encontrada. Erro: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL. Erro: "
					+ e.getMessage());
		}
		return conexao;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoCrud crud = new ContatoCrud();
		/*Contato contato = new Contato();
		ContatoCrud crud = new ContatoCrud();
		
		contato.setNome("Jorgao");
		contato.setTelefone("4565");
		contato.setEmail("teste@teste");
		contato.setDataCadastro(new Date(System.currentTimeMillis()));
		contato.setObs("OBA");
		crud.Salvar(contato);*/
		crud.Listar();
		
		
		
	}
	
}
