import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            try {
                // chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (InputMismatchException ex) {
            System.out.println("\nOs parâmetros informados devem ser numéricos.");
        }

        terminal.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("\nAtenção!\nO segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}