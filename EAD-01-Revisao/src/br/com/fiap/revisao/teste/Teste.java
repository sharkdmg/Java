package br.com.fiap.revisao.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.revisao.bean.Cavalo;
import br.com.fiap.revisao.bean.Genero;

public class Teste {

	public static void main(String args[]) {
		//Instanciar um cavalo
		Cavalo cavalo = new Cavalo("Pé de pano");
		//Atribuir um valor para o genero
		cavalo.setGenero(Genero.MACHO);
		
		//Validar o genero
		if (cavalo.getGenero() == Genero.MACHO) {
			System.out.println(cavalo.getGenero());
		}
		
		System.out.println(cavalo.getPeso()); //valor padrão = 0
		
		//Atribuir um valor para a data
		Calendar data = Calendar.getInstance();//DATA ATUAL
		//Criar um objeto com data específica (ano, mes, dia)
		Calendar data2 = new GregorianCalendar(2017, Calendar.FEBRUARY, 4);
		cavalo.setDataNascimento(data2);
		
		//Formatar a data (objeto para formatar a data)
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		
		//Exibir a data
		System.out.println( //getTime() recupera o Date do Calendar
				dt.format(cavalo.getDataNascimento().getTime()));
		
		
	}	
	
}






