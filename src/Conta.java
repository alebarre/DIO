
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double saldoApl;
	protected double txJuros;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getSaldoApl() {
		return saldoApl;
	}
	
	public double getTxJuros() {
		return txJuros;
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
	public void aplicar(double valor) {
		txJuros = valor;
		saldoApl += ((saldo*txJuros)/100);
		saldo += saldoApl;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComunsCc() {
		System.out.println(String.format("Cliente: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("N�mero: %d", numero));
		System.out.println("Aplica��o de "+ txJuros + "% | Saldo ap�s aplica��o: " + saldo);
		
		System.out.println();
	}
	
	protected void imprimirInfosComunsCp() {
		System.out.println(String.format("Cliente: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("N�mero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
		System.out.println();
	}
	
}
