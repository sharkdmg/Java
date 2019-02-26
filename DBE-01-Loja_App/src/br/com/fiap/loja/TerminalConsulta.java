//que lindo!

package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TerminalConsulta {
	public static void main(String[] args) {
		
		List<Produto> lsProdutos = new ArrayList<Produto>();
		
		lsProdutos.add(new Produto(401, "Camiseta branca"));
		lsProdutos.add(new Produto(402, "Camiseta azul"));
		lsProdutos.add(new Produto(403, "Camiseta rosa"));
		
		System.out.println("Lojinha de Merda");
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy' 'HH:mm:ss");
		System.out.println(dt.format(Calendar.getInstance().getTime()));
		
		do {
		
			System.out.println("Informe o c�digo do produto: ");
			Scanner sc = new Scanner(System.in);
			int codigo = sc.nextInt();
			boolean found = false;
			
			for (Produto produto : lsProdutos) {
				if (produto.getCodigo() == codigo) {
					System.out.println(produto.getDescricao());
					found = true;
				}
			}
			
			if (!found) {
				System.out.println("Produto n�o encontrado.");
			}
		
		} while (true);
	}
}
