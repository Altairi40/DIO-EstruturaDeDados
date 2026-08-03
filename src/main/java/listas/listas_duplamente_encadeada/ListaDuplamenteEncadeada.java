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

// Sobrecarga no método add(), adicionando um novo Nó no início, meio ou fim da lista através do índice
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index); //Pega a referência do Nó no índice atual
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoSeguinte(noAuxiliar); //Adiciona no noSeguinte do novoNo a referencia do Nó do índice atual

// Verificador, para o caso do novoNo não for adicionado no final da lista
        if (novoNo.getNoSeguinte() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior()); //Pega a referência do noAnterior do Nó atual no índice e adiciona no noAnterior do novoNo
            novoNo.getNoSeguinte().setNoAnterior(novoNo); //Faz com que a referência de noAnterior do proximo Nó seja a do novoNo
        }else{
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoAnterior().setNoSeguinte(novoNo);
        }

        tamanhoLista++;
    }

// Método para remover um Nó da lista pelo index
    public void remove(int index){
        // Verificador, caso o Nó a ser removido seja o primeiro da lista
        if (index == 0){
            primeiroNo = primeiroNo.getNoSeguinte(); //Define o noSeguinte() como o novo primeiroNo()
        }
        // Verificador se a lista está ou não vazia, caso náo esteja, o noAnterior() do primeiroNo() é null
        if (primeiroNo != null){
            primeiroNo.setNoAnterior(null);
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoSeguinte(noAuxiliar.getNoSeguinte()); // Pega o noAnterior() do index atual e define seu noSeguinte como o seguinte do Nó atual.

            // Verificador, caso o Nó a ser removido não seja o último da lista, faz praticamente o mesmo que a operação acima, mas de forma inversa
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoSeguinte().setNoAnterior(noAuxiliar.getNoAnterior());
            }else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;

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
