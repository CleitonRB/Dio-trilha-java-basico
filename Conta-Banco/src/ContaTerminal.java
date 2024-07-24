import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //todo:Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para nosso usuario
        System.out.print("Digite o Número da Agência: ");
        String Agencia = scanner.nextLine();

        System.out.print("Digite o Número da Conta: ");
        String Numero = scanner.nextLine();

        System.out.print("Digite o Nome do cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.print("Digite o Saldo da Conta: ");
        double Saldo = scanner.nextDouble();

        //Obter pela classe scanner os valores digitados no terminal
        ContaBanco conta = new ContaBanco(Agencia, Numero, NomeCliente, Saldo);

        //Exibir a mensagem conta criada
        System.out.println("Olá " + conta.getNomeCliente() + " Obrigado por criar uma conta em nosso Banco,"
        + " sua agencia é " + conta.getAgencia() + ", Conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + 
        " já está disponivel para saque");

        scanner.close();
    }
}
