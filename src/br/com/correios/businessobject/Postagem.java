package br.com.correios.businessobject;

import br.com.correios.produto.Produto;

public class Postagem extends Entidade{
    private boolean postado;

    public Postagem(int id, Produto produto, boolean postado) {
        super(id, produto);
        this.postado = postado;
    }

    public boolean isPostado() {
        return postado;
    }

    public void setPostado(boolean postado) {
        this.postado = postado;
    }

    @Override
    public String toString() {
        return super.toString()+"Postagem{" +
                "postado=" + postado +
                '}';
    }
}
