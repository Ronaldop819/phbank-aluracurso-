package phbank.heranca;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Toddynho");
		g1.setCpf("03225568556");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(2325);
		boolean autentica = g1.autentica(2325);
		System.out.println(autentica);
		
	}

}
