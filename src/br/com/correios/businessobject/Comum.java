package br.com.correios.businessobject;

import br.com.correios.interfaces.Entregas;

public class Comum implements Entregas {

    @Override
    public void taxa(Entrega entrega) {
        entrega.setTaxaEntrega(5.0);
        System.out.println("A taxa para SedexHoje vale R$5,00");
    }
}
