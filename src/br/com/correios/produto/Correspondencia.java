package br.com.correios.produto;

import br.com.correios.enderecamento.Destinatario;
import br.com.correios.enderecamento.Remetente;

public class Correspondencia extends Produto{

    private boolean cecograma; // Serviço especial para correspondências em relevo pelo sistema Braille

    public Correspondencia(int id, Destinatario destinatario,
                           Remetente remetente,
                           Double peso, Embalagem embalagem, boolean cecograma) {
        super(id, destinatario, remetente, peso, embalagem);
        this.cecograma = cecograma;
    }

    public boolean isCecograma() {
        return cecograma;
    }

    public void setCecograma(boolean cecograma) {
        this.cecograma = cecograma;
    }

    @Override
    public String toString() {
        return "Correspondencia{" +
                "cecograma=" + cecograma +
                '}';
    }
}
