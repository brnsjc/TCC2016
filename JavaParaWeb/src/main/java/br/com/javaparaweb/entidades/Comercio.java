package br.com.javaparaweb.entidades;

import java.sql.Time;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.javaparaweb.conexao.HibernateUtil;

public class Comercio {
	
	private Session sessao = null;
	
	public Comercio(Session sessao){
		this.sessao = sessao;
	}

	public void CriarPedidos(){
		
		Pedido pedido = new Pedido();
		Produto prd = criarProdutoFilmeHobbit();
		Empregado emp = criarEmpregadoLuck();
		Cliente cli = criarCliente();
		
		pedido.setCliente(cli);
		pedido.setProduto(prd);
		pedido.setEmpregado(emp);
		pedido.setDescricao("Comunistinha de Facebook");
		pedido.setData_pedido(new Date(System.currentTimeMillis()));
		pedido.setHora_pedido(new Time(System.currentTimeMillis()));
		sessao.save(pedido);
		
	}
	private Produto criarProdutoFilmeHobbit(){
		
		Categoria categoriaFilmes = new Categoria("Filmes","Categoria de Filmes");
		Transaction transacao = sessao.beginTransaction();
		
		sessao.save(categoriaFilmes);
		Produto produto = new Produto();
		produto.setDescricao("O Hobbit");
		produto.setPreco(29.99f);
		produto.setCategoria(categoriaFilmes);
		sessao.save(produto);
		transacao.commit();
		sessao.close();
		
		return produto;
		
	}
	
	private Empregado criarEmpregadoLuck(){
		
		Empregado empregado = new Empregado();
		empregado.setNome("Stupid User");
		
		return empregado;
	}
	
	private Cliente criarCliente(){
		
		Cliente cliente = new Cliente();
		cliente.setNome("Karl Marx");
		
		
		return cliente;
	}
	
	public static void main(String[] args){
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		//Transaction transacao = sessao.beginTransaction();
		Comercio comercio = new Comercio(sessao);
		comercio.CriarPedidos();
		//transacao.commit();
		
		System.out.println("Cadastrou Pedido");
	}
	
}