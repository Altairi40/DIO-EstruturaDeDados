package projetoNo;
// O conceito de Nó no Java, é o mesmo que um ponteiro em C

public class Main {
    static void main() {

    // Uma Estrutura de Dados Encadeada Simples

        No no1 = new No("Conteúdo No1");

        No no2 = new No("Conteúdo No2");
        no1.setProximoNo(no2);


        No no3 = new No("Conteúdo No3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo No4");
        no3.setProximoNo(no4);

    /* Uma forma direta de exibir o proximo Nó, printando o "proximoNo" do Nó
     atual, ou seja, no primeiro 'println' é o início, no proximo seria o
     ".getProximoNo" do atual para ir no conteúdo do Nó seguinte */
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());

        System.out.println("\n---------------------------\n");

    /* Outra forma é em cada 'println', um '.getProximoNo' fosse adicionado...
      Mas isso poderia resultar em algum momento, uma linha de código gigante,
      só com '.getProximoNo', sempre aumentando*/
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

        // *Esse metodo não é nada convencional!!*

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        // No final do cadeado, o Nó retorna NULL
    }
}
