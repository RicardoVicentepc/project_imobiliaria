public class ContratoVenda extends Contrato implements ContratoGeravel{
    private Double valor_parcela;
    private Integer quant_parcelas;
    private Boolean avista;

    public ContratoVenda(Double valor_parcela, Integer quant_parcelas, Boolean avista) {
        this.valor_parcela = valor_parcela;
        this.quant_parcelas = quant_parcelas;
        this.avista = avista;
    }

    public Double calcularValorTotal(){
        return valor_parcela * quant_parcelas;
    }
    public Double calcularTaxaAtrasoPagamento(Integer quant_dias, Double valor_por_dia_atrasado){
        return quant_dias * valor_por_dia_atrasado;
    }


    @Override
    public String gerarContrato() {
        return "ContratoVenda{" +
                "valor_parcela=" + valor_parcela +
                ", quant_parcelas=" + quant_parcelas +
                ", avista=" + avista +
                "} " + super.toString();
    }
}
