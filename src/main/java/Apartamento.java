public class Apartamento extends Imovel {
    private Boolean possui_vaga_garagem;

    public Apartamento(Boolean possui_vaga_garagem) {
        this.possui_vaga_garagem = possui_vaga_garagem;
    }

    public Double calcularPreco(Integer quant_quartos, Integer quant_banheiro, Double area){
        return (quant_quartos * 18000.0) + (quant_banheiro * 9000.0) + ((area / 100) * 50);
    }
    public Boolean getPossui_vaga_garagem() {
        return possui_vaga_garagem;
    }

    public void setPossui_vaga_garagem(Boolean possui_vaga_garagem) {
        this.possui_vaga_garagem = possui_vaga_garagem;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "possui_vaga_garagem=" + possui_vaga_garagem +
                "} " + super.toString();
    }
}
