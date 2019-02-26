package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_VEICULO")
public class Veiculo {

	@Coluna(nome = "vl_preco", tipo = "NUMBER")
	private double preco;

	@Coluna(nome="ds_fabricante", tipo="VARCHAR" )
	private String fabricante;

	@Coluna(nome="ds_cor",tipo="VARCHAR", tamanho=50)
	private String cor;

	public void andar() {}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}