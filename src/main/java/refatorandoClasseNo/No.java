package refatorandoClasseNo;

public class No<T> {
/* Essa classe No, agora é uma Classe Genérica '<T>', ou seja, ela aceita qualquer
tipo mesmo não sendo definido de imediato, como antes o conteudo era
obrigatoriamente uma String, mas também poderia ser int, ou double...*/


    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
