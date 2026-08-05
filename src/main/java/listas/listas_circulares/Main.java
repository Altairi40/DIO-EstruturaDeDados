package listas.listas_circulares;

public class Main {
    public static void main(String args[]){

        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("c1");
        System.out.println(listaCircular);

        listaCircular.add("c2");
        listaCircular.add("c3");
        System.out.println(listaCircular);

        System.out.println(listaCircular.get(7));
        System.out.println(listaCircular.get(323));

    }

}
