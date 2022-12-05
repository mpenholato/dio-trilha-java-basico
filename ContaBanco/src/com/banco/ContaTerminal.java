package com.banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

            
        //Exibir as mensagens para o novo usuário
        System.out.println("Por favor, digite o n�mero da Ag�ncia !");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o n�mero da Conta !");
        int numero = sc.nextInt();
        
        System.out.println("Por favor, digite o nome do cliente !");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = sc.nextDouble();
        
        sc.close();

        //Imprimir na tela as informações do cliente.
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia  é " 
        			+ agencia+", conta "+numero+" e seu saldo R$:"+ saldo + " ja esta disponível para saque");


	}

}
