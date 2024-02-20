import java.awt.*;

public class Corretor extends Pessoa {
    private Imobiliaria imobiliaria;
    private Imovel imovel;


    public Corretor(Integer id_pessoa, String nome, Integer telefone, Endereco endereco, Imobiliaria imobiliaria) {
        super(id_pessoa, nome, telefone, endereco);
        this.imobiliaria = imobiliaria;
    }

    public String listaImovelDisponivelAtribuirAutomatico(){
        for (Imovel imovelAtual : imobiliaria.getListaImoveis()){
            if(imovelAtual.getLivre_para_venda()) {
                imovel = imovelAtual;
                return "Imovel a venda achado e alocado";
            }
        }
        return "Nenhum Imovel encontrado";
    }
    public void fecharNegocio(Cliente cliente , Imovel imovel){
        Boolean saldoDisponivel = cliente.getValor_disponivel() >= imovel.getValor() ? true : false;
        if(saldoDisponivel){
             if(cliente.getTipoImovel().equals("Aluguel")){
                 ContratoAluguel contratoAluguel = new ContratoAluguel(cliente.getValor_disponivel() * .15, "padrão");
                 System.out.println("Casa alugada com sucesso");
             }else if(cliente.getTipoImovel().equals("Venda")){
                 ContratoVenda contratoVenda = new ContratoVenda(
                         cliente.getValor_disponivel() * .25,
                         cliente.getValor_disponivel() > 2000.0 ? 70 : 120,
                         cliente.getPagarAvista());
                 System.out.println("Casa vendida com sucesso");
             }else{
                 System.out.println("Tipo de Imovel pedido pelo Cliente inválido");
             }
        }
    }
}
