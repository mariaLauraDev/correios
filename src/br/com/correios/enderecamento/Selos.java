package br.com.correios.enderecamento;

import java.math.BigDecimal;

public enum Selos {
    COMEMORATIVO,
    ESPECIAL,
    REGULAR,
    PROMOCIONAL,
    PERSONALIZADO;

    public static BigDecimal taxaSelo (Selos selo){
        BigDecimal taxa = new BigDecimal(0.0);
        switch (selo){
            case COMEMORATIVO:
                taxa =BigDecimal.valueOf(9.0);
                break;
            case ESPECIAL:
                taxa = BigDecimal.valueOf(8.0);
                break;
            case REGULAR:
                taxa = BigDecimal.valueOf(7.0);
                break;
            case PROMOCIONAL:
                taxa = BigDecimal.valueOf(6.55);
                break;
            case PERSONALIZADO:
                taxa = BigDecimal.valueOf(9.25);
                break;
        }
        return taxa;
    }
}
