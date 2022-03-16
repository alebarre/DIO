
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {

		System.out.println("$$$ extrato da Conta Poupança$$$");
		super.imprimirInfosComunsCp();
		
	}
	
}
