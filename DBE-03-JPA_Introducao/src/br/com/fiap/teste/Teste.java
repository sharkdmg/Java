package br.com.fiap.teste;

import org.apache.log4j.Logger;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[] args) {
		
		log.trace("Inicio da Aplicação");
		
		String conexao = ConfigSingleton.getInstance().getProperty("conexao");

	}

}
