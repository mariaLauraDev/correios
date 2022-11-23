package br.com.correios.produto;

import br.com.correios.enderecamento.Destinatario;
import br.com.correios.enderecamento.Remetente;

import java.math.BigDecimal;

public class Encomendas extends Produto {
    private Double maiorDimensao; // Valor da dimensão em metros

    public Encomendas(int id,
                      Destinatario destinatario,
                      Remetente remetente, Double peso,
                      Embalagem embalagem, Double maiorDimensao) {
        super(id, destinatario, remetente, peso, embalagem);
        this.maiorDimensao = maiorDimensao;
    }

    public Double getMaiorDimensao() {
        return maiorDimensao;
    }

    public void setMaiorDimensao(Double maiorDimensao) {
        this.maiorDimensao = maiorDimensao;
    }

    public BigDecimal taxaDimensao(Double maiorDimensao){
        BigDecimal taxa = new BigDecimal(0.0);
        if (maiorDimensao>0.7) {
            taxa = BigDecimal.valueOf(79.0);
        }
        return taxa;
    }

    @Override
    public String toString() {
        return super.toString() +"Encomendas{" +
                "maiorDimensao=" + maiorDimensao +
                '}';
    }
}
