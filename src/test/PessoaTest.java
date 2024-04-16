
package test;

import exceptions.ExcecaoPessoa;
import entities.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PessoaTest {

    @Test
    public void testConstrutorComNomeValido() throws ExcecaoPessoa {
        String nome = "João";
        Pessoa pessoa = new Pessoa(nome);
        assertEquals(nome, pessoa.getNome());
    }

    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(ExcecaoPessoa.class, () -> new Pessoa(null));
    }

    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(ExcecaoPessoa.class, () -> new Pessoa(""));
    }
}
