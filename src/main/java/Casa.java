public class Casa extends Imovel{
    private Boolean possui_garagem;

    public Casa(Boolean possui_garagem) {
        this.possui_garagem = possui_garagem;
    }

    public Double calcularPreco(Integer quant_quartos, Integer quant_banheiro, Double area){
        return (quant_quartos * 18000.0) + (quant_banheiro * 9000.0) + ((area / 100) * 50);
    }


    public Boolean getPossui_garagem() {
        return possui_garagem;
    }

    public void setPossui_garagem(Boolean possui_garagem) {
        this.possui_garagem = possui_garagem;
    }


    @Override
    public String toString() {
        return "Casa{" +
                "possui_garagem=" + possui_garagem +
                "} " + super.toString();
    }
}
