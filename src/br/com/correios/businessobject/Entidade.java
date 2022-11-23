package br.com.correios.businessobject;

import br.com.correios.produto.Produto;

public abstract class Entidade {

    private int id;
    private Produto produto;

    public Entidade(int id, Produto produto) {
        this.id = id;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "id=" + id +
                ", produto=" + produto +
                '}';
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
