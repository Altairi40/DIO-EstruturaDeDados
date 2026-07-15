package pilha_fila.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

// Adicionando um Novo Nó, no topo da Pilha;
    public void push(No novoNo){ // Referência do Novo Nó

        No refAuxiliar = refNoEntradaPilha; // Salva a referência do topo atual na pilha

        refNoEntradaPilha = novoNo; // Faz que a referência do Novo Nó seja a referência do topo da Pilha

        refNoEntradaPilha.setRefNo(refAuxiliar); /* Torna a referência que o Novo Nó aponta, seja a mesma
        que a antiga que estava no topo, ou seja, ela é a seguinte da Pilha*/
    }

    // Retorna o Dado da Referência do topo, e exclui ela da Pilha
    public No pop(){

        if(!isEmpty()){ // Verifica se a Pilha está vazia ou não

            No noPoped = refNoEntradaPilha; // Pega o Nó que está no topo da Pilha

            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); /* Faz com que o Nó no topo seja o proximo valor
            de referência que o Nó Poped apontava, ou seja, ele é tirado da Pilha no processo*/

            return noPoped; // Retorna o valor do Nó referenciado no topo
        } else
            return null;
    }

    // Retorna o valor da referência do topo da Pilha, sem excluí-la
    public No top(){
        return refNoEntradaPilha;
    }

    // Verificador se a Pilha está ou não vazia
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha; // Inicio da referência (topo)

        while (true){
        // Enquanto a referência do Nó seguinte, não for Null, ou seja, a base da pilha, o loop continua
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; // Retorna o dado da referência atual
                noAuxiliar = noAuxiliar.getRefNo(); // Segue para o próximo Nó
            } else
                break; // Fim do loop
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
