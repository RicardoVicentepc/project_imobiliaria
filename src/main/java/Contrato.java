public class Contrato {
    private Integer id_contrato;
    private Imobiliaria imobiliaria;
    private Cliente Cliente;
    private Corretor corretor;
    private Imovel imovel;
    private String tipo;
    private Integer quant_dia_atrasado;
    private Double valor_dia_atrasado;

    public Double calcularTaxaAtrasoPagamento(){
        return quant_dia_atrasado * valor_dia_atrasado;
    }


}
