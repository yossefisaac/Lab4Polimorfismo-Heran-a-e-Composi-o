package entities;

import interfaces.Funcao;

public class Participacao {
    private Filme filme;
    private Funcao funcao;
    
    // Construtor da classe Participacao
    public Participacao(Filme filme, Funcao funcao){
        this.filme = filme;
        this.funcao = funcao;
    }
    
    // Método getter para obter o filme participação
    public Filme getFilme() {
        return filme;
    }
    
    // Método setter para definir o filme participação
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    // Método getter para obter a função participação
    public Funcao getFuncao() {
        return funcao;
    }
    
    // Método setter para definir a função participação
    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
