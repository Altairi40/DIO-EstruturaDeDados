package listas.listas_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

// Construtor que define os valores iniciais quando a lista é instanciada por padrão
    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

// Método que adiciona um novo Nó a lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoSeguinte(null);
        novoNo.setNoAnterior(ultimoNo);

// Primeira verificação, caso a lista esteja vazia.
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
// Segunda verificação, atualizando a referência do Nó que está em último na lista
        if(ultimoNo != null){
            ultimoNo.setNoSeguinte(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i =0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoSeguinte();
        }
        return noAuxiliar;
    }

// Método que retorna o tamanho atual da lista
    public int size(){
        return tamanhoLista;
    }
}
