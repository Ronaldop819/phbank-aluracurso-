// especificação de conta
class Conta {
	
	//atributos
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		
		this.saldo += valor;
		
	}
	
}