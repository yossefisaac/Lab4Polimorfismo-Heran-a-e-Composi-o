package entities;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExcecaoPessoa;
import interfaces.Funcao;

public class Funcionario extends Pessoa {
    private List<Participacao> participacoes;

    // Construtor da classe Funcionario
    public Funcionario(String nome) throws ExcecaoPessoa {
        super(nome); // Chama o construtor da superclasse Pessoa
        this.participacoes = new ArrayList<>();
    }
    
    // Método para adicionar uma participação do funcionário em um filme
    public void adicionarParticipacao(Funcao funcao, Filme filme) {
        if (filme == null) return; // Verifica se o filme é nulo

        // Verifica se o funcionário já possui a função no filme
        for (Participacao participacao : participacoes) {
            if (participacao.getFilme().equals(filme)) {
                if (participacao.getFuncao().getClass().equals(funcao.getClass())) {
                    System.out.println("O funcionário já possui esta função neste filme.");
                    return;
                }
            }
        }

        // Cria uma nova participação e a adiciona à lista de participações do funcionário
        Participacao novaParticipacao = new Participacao(filme, funcao);
        participacoes.add(novaParticipacao);
    }
    
    // Método getter para obter a lista de participações do funcionário
    public List<Participacao> getParticipacoes() {
        return participacoes;
    }
}
