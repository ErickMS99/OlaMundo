public class PessoaFisica extends Pessoa {
    private long cpf;
    
    public PessoaFisica(String nome, String endereco, Long telefone, Long cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }
    
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}

