public class Pessoa {
    // Atributos
    private String nome;
    private String endereco;
    private long telefone;
    
    // Construtor
    public Pessoa(String nome, String endereco, Long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public long getTelefone() {
        return telefone;
    }
    
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}

