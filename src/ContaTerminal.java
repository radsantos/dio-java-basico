import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//Definindo os atributos
		int numeroDaConta;
		String agencia;
		String nomeDoCliente;
		double saldo;
		
		
		
		System.out.println("CONTA BANCÁRIA");
		System.out.println();
		
		System.out.println("Por favor, digite o número da Agência!");
		agencia = sc.next();
		System.out.println("Por favor, digite o número da Conta!");
		numeroDaConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente!");
		nomeDoCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo da conta!");
		saldo = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é"
				+ " " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque." );
		
		
		
		sc.close();
		
	}

}
