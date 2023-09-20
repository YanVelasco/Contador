import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            int parametroUm = input.nextInt();
            System.out.println("Digite o segundo número:");
            int parametroDois = input.nextInt();

            contar(parametroUm, parametroDois);

            input.close();
        } catch (ParamtrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParamtrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParamtrosInvalidosException("O segundo número não pode ser menor do que o primeiro");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
