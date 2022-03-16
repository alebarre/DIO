
public class ContaAplicacao extends Conta{

	public ContaAplicacao(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("$$$ extrato da Conta Corrente $$$");
		super.imprimirInfosComunsCc();
		
	}

	
	
}
