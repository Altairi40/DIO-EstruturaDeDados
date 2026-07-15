package refatorandoClasseNo;

public class Main {
    static void main() {

        // Agora o Nó foi declarado como tipo String, diretamente aqui!!
        No<String> no1 = new No<>("Conteúdo No1");

        No<String> no2 = new No<>("Conteúdo No2");
        no1.setProximoNo(no2);


        No<String> no3 = new No<>("Conteúdo No3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo No4");
        no3.setProximoNo(no4);

    /* Por outro lado, elas poderiam ser 'Integer' também, mas como elas são um
      encadeamento, os Nós seguintes devem ser do mesmo tipo que o primeiro*/

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());


    }
}
