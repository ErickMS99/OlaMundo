public class PessoaJuridica extends Pessoa {
    private long cnpj;
    
    public PessoaJuridica(String nome, String endereco, Long telefone, Long cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }
    
    public long getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}

