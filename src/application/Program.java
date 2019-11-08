package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		//instanciando um objeto de cada tipo de classe, seja a classe base(Account) ou as filhas(Business e Savings Accounts, que sao "tipos de Account")
		Account acc = new Account(1001,"Alex",0.0); 
		BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
		SavingsAccount sacc = new SavingsAccount(1005,"Monica",0.0,0.01);
		
		//UPCASTING
		//Como as classes filhas, são classes do mesmo tipo da classe base, toda BusinessAccount ou SavingsAccount é uma Account de um tipo especifico
		//Por isto, e possivel atribuir as classes filhas a classe base, sem fazer casting do tipo.
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
		//Account acc3 = new BusinessAccount(1004,"Anna",0.0,100.0); //teste para mudar o teste logico do if, usando a palavra instanceof
		
		//DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount)acc2;
		if(acc3 instanceof BusinessAccount) {//se acc3 for uma instancia de BusinessAccount, fazer um casting, para poder usar os metodos da classe base, de um objeto criado como Account(Classe base)
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {//caso analogo, so que analisando a possibilidade de acc3 ser uma instancia da classe SavingsAccount
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Aqui foi feito um teste da sobreposicao do metodo original da classe base (Account), chamado withdraw, onde em cada classe base, modifica-se a taxa de saque de um valor da conta 
		//O teste simplesmente usa as três instancias da classe inicializadas com 1000 e com uma operacao de saque no valor de 200 reais. dependendo do tipo de instancia de cada objeto,
		//se tem um valor de taxa diferente, portanto, o valor do saldo no final tambem e diferenciado
		
		//Como Account foi definida como classe abstrata, ela não pode ser instanciada
		//Account acc_1 = new Account(2001,"Alex",1000.0);
		//acc_1.withdraw(200.0);
		//System.out.println("Account: "+acc_1.getBalance());
		Account acc_2 = new SavingsAccount(2002,"Amanda",1000.0,0.01);
		acc_2.withdraw(200.0);
		System.out.println("SavingsAccount: "+acc_2.getBalance());
		Account acc_3 = new BusinessAccount(2003,"Alexandre",1000.0,500.0);
		acc_3.withdraw(200.0);
		System.out.println("BusinessAccount: "+acc_3.getBalance());
	}

}
