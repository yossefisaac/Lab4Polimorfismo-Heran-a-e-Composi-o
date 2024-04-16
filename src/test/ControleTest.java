package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import app.Controle;
import entities.Filme;
import entities.Funcionario;
import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;

public class ControleTest {
   
     @Test
    public void testCriarFuncionario() throws ExcecaoPessoa {
            Funcionario funcionario = Controle.criarFuncionario("João");
            assertNotNull(funcionario);
            assertEquals("João", funcionario.getNome());
    }

    @Test
    public void testCriarFilme() throws ExcecaoFilme {
            Filme filme = Controle.criarFilme("Filme de Teste","1234", "Abcd");
            assertNotNull(filme);
            assertEquals("Filme de Teste", filme.getNome());
    }

    @Test(expected = ExcecaoPessoa.class)
    public void testCriarFuncionarioComNomeInvalido() throws ExcecaoPessoa {
        Controle.criarFuncionario(null);
    }

    @Test(expected = ExcecaoFilme.class)
    public void testCriarFilmeComNomeInvalido() throws ExcecaoFilme {
        Controle.criarFilme(null, null, null);
    }
}