import java.util.Scanner;
public class FOR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Dividir dois números");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            // int num1 = 0;
            // int num2 = 0;

            switch (opcao) {
                case 1:
                    System.out.print("Insira o primeiro número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Insira o segundo número: ");
                    int num2 = sc.nextInt();
                    int soma = num1 + num2;
                    System.out.printf("O valor soma %d + %d = %d", num1, num2, soma);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Insira o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.print("Insira o segundo número: ");
                    num2 = sc.nextInt();
                    int subtrair = num1 - num2;
                    System.out.printf("O valor soma %d + %d = %d", num1, num2, subtrair);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Insira o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.print("Insira o segundo número: ");
                    num2 = sc.nextInt();
                    int mult = num1 * num2;
                    System.out.printf("O valor soma %d + %d = %d", num1, num2, mult);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Insira o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.print("Insira o segundo número: ");
                    num2 = sc.nextInt();
                    int div = num1 / num2;
                    System.out.printf("O valor soma %d + %d = %d", num1, num2, div);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}