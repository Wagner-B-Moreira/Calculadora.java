
// Importa a classe Scanner para permitir entrada de dados pelo teclado
import java.util.Scanner;

// Declaração da classe principal chamada Calculo
public class Calculo {

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados digitados no console
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário digitar o primeiro número
        System.out.println("Digite o primeiro número:");

        // Lê o valor digitado e armazena na variável numero1 (tipo double)
        double numero1 = scanner.nextDouble();

        // Exibe uma mensagem para o usuário digitar o segundo número
        System.out.println("Digite o segundo número:");

        // Lê o valor digitado e armazena na variável numero2 (tipo double)
        double numero2 = scanner.nextDouble();

        // Mostra o menu de operações disponíveis para o usuário escolher
        System.out.println("Escolha a operação:");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");

        // Lê a escolha do usuário (1, 2, 3 ou 4)
        int operacao = scanner.nextInt();

        // realizado calculo
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(numero1, numero2);
                break;
            case 2:
                resultado = Subtrair(numero1, numero2);
                break;
            case 3:
                resultado = Multiplicar(numero1, numero2);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = dividir(numero1, numero2);
                } else {
                    System.out.println("divisâo por numero 0 nâo é permido");
                    scanner.close();
                    return;
                }

                resultado = dividir(numero1, numero2);
                break;

            default:
                System.out.println("Operaçâo invalida");
                scanner.close();
                return;
        }
        // exebir resultado
        System.out.println("o Resultado da operaçâo:" + resultado);

        // Fecha o objeto Scanner (boa prática para liberar recursos)
        scanner.close();
    }

    // funçao para calculos

    public static double adicionar(double a, double b) {
        return a + b;

    }

    public static double Subtrair(double a, double b) {
        return a - b;

    }

    public static double Multiplicar(double a, double b) {
        return a * b;

    }

    public static double dividir(double a, double b) {
        return a / b;

    }
}
