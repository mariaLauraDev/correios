package br.com.correios.businessobject;

import br.com.correios.interfaces.Entregas;

public class SedexHoje implements Entregas {
    @Override
    public void taxa(Entrega entrega) {
        entrega.setTaxaEntrega(25.0);
        System.out.println("A taxa para SedexHoje vale R$25,00");
    }
}
