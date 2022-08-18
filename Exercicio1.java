package exercicioExpressao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1 {

	public static void main( String[] args ) {
		List< Integer > numeros = Arrays.asList( 2, 5, 1, 7, 9, 4 );
		List< Integer > ListaRetornada = RetornaLista( numeros );
		ListaRetornada.stream().forEach( numero -> System.out.println( numero ) );
	}
		
	public static List<Integer > RetornaLista(List< Integer > numeros ) {
		return numeros.stream()
		.sorted()
		.collect( Collectors.toList());

	}

}
