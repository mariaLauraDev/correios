package br.com.correios.produto;

import java.math.BigDecimal;

public enum Embalagem {
    CAIXA,
    CILINDRO,
    ENVELOPE;

    public static BigDecimal preco (Embalagem embalagem){
        BigDecimal preco = new BigDecimal(0.0);
        switch (embalagem){
            case CAIXA:
                preco =BigDecimal.valueOf(7.60);
                break;
            case CILINDRO:
                preco =BigDecimal.valueOf(10.00);
                break;
            case ENVELOPE:
                preco = BigDecimal.valueOf(5.00);
                break;
        }
        return preco;
    }
}
