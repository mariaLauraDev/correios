package br.com.correios;

import br.com.correios.businessobject.*;
import br.com.correios.enderecamento.Destinatario;
import br.com.correios.enderecamento.Remetente;
import br.com.correios.enderecamento.Selos;
import br.com.correios.interfaces.Entregas;
import br.com.correios.produto.Embalagem;
import br.com.correios.produto.Encomendas;
import br.com.correios.produto.Produto;
import br.com.correios.repository.Repository;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Agencia{
    public static void main(String[] args) {
        Remetente remetente = new Remetente("Laura","(85) 99763-0000","Rua Vicente Macêdo","Passaré","Forquilha","CE","6000-110");
        Destinatario destinatario = new Destinatario("Kelson","(85) 98789-2205", "Eudes Mendes","Passaré","Ubajara","CE","60541-220", Selos.ESPECIAL);

        System.out.println(remetente.toString()+"\n");
        System.out.println(destinatario.toString());

        Produto presenteNatal = new Encomendas(1234,destinatario,remetente,500.0,Embalagem.CAIXA,1.0);
        System.out.println(presenteNatal.toString());

        Carteiro jose = new Carteiro(1,presenteNatal,"José");
        Entrega entrega = new Entrega(1,presenteNatal, Rastreamento.SAIU_PARA_ENTREGA,0.0);
        Enviar enviar = new Enviar(1,presenteNatal,true);
        Postagem postagem = new Postagem(1,presenteNatal,true);


        List<Entidade> listaEntidades = new ArrayList<>();
        Repository repositórioGeral = new Repository();

        repositórioGeral.salvar(jose);
        repositórioGeral.salvar(entrega);
        repositórioGeral.salvar(enviar);
        repositórioGeral.salvar(postagem);

        SedexHoje sedexHoje = new SedexHoje();
        sedexHoje.taxa(entrega);

    }
}
