package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1 - Atributo estátivo que armazena a única instância
	private static Properties prop;
	
	//2 - Método que retorna a única instância
	public static Properties getInstance() {
		if (prop ==null) {
			prop = new Properties();
			//carregar o objeto com as informações do arquivo
			try {
				prop.load(ConfiguracaoSingleton.class.getResourceAsStream("/log4j.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}
	
	//3 - Construtor privado (ninguém instancia a classe) 
	private ConfiguracaoSingleton() {
		
	}
}