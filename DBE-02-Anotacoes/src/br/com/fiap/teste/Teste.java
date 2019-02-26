package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Veiculo;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um veiculo
		Veiculo v = new Veiculo();
		
		//API Reflection - recupera o nome da classe
		String nome = v.getClass().getName();
		System.out.println(nome);
		
		//Recuperar os métodos da classe
		Method[] m = v.getClass().getDeclaredMethods();
		System.out.println("Métodos:");
		//Percorre todos os métodos e exibe o nome
		for (Method item : m) {
			System.out.println(item.getName());
		}
		
		//Recuperar os atributos
		Field[] atributos = v.getClass().getDeclaredFields();
		System.out.println("Atributos");
		//Percorrer os atributos e exibir o nome
		for (Field item : atributos) {
			System.out.println(item.getName());
			//Recuperar a anotação @Coluna
			Coluna a = 
					item.getAnnotation(Coluna.class);
			System.out.println("Nome: " + a.nome());
			System.out.println("Tamanho: " + a.tamanho());
			System.out.println("Tipo: " + a.tipo());
		}
		
	}
	
}




