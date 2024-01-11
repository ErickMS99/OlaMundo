import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fila{
    public static void main(String[] args) {
        listaSimples();
    }

    private static void listaSimples() {
        System.out.println("** Lista Simples Ordenada **");

        List<String> lista = new ArrayList<>();

        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Marcos Felipe");
        lista.add("Maria Lucia");

        Collections.sort(lista);

        System.out.println(lista);
    }
}
