public abstract class Pessoa {
    private Integer id_pessoa;
    private String nome;
    private Integer telefone;
    private Endereco endereco;

    public Pessoa(Integer id_pessoa, String nome, Integer telefone, Endereco endereco) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id_pessoa=" + id_pessoa +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
