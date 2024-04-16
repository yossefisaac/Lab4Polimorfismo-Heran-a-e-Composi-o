package entities;

import interfaces.Funcao;

public class Ator implements Funcao {
    // Método sobrescrito da interface Funcao
    //É melhor utilizar @Override para sobrescrever métodos,
    //em vez de herança direta, pois isso traz mais clareza, segurança e facilidade de manutenção ao código.
    @Override
    public String getFuncao() {
        return "Ator"; // Retorna a função do ator
    }
}
