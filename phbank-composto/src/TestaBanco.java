
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente ronaldo = new Cliente();
		ronaldo.nome = "Ronaldo Philippe";
		ronaldo.cpf = "033.565.254-45";
		ronaldo.profissao = "programador";
		
		Conta contaDoRonaldo = new Conta();
		contaDoRonaldo.deposita(100);
		
		contaDoRonaldo.titular = ronaldo;
		System.out.println(contaDoRonaldo.titular.nome);

	}

}
