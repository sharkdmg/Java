package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "T_CARGO") // anotação não obrigatória
@SequenceGenerator(name = "cargo", sequenceName = "SQ_T_CARGO", allocationSize = 1)
public class Cargo {

	@Id
	@Column(name = "cd_cargo")
	@GeneratedValue(generator = "cargo", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "vl_salario", nullable = false)
	private float salario;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_nivel")
	private Nivel nivel;

	@Column(name = "ds_cargo", length = 300)
	private String descricao;

	@CreationTimestamp //cria a data de cadastro automaticamente
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_cadastro", updatable = false ,  nullable = false)
	private Calendar dataCadastro;
	
	@Transient //não será criado esgte campo na tabela
	private int mesesCadastro;
	
	@Lob //gravsa um arquivo no banco de dados
	private byte[] foto;

	public Cargo() {
		super();
	}

	//construtor para atualizacao
	public Cargo(int codigo, float salario, Nivel nivel, String descricao, byte[] foto) {
		super();
		this.codigo = codigo;
		this.salario = salario;
		this.nivel = nivel;
		this.descricao = descricao;
		this.foto = foto;
	}
	
	
	//consgtrugtor para cadastro
	public Cargo(float salario, Nivel nivel, String descricao, byte[] foto) {
		super();
		this.salario = salario;
		this.nivel = nivel;
		this.descricao = descricao;
		this.foto = foto;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public int getMesesCadastro() {
		return mesesCadastro;
	}

	public void setMesesCadastro(int mesesCadastro) {
		this.mesesCadastro = mesesCadastro;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	

}
