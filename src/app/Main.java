package app;

import entities.*;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;
import interfaces.Funcao;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando objetos que representam diferentes funções
            Funcao ator = Controle.ator();
            Funcao diretor = Controle.diretor();
            Funcao cameraman = Controle.cameraman();
            Funcao roteirista = Controle.roteirista();

            // Criando objetos Funcionario
            Funcionario pessoa1 = Controle.criarFuncionario("Neto");
            Funcionario pessoa2 = Controle.criarFuncionario("Medson");
            Funcionario pessoa3 = Controle.criarFuncionario("Yossef");

            // Criando objetos Filme e adicionando funcionários com diferentes funções
            Filme filme1 = Controle.criarFilme("Vingadores", "2012", "Ficção Cientifica");
            filme1.adicionarFuncionario(pessoa1, ator);
            filme1.adicionarFuncionario(pessoa2, roteirista);
            filme1.adicionarFuncionario(pessoa2, ator);
            filme1.adicionarFuncionario(pessoa3, ator);
            Filme filme2 = Controle.criarFilme("Gente Grande", "2010", "Humor Comédia");
            filme2.adicionarFuncionario(pessoa3, diretor);
            filme2.adicionarFuncionario(pessoa1, cameraman);

            // Exibindo informações sobre os filmes
            Controle.informacoes(filme1);
            Controle.informacoes(filme2);

            // Exibindo a filmografia dos funcionários
            Controle.filmografia(pessoa1);
            Controle.filmografia(pessoa2);
            Controle.filmografia(pessoa3);

        } catch (ExcecaoPessoa | ExcecaoFilme e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
