
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoRonaldo = new Conta();
		contaDoRonaldo.saldo = 100;
		contaDoRonaldo.deposita(50);
		System.out.println(contaDoRonaldo.saldo);
		
		boolean valorSacado = contaDoRonaldo.saca(30);
		System.out.println(contaDoRonaldo.saldo);
		System.out.println(valorSacado);

	}

}
