
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente ronaldo = new Cliente();
//		conta.titular = ronaldo;
		
		ronaldo.setNome("Ronaldo Philippe");
		conta.setTitular(ronaldo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
//		agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(ronaldo);
		System.out.println(conta.getTitular());
	}

}
