package br.com.correios.businessobject;

import br.com.correios.produto.Produto;

public class Enviar extends Entidade{
    private boolean enviado;

    public Enviar(int id, Produto produto, boolean enviado) {
        super(id, produto);
        this.enviado = enviado;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return super.toString()+"Enviar{" +
                "enviado=" + enviado +
                '}';
    }
}
