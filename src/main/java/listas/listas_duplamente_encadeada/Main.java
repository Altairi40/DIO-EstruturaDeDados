package listas.listas_duplamente_encadeada;

public class Main {
    static void main() {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        // Preenchendo a Lista Duplamente Encadeada
        lista.add("C1");
        lista.add("C2");
        lista.add("C3");
        lista.add("C4");
        lista.add("C5");
        lista.add("C6");
        lista.add("C7");

        System.out.println(lista);

        //Imprimindo conteúdo do Nó por índice
        System.out.println(lista.get(3));
        System.out.println(lista.get(5));
        System.out.println(lista.get(0));


        //Removendo Nó e adicionado um novo Nó por índice
        lista.remove(3);
        lista.add(1,"99");
        System.out.println(lista);

        System.out.println(lista.size());
    }
}
