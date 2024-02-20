public class ContratoAluguel extends Contrato implements ContratoGeravel{
    private Double valor_por_mes;
    private String locatorio;

    public ContratoAluguel(Double valor_por_mes, String locatorio) {
        this.valor_por_mes = valor_por_mes;
        this.locatorio = locatorio;
    }

    public Double calcularValorAnual(){
        return valor_por_mes * 12;
    }

    public Double calcularTaxaAtrasoPagamento(Integer quant_dias, Double valor_por_dia_atrasado){
        return quant_dias * valor_por_dia_atrasado;
    }


    @Override
    public String gerarContrato() {
        return "ContratoAluguel{" +
                "valor_por_mes=" + valor_por_mes +
                ", locatorio='" + locatorio + '\'' +
                "} " + super.toString();
    }
}
