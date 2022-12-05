import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
         //TODO:Conhecer e importar a classe Scanner
         Scanner sc = new Scanner(System.in);
         //Exibir as mensagens para o novo usuário
         System.out.println("Por favor, digite o número da Agência !");
         String agencia = sc.nextLine();
         
         System.out.println("Por favor, digite o número da Conta !");
         int numero = sc.nextInt();
         
         System.out.println("Por favor, digite o nome do cliente !");
         String nomeCliente = sc.next();
         
         System.out.println("Por favor, digite o saldo da conta !");
         double saldo = sc.nextDouble();
         
         //Imprimir na tela as informações do cliente.
         System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                             + agencia+", conta "+numero+"e seu saldo R$:"+ saldo + " já está disponível para saque");
 
 
 

    }
}
