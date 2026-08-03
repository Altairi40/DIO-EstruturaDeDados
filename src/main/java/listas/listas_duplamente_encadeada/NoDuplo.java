package listas.listas_duplamente_encadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noSeguinte;
    private NoDuplo<T> noAnterior;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoSeguinte() {
        return noSeguinte;
    }

    public void setNoSeguinte(NoDuplo<T> noSeguinte) {
        this.noSeguinte = noSeguinte;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
