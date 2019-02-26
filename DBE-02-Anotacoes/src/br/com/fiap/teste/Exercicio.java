package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Veiculo;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar o veiculo
		Veiculo v = new Veiculo();
		//Recuperar a anotação da classe
		Tabela anotacao = 
			v.getClass().getAnnotation(Tabela.class);
		//Exibir o SQL
		System.out.println("SELECT * FROM " +
			anotacao.nome());
	}
	
}






