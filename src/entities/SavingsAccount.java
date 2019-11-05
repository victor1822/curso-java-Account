package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	//public SavingsAccount() {super();} //se a classe base tivesse um metodo construtor sem parametros, seria recomendado usar esse tipo de coisa, para nao perder uma possivel implementacao do construtor vazio da classe base


	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);//inicializa o construtor com parametros da classe base
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance*interestRate;
	}
	
	@Override //redefinicao do metodo withdraw da classe base, neste caso, sem cobrar taxa.
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
