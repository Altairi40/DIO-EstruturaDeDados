package listas.listas_circulares;

    public class ListaCircular<T> {

        private No<T> cabeca; // Ultimo da lista antes de voltar para o primeiro
        private No<T> cauda; // Primeiro Nó da Lista e onde é adicionado novos Nós
        private int tamanhoLista;

        public ListaCircular() {
            this.cabeca = null;
            this.cauda = null;
            this.tamanhoLista = 0;
        }

        // Metodo para adicionar um novo Nó a lista
        public void add(T conteudo){
            No<T> novoNo = new No<>(conteudo);
            // Adicionando o primeiro Nó à lista
            if(tamanhoLista == 0){
                this.cabeca = novoNo;
                this.cauda = this.cabeca;
                this.cabeca.setNoProximo(this.cauda);
            }else{
                novoNo.setNoProximo(this.cauda);
                this.cabeca.setNoProximo(novoNo);
                this.cauda = novoNo;
            }
            this.tamanhoLista++;
        }

        // Método para remover Nós na lista
        public void remove(int index){

            // Verificador, se o Index digitado é válido
            if(index >= this.tamanhoLista)
                throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

            No<T> noAuxiliar = cauda;

            if(index == 0){ //estou na cauda
                this.cauda = this.cauda.getNoProximo();
                this.cabeca.setNoProximo(cauda);
            }else if(index == 1){
                this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
            }else{
                for(int i = 0; i < index-1; i++){
                    noAuxiliar = noAuxiliar.getNoProximo();
                }
                noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            }
            this.tamanhoLista--;
        }

        public T get(int index){
            return getNo(index).getConteudo();
        }

        private No<T> getNo(int index){
            if(isEmpty())
                throw new IndexOutOfBoundsException("A lista está vazia");

            if(index == 0){
                return this.cauda;
            }

            No<T> noAuxiliar = this.cauda;
            for(int i = 0; (i < index) && (noAuxiliar != null); i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            return noAuxiliar;
        }

        public boolean isEmpty(){
            return this.tamanhoLista == 0 ? true : false;
        }

        public int size(){
            return this.tamanhoLista;
        }

        @Override
        public String toString() {
            String strRetorno = "";
            No<T> noAuxiliar = this.cauda;
            for(int i = 0; i < size(); i++){
                strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
            return strRetorno;
        }

    }