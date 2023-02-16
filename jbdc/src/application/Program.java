package application;

import java.sql.Connection;

public class Program {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
		DB.closeConnection();
		// vamos fazer uma demonstração para recuperar dados
		// ResultSet
		// first() [move para a primeria posicão1 , se houver ]
		// beforeFirst() [move para posição 0]
		// next() [move para o próximo, retorna false se ja estiver no ultimo]
		// absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]
	}

}
