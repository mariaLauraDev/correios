package br.com.correios.produto;

import br.com.correios.enderecamento.Destinatario;
import br.com.correios.enderecamento.Remetente;

public abstract class Produto {
    private int id;
    private Destinatario destinatario;
    private Remetente remetente;
    private Double peso; // em gramas
    private Embalagem embalagem;

    public Produto(int id,
                   Destinatario destinatario,
                   Remetente remetente,
                   Double peso,
                   Embalagem embalagem) {
        this.id = id;
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.peso = peso;
        this.embalagem = embalagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Remetente getRemetente() {
        return remetente;
    }

    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Embalagem getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(Embalagem embalagem) {
        this.embalagem = embalagem;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", destinatario=" + destinatario +
                ", remetente=" + remetente +
                ", peso=" + peso +
                ", embalagem=" + embalagem +
                '}';
    }
}
