package exercicio02;

public class BubbleFuncionario {

    public static void ordemCrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getSalario() > funcionarios[j + 1].getSalario()) {
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }

    public static void ordemDecrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getSalario() < funcionarios[j + 1].getSalario()) {
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }

    public static void ordemAlfabetica(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].getNome().compareTo(funcionarios[j + 1].getNome()) > 0) {
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }

    // implementar sout para exibir a lista bonitinha

    public static void exibeLista(Funcionario[] funcionario) {
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println(funcionario[i]);
        }
    }

}
