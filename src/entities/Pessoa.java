package entities;

import exceptions.ExcecaoPessoa;

public class Pessoa {
    private String nome;

    // Construtor da classe Pessoa
    public Pessoa(String nome) throws ExcecaoPessoa {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoPessoa("Nome inválido para pessoa.");
        }
        this.nome = nome;
    }

    // Método getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }
}
