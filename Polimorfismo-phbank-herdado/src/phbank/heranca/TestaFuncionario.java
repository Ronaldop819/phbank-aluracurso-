package phbank.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario naldo = new Funcionario();
		naldo.setNome("Naldinho chocolate");
		naldo.setCpf("03252522236");
		naldo.setSalario(10000.0);
		
		System.out.println(naldo.getNome());
		System.out.println(naldo.getSalario());
		
	}

}
