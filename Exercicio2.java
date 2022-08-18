package exercicioExpressao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {

	public static void main(String[] args) {
		char letra = 'R';
		List<String> nomes = Arrays.asList( null, "Renan", "Betina", "Jonathan", "Roberto", "Ariel" ); 
		
	    List< String > novosNomes = nomes.stream()
	    		.filter( nome -> nome != null && nome != "")
	    		.filter( nome -> nome.charAt(0) == letra )
				.collect( Collectors.toList());
		novosNomes.stream().forEach( System.out::println);
	}
}
