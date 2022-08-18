package exercicioExpressao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa1> pessoas = Arrays.asList(

                new Pessoa1("José", "Gutemberg", LocalDate.of(2003, 03, 10), "Osasco"),
                new Pessoa1("Lucas", "Marques", LocalDate.of(1980, 07, 16), "Barueri"),
                new Pessoa1("Leomar", "veloso", LocalDate.of(2002, 01, 10), "Lapa"),
                new Pessoa1("Adriele", "Pimentel", LocalDate.of(2008, 04, 04), "Santos")
        );

        pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).forEach(pessoa -> System.out.println(pessoa.toString()));


    }
}