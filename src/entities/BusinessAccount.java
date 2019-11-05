package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);//inicializa a classe base com parametros para inicializar cada atributo da classe mae
		this.loanLimit = loanLimit;
	}

	// public BusinessAccount() {super();} //se a classe base tivesse um metodo construtor sem parametros, seria recomendado usar esse tipo de coisa

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override //redefinicao do metodo withdraw da classe base (Account)
	public void withdraw(double amount) {
		super.withdraw(amount); //fazer o que a classe mae faz no metodo 
		balance -= 2.0;//e em seguida, diminuir o saldo em 2
	}

}
