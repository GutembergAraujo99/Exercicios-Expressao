package exercicioExpressao;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa1 {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cidade;


    public Pessoa1(String nome, String sobrenome, LocalDate dataNascimento2, String cidade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento2;
        this.cidade = cidade;

    }

    public Pessoa1(String nome2, String sobrenome2, Integer dataNascimento2, String cidade2) {
		// TODO Auto-generated constructor stub
	}

	public void Pessoa(String nome2, String sobrenome2, LocalDate of, String cidade2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdade() {

        Integer idade = 0;
        LocalDate dataAtual = LocalDate.now();
        idade = Period.between(this.dataNascimento, dataAtual).getYears();
        return idade;
    }


    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nData de nascimento: " + dataNascimento
                + "\n" + getIdade() + " Anos"
                + "\nCidade do infeliz: " + cidade + "\n";


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}