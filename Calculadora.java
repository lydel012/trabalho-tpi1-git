public double calcular(String operacao, int a, int b) {
    switch (operacao.toLowerCase()) {

        case "soma":
            return a + b;

        default:
            throw new IllegalArgumentException("Operação inválida: " + operacao);
    }
}

// Comentario adicionado antes do metodo main
// Método principal para testar
public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    System.out.println("Soma: " + calc.calcular("soma", 10, 5));
}
}