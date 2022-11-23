package br.com.correios.enderecamento;

public abstract class Enderecamento {
    private String nome;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String unidadeFederativa;
    private String CEP;

    public Enderecamento(String nome,
                         String telefone,
                         String rua,
                         String bairro,
                         String cidade,
                         String unidadeFederativa,
                         String CEP) {
        this.nome = nome;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
        this.CEP = CEP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Enderecamento{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", unidadeFederativa='" + unidadeFederativa + '\'' +
                ", CEP='" + CEP + '\'' +
                '}';
    }
}
