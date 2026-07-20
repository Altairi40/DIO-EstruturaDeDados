package listas.listas_encadeada;

public class Main {
    static void main() {

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        // Adicionando novos Nós
        minhaLista.add("Teste1");
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");

        // Buscando Nós específicos
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(0));

        // Exibindo toda a lista (toString)
        System.out.println(minhaLista);

        // Removendo Nó da lista
        minhaLista.remove(2);
        System.out.println(minhaLista);

    }
}
