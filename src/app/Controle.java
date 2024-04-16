package app;

import entities.Ator;
import entities.Cameraman;
import entities.Diretor;
import entities.Filme;
import entities.Funcionario;
import entities.Participacao;
import entities.Roteirista;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;
import interfaces.Funcao;

public class Controle {

    // Método para criar um novo funcionário
    public static Funcionario criarFuncionario(String nome) throws ExcecaoPessoa{
        return new Funcionario(nome);
    }

    // Método para criar um novo filme
    public static Filme criarFilme(String nome, String ano, String genero) throws ExcecaoFilme{
        return new Filme(nome, ano, genero);
    }

    // Método para exibir a filmografia de um funcionário
    public static void filmografia(Funcionario funcionario) {
    	System.out.println("Filmografia do Funcionário: " + funcionario.getNome());
        for (Participacao participacao : funcionario.getParticipacoes()) {
        	System.out.println(participacao.getFilme().getNome() + " - " + participacao.getFuncao().getFuncao());
        }
        System.out.println();
    }

    // Método para exibir informações de um filme
    public static void informacoes(Filme filme) {
        System.out.println("Nome do filme: " + filme.getNome());
        System.out.println("Ano: " + filme.getAno());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Elenco:");

        // Itera sobre o elenco do filme
        for (Funcionario funcionario : filme.getElenco()) {
            System.out.print( funcionario.getNome() + " - ");
            // Itera sobre as participações do funcionário no filme
            for (Participacao participacao : funcionario.getParticipacoes()) {
                // Verifica se a participação é no filme atual
                if (participacao.getFilme().equals(filme)) {
                    System.out.print(participacao.getFuncao().getFuncao() + " ");
                }
            }
            System.out.println();    
        }
        System.out.println();
    }

    // Método para criar um objeto Funcao representando um ator
    public static Funcao ator(){
        return new Ator();
    }

    // Método para criar um objeto Funcao representando um diretor
    public static Funcao diretor(){
        return new Diretor();
    }

    // Método para criar um objeto Funcao representando um cameraman
    public static Funcao cameraman(){
        return new Cameraman();
    }

    // Método para criar um objeto Funcao representando um roteirista
    public static Funcao roteirista(){
        return new Roteirista();
    }
}
