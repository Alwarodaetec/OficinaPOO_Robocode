/*
Atividade: Atividade 04
Autor: Alwaro Pedro da Silva
Data: 14/05/2025
Kata: Basic Mathematical Operations
*/
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        IdentificadorOperacoes io = new IdentificadorOperacoes();
        return io.identificadorOperacao(op, v1, v2);
    }
}

class IdentificadorOperacoes {

    public Integer identificadorOperacao(String operador, int n_um, int n_dois) {
        switch (operador) {
            case "+":
                return somarValores(n_um, n_dois);
            case "-":
                return subtrairValores(n_um, n_dois);
            case "*":
                return multiplicarValores(n_um, n_dois);
            case "/":
                return dividirValores(n_um, n_dois);
            default:
                return 0; 
        }
    }

    private Integer somarValores(int n_1, int n_2) {
        return n_1 + n_2;
    }

    private Integer subtrairValores(int n_1, int n_2) {
        return n_1 - n_2;
    }

    private Integer multiplicarValores(int n_1, int n_2) {
        return n_1 * n_2;
    }

    private Integer dividirValores(int n_1, int n_2) {
        if (n_2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return n_1 / n_2;
    }
}
