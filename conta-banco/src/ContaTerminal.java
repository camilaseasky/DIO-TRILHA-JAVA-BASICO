import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaBanco conta = new ContaBanco();
        Scanner scanner = new Scanner(System.in);
        System.out.println(' ');
        System.out.println("Bem vindo ao nosso sistema de Conta Terminal! Vamos criar sua conta. Por favor informe os dados a seguir.");
        System.out.println("Número Agência com dígito:");
        conta.setAgencia(scanner.next());
        System.out.println("Número da conta corrente:");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nome do titular da conta:");
        conta.setNomeCliente(scanner.nextLine());
        System.out.println("Saldo inicial:");
        conta.setSaldo(scanner.nextDouble());
        String mensagemBoasVindas = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %f já está disponível para saque.",
            conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.consultarSaldo());
        System.out.println(mensagemBoasVindas);
        System.out.println("Informe o valor que deseja sacar:");
        boolean saqueOk = conta.sacar(scanner.nextDouble());
        if (saqueOk) {
            System.out.println("Seu saque foi realizado com sucesso!");
            System.out.println("O saldo disponível atual é:");
            System.out.println(conta.consultarSaldo());
        } else {
            System.out.println("Seu saldo é insuficiente!");
            System.out.println("O saldo disponível atual é:");
            System.out.println(conta.consultarSaldo());
        }
    }
}
