package br.com.correios.interfaces;

import br.com.correios.businessobject.Entidade;
import br.com.correios.produto.Produto;

public interface Cadastravel{

    void salvar(Entidade t);

    void alterar(Entidade t, Produto p);

    void buscar(Entidade t);

    void deletar(Entidade t);

}
