package br.com.fiap.bean;

import java.util.Date;

public class Carro extends Veiculo {

	@Override
	//m�todo obsoleto
	@Deprecated
	//tira o amarelinho
	@SuppressWarnings("all")
	public void andar() {
		new Date("");
	}
	
}