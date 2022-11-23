package br.com.correios.enderecamento;

public class Remetente extends Enderecamento{

    public Remetente(String nome,
                     String telefone,
                     String rua,
                     String bairro,
                     String cidade,
                     String unidadeFederativa,
                     String CEP) {
        super(nome, telefone, rua, bairro, cidade, unidadeFederativa, CEP);
    }


}
