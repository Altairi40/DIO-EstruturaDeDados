package projetoReferencia;

public class Main {
    static void main() {

        int intA = 1;
        int intB = intA;

    /* Usando classes primitivas, apenas o valor é copiado e enviado para
      o endereço na memória onde se ocupa a variável*/

        System.out.println("intA = "+ intA+ " intB = "+ intB);

        intA = 2;

    // Por isso que o valor de intB não é alterado, apesar do intA ser definido como 2 agora
        System.out.println("intA = "+ intA+ " intB = "+ intB);

    // Já quando se trata de Objetos, a história muda uma pouco
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

    /* Quando se define que um objeto extansia outro, ele vai atrás diretamente
      da referência de memória do objA, para atribuir o valor no objB*/
        System.out.println("\nobjA = "+ objA+ " objB = "+ objB);

        objA.setNum(2);

    /* Por esse motivo que dessa vez, tanto o objB tem seus valores atualizados
      junto do objA*/
        System.out.println("objA = "+ objA+ " objB = "+ objB);


    }
}
