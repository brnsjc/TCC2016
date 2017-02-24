package br.com.javaparaweb.entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5372689496903113023L;

	@Id
	@GeneratedValue
	@Column(name="cod_pedido")
	private int cod_pedido;
	
	@Column(name="data_pedido", updatable=false)
	private Date data_pedido;
	
	@Column(name="hora_pedido", updatable=false)
	private Time hora_pedido;
	
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="cod_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="cod_empregado")
	
	private Empregado empregado;
	
	//@ManyToMany
	@JoinTable(name = "item",joinColumns = @JoinColumn (name = "cod_pedido",
	referencedColumnName="cod_pedido"),inverseJoinColumns = {@JoinColumn(name ="cod_produto")})
	private Produto produto = new Produto();

	public int getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date date) {
		this.data_pedido = date;
	}

	public Time getHora_pedido() {
		return hora_pedido;
	}

	public void setHora_pedido(Time hora_pedido) {
		this.hora_pedido = hora_pedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + cod_pedido;
		result = prime * result + ((data_pedido == null) ? 0 : data_pedido.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((empregado == null) ? 0 : empregado.hashCode());
		result = prime * result + ((hora_pedido == null) ? 0 : hora_pedido.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (cod_pedido != other.cod_pedido)
			return false;
		if (data_pedido == null) {
			if (other.data_pedido != null)
				return false;
		} else if (!data_pedido.equals(other.data_pedido))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (empregado == null) {
			if (other.empregado != null)
				return false;
		} else if (!empregado.equals(other.empregado))
			return false;
		if (hora_pedido == null) {
			if (other.hora_pedido != null)
				return false;
		} else if (!hora_pedido.equals(other.hora_pedido))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
}
