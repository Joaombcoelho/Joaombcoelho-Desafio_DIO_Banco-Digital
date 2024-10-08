package bancoDigital;

public abstract class conta implements iConta{
	protected static final int AGENCIA_PADRAO = 0001;
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected cliente cliente;

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
			saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d" , this.agencia));
		System.out.println(String.format("Numero: %d" , this.numeroConta));
		System.out.println(String.format("Saldo: %.2f" , this.saldo));
		
	}

}
