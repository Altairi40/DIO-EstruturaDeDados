package pilha_fila.pilha;

public class No {

    private int dado;
    private No refNo;


    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() { // Imprime o valor do Dado dentro do Nó em forma de String
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
