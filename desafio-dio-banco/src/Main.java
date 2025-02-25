
public class Main {

	public static void main(String[] args) {
		Cliente armando = new Cliente();
		armando.setNome("Armando");
		
		Conta cc = new ContaCorrente(armando);
		Conta poupanca = new ContaPoupanca(armando);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
