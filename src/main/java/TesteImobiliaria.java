public class TesteImobiliaria {

    public static void main(String[] args) {
        // Criando objetos de endereço
        Endereco enderecoImobiliaria = new Endereco("Centro", "São Paulo", "01001-000", "Rua Exemplo", "123", "", "SP");
        Endereco enderecoCliente = new Endereco("Bela Vista", "São Paulo", "01311-000", "Av. Paulista", "456", "Apto 501", "SP");

        // Criando objetos de imobiliária e cliente
        Imobiliaria imobiliaria = new Imobiliaria(1, enderecoImobiliaria);
        Cliente cliente = new Cliente(1, "João", 123456789, enderecoCliente, 5000.0, "Venda");

        // Contratando corretor
        Corretor corretor = new Corretor(1, "Maria", 987654321, enderecoImobiliaria, imobiliaria);
        imobiliaria.contratarCorretor(corretor);

        // Criando imóveis
        Imovel apartamento = new Apartamento(true);
        apartamento.setNum_quartos(2);
        apartamento.setNum_banheiros(1);
        apartamento.setArea(80.0);
        apartamento.setValor(200000.0);
        apartamento.setLivre_para_venda(true);

        Imovel casa = new Casa(true);
        casa.setNum_quartos(3);
        casa.setNum_banheiros(2);
        casa.setArea(150.0);
        casa.setValor(350000.0);
        casa.setLivre_para_venda(false);

        // Cadastrando imóveis na imobiliária
        imobiliaria.cadastrarImovel(apartamento);
        imobiliaria.cadastrarImovel(casa);

        // Testando método de listar imóveis disponíveis pelo corretor
        System.out.println(corretor.listaImovelDisponivelAtribuirAutomatico());

        // Testando fechar negócio
        corretor.fecharNegocio(cliente, apartamento);

        // Testando método gerarContrato
        ContratoAluguel contratoAluguel = new ContratoAluguel(1500.0, "João da Silva");
        ContratoVenda contratoVenda = new ContratoVenda(2000.0, 12, false);

        System.out.println(contratoAluguel.gerarContrato());
        System.out.println(contratoVenda.gerarContrato());
    }
}
