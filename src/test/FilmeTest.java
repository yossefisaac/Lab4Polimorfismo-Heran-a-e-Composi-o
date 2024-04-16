package test;

import exceptions.ExcecaoFilme;
import exceptions.ExcecaoPessoa;

import entities.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class FilmeTest {
    private Filme filme;
    private Funcionario ator1;

    @Before
    public void setUp() throws ExcecaoFilme, ExcecaoPessoa {
        filme = new Filme("Filme de Teste","1234", "Abcd");
        ator1 = new Funcionario("Ator1");
    }

    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(ExcecaoFilme.class, () -> new Filme(null, null, null));
    }

    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(ExcecaoFilme.class, () -> new Filme("",null,null));
    }
    
    @Test
    public void testAdicionarFuncionario() throws ExcecaoFilme {
        filme.adicionarFuncionario(ator1, new Ator());
        List<Funcionario> elenco = filme.getElenco();
        assertTrue(elenco.contains(ator1));
    }

    @Test
    public void testGetElenco() throws ExcecaoFilme {
        filme.adicionarFuncionario(ator1, new Ator());
        List<Funcionario> elenco = filme.getElenco();
        assertNotNull(elenco);
        assertEquals(1, elenco.size());
        assertTrue(elenco.contains(ator1));
    }

}