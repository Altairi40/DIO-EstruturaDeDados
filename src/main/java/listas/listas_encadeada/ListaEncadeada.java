package listas.listas_encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // Método para adicionar um novo Nó
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo); // Novo Nó com seu conteudo

        if(this.isEmpty()){ // Verifica se a lista está vazia
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i=0; i<this.size()-1; i++){ // Cria um laço para percorrer toda a lista, para adicionar um novo Nó
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    // Método que retorna o conteudo dentro do índice definido
    public T get(int index){
        return getNo(index).getConteudo();
    }

    // Método para remover um Nó da lista
    public T remove(int index){
        No<T> noPivor = this.getNo(index);

        /* Caso o primeiro Nó seja removido, ou seja, o de "índice 0", a referenciaEntrada
         deve passar a ser o segundo Nó, fazendo dele o novo "índice 0"*/
        if(index == 0){

            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        /* Estrutura para remover o Nó, onde a referência de "proximoNo" do índice
            anterior passa a ser o "proximoNo" do atual que será removido */
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    /* Método que busca o Nó através do índice definido, o sentido desse método não é exatamente
       para o retorno do conteudo em si, mas sim para uma reutilização de código para os métodos
       "get()" e "remove()"*/
    private No<T> getNo(int index) {
        validaIndex(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i=0; i<=index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    // Contagem do tamanho da Lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;

        while(true) {
        /* Cria um looping, para que a contagem continue sempre que um Nó é
            adicionado na lista, até seu final "referenciaEntrada = null" */

            if (referenciaEntrada != null) { // Quebra o loop se a lista estiver vazia, senão, adiciona +1 na contagem
                tamanhoLista++;

                if (referenciaAuxiliar.getProximoNo() != null){ // Quebra o loop quando chega no índice final da lista
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();

                }else{
                    break;
                }

            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    // Método que valida se o Index definido não passa do tamanho total da lista para busca
    private void validaIndex(int index){
        if(index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Esse índice não existe nessa lista.\n" + "Essa lista vai apensa o índice " + ultimoIndice);
        }

    }

    // Verificador se a lista está vazia!
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    // Imprimindo os conteúdos do Nó
    @Override
    public String toString() {
        String strRetorno = "\n";
        No<T> noAuxiliar = referenciaEntrada; // Índice do primeiro Nó
        for(int i=0; i<size(); i++){ // Laço que percorre toda a lista
            strRetorno += "[Nó{conteúdo= " + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getProximoNo(); // Função que aponta para o Nó seguinte
        }
        strRetorno += "null"; // Imprime o "Null" quando o laço chega no final da lista
        return strRetorno;
    }
}
