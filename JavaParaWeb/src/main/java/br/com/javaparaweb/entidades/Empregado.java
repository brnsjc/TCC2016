package br.com.javaparaweb.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "empregado")

public class Empregado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -507592803127211582L;
	

	
	@Id
	@GeneratedValue
	@Column(name = "cod_empregado")
	private int codEmpregado;
	
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "cod_chefe")
	private Empregado chefe;

	public int getCodEmpregado() {
		return codEmpregado;
	}

	public void setCodEmpregado(int codEmpregado) {
		this.codEmpregado = codEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codEmpregado;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		if (codEmpregado != other.codEmpregado)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
}
