package br.com.correios.businessobject;

import br.com.correios.interfaces.Entregas;

public class Sedex12 implements Entregas {
    @Override
    public void taxa(Entrega entrega) {
        entrega.setTaxaEntrega(20.0);
        System.out.println("A taxa para SedexHoje vale R$20,00");
    }
}
