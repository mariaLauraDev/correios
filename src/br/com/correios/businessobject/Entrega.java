package br.com.correios.businessobject;

import br.com.correios.interfaces.Entregas;
import br.com.correios.produto.Produto;

public class Entrega extends Entidade {
    private Rastreamento rastreamento;
    private Double taxaEntrega;

    public Entrega(int id, Produto produto, Rastreamento rastreamento, Double taxaEntrega) {
        super(id, produto);
        this.rastreamento = rastreamento;
        this.taxaEntrega = taxaEntrega;
    }

    public Rastreamento getRastreamento() {
        return rastreamento;
    }

    public void setRastreamento(Rastreamento rastreamento) {
        this.rastreamento = rastreamento;
    }

    public Double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(Double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public String toString() {
        return super.toString()+"Entrega{" +
                "rastreamento=" + rastreamento +
                ", taxaEntrega=" + taxaEntrega +
                '}';
    }
}
