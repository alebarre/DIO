
public class Main {

	public static void main(String[] args) {

		Cliente alexandre = new Cliente("Alexandre Barreto");
		
		Conta cc = new ContaCorrente(alexandre);
		Conta poupanca = new ContaPoupanca(alexandre);
		
		cc.depositar(900);
		
		cc.transferir(poupanca, 30);
		
		cc.aplicar(6);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
