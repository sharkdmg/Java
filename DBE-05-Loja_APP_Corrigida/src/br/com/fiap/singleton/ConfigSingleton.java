package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfigSingleton {
	
	private static Properties p;
	
	public static Properties getInstance() {
		if (p == null) {
			p = new Properties();
			
			try {
				p.load(ConfigSingleton.class.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return p;
	}
}
