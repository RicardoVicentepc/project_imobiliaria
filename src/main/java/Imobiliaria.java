import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private Integer id_empresa;
    private Endereco endereco;

    private List<Corretor> listaCorretores;
    private List<Imovel> listaImoveis;

    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public void setListaImoveis(ArrayList listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    public Imobiliaria(Integer id_empresa, Endereco endereco) {
        this.id_empresa = id_empresa;
        this.endereco = endereco;
        listaCorretores = new ArrayList<>();
        listaImoveis = new ArrayList<>();
    }

    public void contratarCorretor(Corretor corretor){
        listaCorretores.add(corretor);
        System.out.println(" Corretor Cadastrado com sucesso");
    }
    public void demitirCorretor(Corretor corretor){
        listaCorretores.remove(corretor);
        System.out.println(" Corretor demitido com sucesso");
    }

    public void cadastrarImovel(Imovel imovel){
        listaImoveis.add(imovel);
        System.out.println(" Imovel Cadastrado com sucesso");
    }

    public void excluirImovel(Imovel imovel){
        listaImoveis.remove(imovel);
        System.out.println(" Imovel Removido com sucesso");

    }


    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "id_empresa=" + id_empresa +
                ", endereco=" + endereco +
                '}';
    }
}
