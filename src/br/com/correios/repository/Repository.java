package br.com.correios.repository;

import br.com.correios.businessobject.Entidade;
import br.com.correios.interfaces.Cadastravel;
import br.com.correios.produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repository<T extends Entidade> implements Cadastravel {

    private List<T> entidadeList = new ArrayList<>();
    private int sequence=1;

    public Repository(){}

    public Repository(List<T> entidadeList, int sequence) {
        this.entidadeList = entidadeList;
        this.sequence = sequence;
    }

    private void setId(T t) {
        t.setId(sequence);
        sequence ++;
    }

    @Override
    public void salvar(Entidade t) {
        setId((T) t);
        if (Objects.nonNull(t) && Objects.nonNull(t.getProduto())) {
            entidadeList.add((T) t);
            System.out.println("Salvo!");
        } else {
            System.err.println("Entidade inálida");
        }
    }

    @Override
    public void alterar(Entidade t, Produto p) {

        if (Objects.nonNull(t) && Objects.nonNull(p)) {
            t.setProduto(p); // só tem como alterar produto das entidades, pois o id é do repositório
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.err.println("Entidade inálida");
        }
    }

    @Override
    public void buscar(Entidade t) {
        for(Entidade entidade: entidadeList ){
            if ((entidade == t) && Objects.nonNull(t)){
                System.out.printf("Entidade %t encontrada", t.toString());
            } else{
                System.out.println("Não é possível encontrar essa entidade");
            }
        }
    }

    @Override
    public void deletar(Entidade t) {
        for(Entidade entidade: entidadeList ){
            if ((entidade == t) && Objects.nonNull(t)){
                entidadeList.remove(t);
            } else{
                System.out.println("Não é possível remover essa entidade");
            }
        }
    }

    public void imprimeRepositorio(){
        System.out.println("----------CADASTROS:----------");
        for (Entidade entidade: entidadeList) {
            System.out.println(entidade);
        }

        if (entidadeList.isEmpty()){
            System.out.println("----------REPOSITÓRIO LIMPO----------");
        }
    }

    public Repository build(){
        Repository repositoryCriado = new Repository(entidadeList,1);
        return repositoryCriado;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "entidadeList=" + entidadeList +
                ", sequence=" + sequence +
                '}';
    }
}
