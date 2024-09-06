package bancoDigital;

public class caixaEletronico {

	public static void main(String[] args) {
		cliente Joao = new cliente();
		Joao.setNome("Joao Manoel");
		cliente Samara = new cliente();
		Samara.setNome("Samara Coelho");
		
		conta cc = new contaCorrente(Joao);
		conta polpanca = new contaPolpanca(Samara);
		
		cc.depositar(250);
		polpanca.depositar(1000);
		cc.imprimirExtrato();
		polpanca.imprimirExtrato();
		
		cc.transferir(100, polpanca);
		cc.imprimirExtrato();
		polpanca.imprimirExtrato();

	}



}
