package br.com.javaparaweb;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UserBean {
	
	private String nome;
	private String email;
	private String senha;
	private String confirmaSenha;
	
	
	//Metodos Gerais
	public String novo(){
		
		return "user";
	}
	
	public String salvar(){
		
		
		if(!this.senha.equalsIgnoreCase(this.confirmaSenha)){
			
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha Incorreta",""));
			return "user";
		}
		return "mostrarusuario";
	}
	
		
	//Gettes and Settes
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	

}
