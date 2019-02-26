package br.com.fiap.bo;

import org.apache.log4j.Logger;

import br.com.fiap.teste.TerminalConsulta;
import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	
	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	
	public ProdutoTO consultarProduto(int codigo) throws Exception {		
		ProdutoTO produto = null;
		
		log.debug("Iniciando consulta: " + codigo);
		
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401, 20, 30, "Camiseta Branca");
			break;
		case 402:
			produto = new ProdutoTO(401, 20, 30, "Camiseta Azul");
			break;
		case 403:
			produto = new ProdutoTO(401, 20, 30, "Camiseta Rosa");
			break;
		default:
			log.error("Produto não encontrado");
			throw new Exception("Produto não encontrado");
		}
		
		return produto;
	}
}	
