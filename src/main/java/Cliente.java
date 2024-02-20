public class Cliente extends Pessoa{
    private Double valor_disponivel;
    private String tipoImovel;
    private Boolean pagarAvista;
    public Cliente(Integer id_pessoa, String nome, Integer telefone, Endereco endereco, Double valor_disponivel, String tipoImovel) {
        super(id_pessoa, nome, telefone, endereco);
        this.valor_disponivel = valor_disponivel;
        this.tipoImovel = tipoImovel;
    }


    public Boolean getPagarAvista() {
        return pagarAvista;
    }

    public void setPagarAvista(Boolean pagarAvista) {
        this.pagarAvista = pagarAvista;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Double getValor_disponivel() {
        return valor_disponivel;
    }

    public void setValor_disponivel(Double valor_disponivel) {
        this.valor_disponivel = valor_disponivel;
    }

}
