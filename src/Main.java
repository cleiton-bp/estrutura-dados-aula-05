import exercicio01.Ordenacao;
import exercicio02.BubbleFuncionario;
import exercicio02.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("-------- exercicio 01------------");

        int[] vetorBubble = {9,32,52,42,23,12,1};
        int[] vetorSelection = {9,32,52,42,23,12,1};
        int[] vetorinsertion = {9,32,52,42,23,12,1};

//        System.out.println("--------- Bubble --------");
//
//        Ordenacao.imprimeVetor(vetorBubble);
//        Ordenacao.bubbleSort(vetorBubble);
//        Ordenacao.imprimeVetor(vetorBubble);

//        System.out.println("-------- bubble invertido ---------");
//
//        Ordenacao.imprimeVetor(vetorBubble);
//        Ordenacao.bubbleSortDesc(vetorBubble);
//        Ordenacao.imprimeVetor(vetorBubble);
//
//        System.out.println("------ selection ---------");
//
//        Ordenacao.imprimeVetor(vetorSelection);
//        Ordenacao.selectionSort(vetorSelection);
//        Ordenacao.imprimeVetor(vetorSelection);

//        System.out.println("------ selection invertido ---------");
//
//        Ordenacao.imprimeVetor(vetorSelection);
//        Ordenacao.selectionSortDesc(vetorSelection);
//        Ordenacao.imprimeVetor(vetorSelection);
//
//        System.out.println("-------- insertion ---------");
//
//        Ordenacao.imprimeVetor(vetorinsertion);
//        Ordenacao.insertionSort(vetorinsertion);
//        Ordenacao.imprimeVetor(vetorinsertion);

//        System.out.println("-------- insertion invertido ---------");
//
//        Ordenacao.imprimeVetor(vetorinsertion);
//        Ordenacao.insertionSortDesc(vetorinsertion);
//        Ordenacao.imprimeVetor(vetorinsertion);

        System.out.println("-------- exercicio 02------------");

        Funcionario funcionario1 = new Funcionario(100.000, "teste01");
        Funcionario funcionario2 = new Funcionario(17.000, "aeste02");
        Funcionario funcionario3 = new Funcionario(150.000, "beste03");
        Funcionario funcionario4 = new Funcionario(10.000, "zeste04");
        Funcionario funcionario5 = new Funcionario(1.000, "ceste05");

        Funcionario[] listaFuncionarios = {
                funcionario1,
                funcionario2,
                funcionario3,
                funcionario4,
                funcionario5
        };

        // exercicio 2 - a

//        System.out.println("-------- antes ------------");
//        BubbleFuncionario.exibeLista(listaFuncionarios);
//        BubbleFuncionario.ordemCrescente(listaFuncionarios);
//        System.out.println("-------- depois ------------");
//        BubbleFuncionario.exibeLista(listaFuncionarios);

        // exercicio 2 - b

//        System.out.println("-------- antes ------------");
//        BubbleFuncionario.exibeLista(listaFuncionarios);
//        BubbleFuncionario.ordemDecrescente(listaFuncionarios);
//        System.out.println("-------- depois ------------");
//        BubbleFuncionario.exibeLista(listaFuncionarios);

        // exercicio 2 - c

//        System.out.println(listaFuncionarios);
//        BubbleFuncionario.ordemAlfabetica(listaFuncionarios);
//        System.out.println(listaFuncionarios);
    }
}