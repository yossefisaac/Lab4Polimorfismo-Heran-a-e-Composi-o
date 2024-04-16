package entities;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExcecaoFilme;
import interfaces.Funcao;

public class Filme {
    private String nome;
    private String ano;
    private String genero;

    private List<Funcionario> elenco;

    // Construtor da classe Filme
    public Filme(String nome, String ano, String genero) throws ExcecaoFilme {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoFilme("Nome inválido para o filme.");
        }
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.elenco = new ArrayList<>();
    }

    // Método para adicionar um funcionário ao elenco do filme
    public void adicionarFuncionario(Funcionario funcionario, Funcao funcao) throws ExcecaoFilme {
        if (funcionario == null) {
            throw new ExcecaoFilme("Funcionário não pode ser nulo.");
        }
        funcionario.adicionarParticipacao(funcao, this); // Adiciona a participação do funcionário no filme
        if (!elenco.contains(funcionario)) {
            elenco.add(funcionario); // Adiciona o funcionário ao elenco do filme se ainda não estiver presente
        }
    }

    // Métodos getters para obter informações sobre o filme
    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    // Método para obter o elenco do filme
    public List<Funcionario> getElenco() {
        return elenco;
    }
}
