
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoRonaldo = new Conta();
		contaDoRonaldo.saldo = 100;
		contaDoRonaldo.deposita(50);
		System.out.println(contaDoRonaldo.saldo);
		
		boolean valorSacado = contaDoRonaldo.saca(30);
		System.out.println(contaDoRonaldo.saldo);
		System.out.println(valorSacado);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoRonaldo)) {
			System.out.println("Transferência realizada com sucesso");
			
		} else {
			
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoRonaldo.saldo);

	}

}
