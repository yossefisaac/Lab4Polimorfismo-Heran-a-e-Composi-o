package test;

import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;
import entities.*;
import interfaces.Funcao;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FuncionarioTest {
    private Funcionario funcionario;
    private Funcao ator;
    private Funcao diretor;
    private Filme filme;

    @Before
    public void setUp() throws ExcecaoFilme, ExcecaoPessoa {
        funcionario = new Funcionario("funcionario1");
        ator = new Ator();
        diretor = new Diretor();
        filme = new Filme("Filme de Teste","1234", "Abcd");
    }

    @Test
    public void testAdicionarParticipacao() throws ExcecaoPessoa {
        funcionario.adicionarParticipacao(ator, filme);
        List<Participacao> participacoes = funcionario.getParticipacoes();
        assertEquals(1, participacoes.size());
        assertEquals(filme, participacoes.get(0).getFilme());
        assertEquals(ator.getClass(), participacoes.get(0).getFuncao().getClass());
    }


    @Test
    public void testAdicionarParticipacaoDuplicada() {
        funcionario.adicionarParticipacao(ator, filme);
        funcionario.adicionarParticipacao(ator, filme);
        List<Participacao> participacoes = funcionario.getParticipacoes();
        assertEquals(1, participacoes.size()); 
    }

    //Teste para duas participações no mesmo filme
    @Test
    public void testAdicionarParticipacaoFuncaoDiferente() {
        funcionario.adicionarParticipacao(ator, filme);
        funcionario.adicionarParticipacao(diretor, filme);
        List<Participacao> participacoes = funcionario.getParticipacoes();
        assertEquals(2, participacoes.size());
    }
}