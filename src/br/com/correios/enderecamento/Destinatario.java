package br.com.correios.enderecamento;

public class Destinatario extends Enderecamento{

    private Selos selo;

    public Destinatario(String nome,
                        String telefone,
                        String rua,
                        String bairro,
                        String cidade,
                        String unidadeFederativa,
                        String CEP, Selos selo) {
        super(nome, telefone, rua, bairro, cidade, unidadeFederativa, CEP);
        this.selo = selo;
    }


    public Selos getSelo() {
        return selo;
    }

    public void setSelo(Selos selo) {
        this.selo = selo;
    }

    @Override
    public String toString() {
        return super.toString() + "Destinatario{" +
                "selo=" + selo +
                '}';
    }
}
