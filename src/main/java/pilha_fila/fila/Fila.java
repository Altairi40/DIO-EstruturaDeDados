package pilha_fila.fila;

public class Fila {

    private No refNoEntradaFila = null;

// Método que adiciona um novo Nó na fila
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    /* Método que remove o primeiro Nó da fila*/
    public No dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; // Referência para dizer quem é o proximo a sair após a remoção do primeiro Nó
            while(true){
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                /* Quando encontrar o Nó que refere Null, o loop se encerra e o Nó anterior
                     passa a referir "Null", ou seja, o primeiro que entrou foi retirado da fila */
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    /* Método que percorre a fila inteira, até chegar no primeiro Nó que foi adicionado*/
    public No first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null) { // Verifica se o proximo o Nó atual refere a "Null"
                    primeiroNo = primeiroNo.getRefNo(); // Caso não seja, ele não é o primeiro da fila, então avança para o proximo
                }else{
                    break; // Chegou no primeiro Nó, o loop se encerra
                }
            }
            return primeiroNo; // Retorna o primeiro Nó
        }
        return null;
    }

    public boolean isEmpty(){ // Verifica se a fila está ou não vazia
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
