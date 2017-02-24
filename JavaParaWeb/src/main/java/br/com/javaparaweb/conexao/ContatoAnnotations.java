package br.com.javaparaweb.conexao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ContatoAnnotations {
	
	private Session sessao;
	
	public ContatoAnnotations(Session sessao){
		this.sessao = sessao;
	}
	
	
	public void salvar(Contato contato){
		sessao.save(contato);
	}
	
	public void atualizar(Contato contato){
	
		sessao.update(contato);
	}
	
	public void excluir(Contato contato){
		
		sessao.delete(contato);
	}
	
	public List<Contato> listar(){
		
		Query consulta = sessao.createQuery("from Contato");
		return consulta.list();
	}
	
	public Contato buscaContato(int valor){
		Query consulta = sessao.createQuery("from Contato where codigo = ?");
		consulta.setInteger("nome", valor);
		return (Contato) consulta.uniqueResult();
	}
	
	public static void main(String[] args) throws UnknownHostException{
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = sessao.beginTransaction();
		
		ContatoAnnotations contatoAnn = new ContatoAnnotations(sessao);
		
		Contato contato = new Contato();
					
		contato.setNome("Al");
		contato.setTelefone("988767690");
		contato.setEmail("@sdsd@sds");
		contato.setDataCadastro(new Date(System.currentTimeMillis()));
		contato.setObs(System.getProperty("user.name").toString());
		
		//InetAddress addr = InetAddress.getLocalHost();            
        //System.out.println(addr.getHostName());	
		
		contatoAnn.salvar(contato);
		transacao.commit();
		//System.out.println("QTD: "+contatoAnn.listar().size());
		System.out.println("Conectado pelo Crud e Contato Inserido");
	}

	
}
