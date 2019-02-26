package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1 - Atributo est�tivo que armazena a �nica inst�ncia
	private static Properties prop;
	
	//2 - M�todo que retorna a �nica inst�ncia
	public static Properties getInstance() {
		if (prop ==null) {
			prop = new Properties();
			//carregar o objeto com as informa��es do arquivo
			try {
				prop.load(ConfiguracaoSingleton.class.getResourceAsStream("/log4j.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}
	
	//3 - Construtor privado (ningu�m instancia a classe) 
	private ConfiguracaoSingleton() {
		
	}
}