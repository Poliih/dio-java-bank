package banco;

import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da Conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero da Agencia:");
        String agencia = sc.nextLine();

        System.out.println("Digite o Nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o Saldo Inicial:");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma opcaoo:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Aplicar Juros Mensais");
            System.out.println("4 - Ver Saldo");
            System.out.println("5 - Ver Extrato");
            System.out.println("6 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do deposito:");
                    double dep = sc.nextDouble();
                    conta.depositar(dep);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double sac = sc.nextDouble();
                    conta.sacar(sac);
                    break;
                case 3:
                    System.out.println("Digite a taxa de juros (%):");
                    double juros = sc.nextDouble();
                    conta.aplicarJuros(juros);
                    break;
                case 4:
                    conta.exibirSaldo();
                    break;
                case 5:
                    conta.exibirExtrato();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Obrigado por usar nosso banco!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }

        sc.close();
    }
}
