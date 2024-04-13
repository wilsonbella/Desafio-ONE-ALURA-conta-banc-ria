import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "Wilson Bella";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome:        " + nome);
        System.out.println("Tipo conta:      " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("\n**************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = entrada.nextInt();
            if (opcao == 1)
                System.out.println("Seu saldo é: " + saldoInicial);
            else if (opcao == 2) {
                System.out.println("Digite o valor a transferir");
                double valor = entrada.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Saldo insuficiente");
                } else
                    saldoInicial -= valor;
            } else if (opcao == 3) {
                System.out.println("Digite o valor a receber");
                double valorReceber = entrada.nextDouble();
                saldoInicial += valorReceber;

            } else if (opcao != 4) {
                System.out.println("Opção inválida");

            }

        }


    }


}


