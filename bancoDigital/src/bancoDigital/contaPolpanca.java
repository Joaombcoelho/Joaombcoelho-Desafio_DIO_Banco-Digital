package bancoDigital;

public class contaPolpanca extends conta{
	
	private static int SEQUENCIAL = 2001;

	public contaPolpanca (cliente cliente) {
		super.agencia = conta.AGENCIA_PADRAO;
		super.numeroConta = SEQUENCIAL++;
		super.cliente = cliente;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("== Extrato da Conta Polpanca ==");
		super.imprimirInfosComuns();
	}
}
