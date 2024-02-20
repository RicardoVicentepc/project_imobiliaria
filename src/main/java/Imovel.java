public abstract class Imovel {

    private Integer id_imovel;
    private Imobiliaria imobiliaria;
    private Endereco endereco;
    private Double area;
    private Double valor;
    private Integer num_quartos;
    private Integer num_banheiros;
    private String tipo_imovel;
    private Boolean livre_para_venda;


    public Integer getId_imovel() {
        return id_imovel;
    }

    public void setId_imovel(Integer id_imovel) {
        this.id_imovel = id_imovel;
    }

    public Imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(Integer num_quartos) {
        this.num_quartos = num_quartos;
    }

    public Integer getNum_banheiros() {
        return num_banheiros;
    }

    public void setNum_banheiros(Integer num_banheiros) {
        this.num_banheiros = num_banheiros;
    }

    public String getTipo_imovel() {
        return tipo_imovel;
    }

    public void setTipo_imovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public Boolean getLivre_para_venda() {
        return livre_para_venda;
    }

    public void setLivre_para_venda(Boolean livre_para_venda) {
        this.livre_para_venda = livre_para_venda;
    }

    public Double calcularPreco(){ return null;}
}

