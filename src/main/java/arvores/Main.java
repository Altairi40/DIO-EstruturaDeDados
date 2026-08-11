package arvores;

import arvores.model.Obj;

public class Main {
    static void main() {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        // Inserindo os valores para a Arvore
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(14));
        minhaArvore.inserir(new Obj(16));
        minhaArvore.inserir(new Obj(18));
        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(15));
        minhaArvore.inserir(new Obj(25));


        //Exibindo Pré Ordem, In Ordem, Pós Ordem
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
