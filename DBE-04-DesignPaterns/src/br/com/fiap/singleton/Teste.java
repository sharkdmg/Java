package br.com.fiap.singleton;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(ConfiguracaoSingleton.getInstance().getProperty("conexao"));
		
		log.trace("Inicio da Aplicação");
		
		String conexao = ConfiguracaoSingleton.getInstance().getProperty("conexao");
		
		log.debug("Foda-se");
		
	}
}
