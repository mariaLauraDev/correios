package br.com.correios.businessobject;

import br.com.correios.produto.Produto;

public class Carteiro extends Entidade{

    private String nome;

    public Carteiro(int id, Produto produto, String nome) {
        super(id, produto);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString()+"Carteiro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
