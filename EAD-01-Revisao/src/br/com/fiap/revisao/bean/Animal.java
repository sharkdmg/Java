package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class Animal {

	//Modificadores de acesso
	//protected -> a classe, os filhos, classes do mesmo pacote
	//default/package -> a classe e classes do mesmo pacote
	
	//static -> pertence a classe
	
	private String especie;
	
	private float peso;
	
	private Genero genero;
	
	private Calendar dataNascimento;
	
	//Construtor: mesmo nome da classe, não tem retorno
	//O construtor do filho precisa chamar um construtor do pai
	public Animal(){
		super();
	}
	
	//Construtor com parâmetro
	public Animal(String especie) {
		super();
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
