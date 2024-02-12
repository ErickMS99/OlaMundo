import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pessoa {
    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        
        // Adicionando pessoas à lista
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));

        // Ordenando a lista por nome
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return pessoa1.getNome().compareTo(pessoa2.getNome());
            }
        });

        // Iterando sobre a lista ordenada e imprimindo informações
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Gênero: " + pessoa.getGenero());
        }
    }
}


