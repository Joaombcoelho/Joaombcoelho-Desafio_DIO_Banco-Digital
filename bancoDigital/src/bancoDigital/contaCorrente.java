package bancoDigital;

public class contaCorrente extends conta {
	
	private static int SEQUENCIAL = 1001;

	public contaCorrente (cliente cliente) {
		super.agencia = conta.AGENCIA_PADRAO;
		super.numeroConta = SEQUENCIAL++; 
		super.cliente = cliente;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("== Extrato da Conta Corrente ==");
		super.imprimirInfosComuns();
	}

	
}
