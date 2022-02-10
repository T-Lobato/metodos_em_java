package exercicio01;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(5,10);
        Calculadora.subtracao(5,10);
        Calculadora.multiplicacao(5,10);
        Calculadora.divisao(5,10);
        System.out.println();

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(19);
        System.out.println();

        // Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 10);
        System.out.println();
    }
}
