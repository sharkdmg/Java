package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.ConfigSingleton;
import br.com.fiap.to.ProdutoTO;

public class TerminalConsulta {

	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		
		log.trace("Inicio Aplicação");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConfigSingleton.getInstance().getProperty("loja"));
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy' 'HH:mm:ss");
		System.out.println(dt.format(Calendar.getInstance().getTime()));
		
		EstoqueBO bo = new EstoqueBO();
		
		int codigo;
		do {
			System.out.println("Digite o código: ");
			codigo = sc.nextInt();
			if (codigo != 0){
				try {
					ProdutoTO to = bo.consultarProduto(codigo);
					System.out.println(to.getDescricao());
					System.out.println("Preço: " + to.getPreco());
					System.out.println("Qtd: " + to.getQuantidade());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} 
			}
		}while (codigo != 0);
		
		log.trace("Fim Aplicação");
		sc.close();
	}

}
