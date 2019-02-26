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
@Table(name="T_FUNCIONARIO")
@SequenceGenerator(name="primary", sequenceName="SQ_T_FUNCIONARIO", allocationSize=1)
public class Funcionario {
	
	@Id
	@Column(name="cd_funcionario")
	@GeneratedValue(generator="primary", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="cd_funcionario", nullable=false)
	private int nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_funcionario")
	private Calendar dataCadastro;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cd_funcionario", nullable=false)
	private Calendar dataNascimento;
	
	@Column(name="vl_salario")
	private Double valorSalario;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero")
	private Genero genero;
	
	@Column(name="st_dependente")
	private boolean dependente;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Transient
	private String token;

	public Funcionario() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public boolean isDependente() {
		return dependente;
	}

	public void setDependente(boolean dependente) {
		this.dependente = dependente;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}
