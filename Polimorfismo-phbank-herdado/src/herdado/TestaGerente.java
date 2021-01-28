package herdado;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Ronaldo");
		g1.setCpf("03355568942");
		g1.setSalario(10000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(2523);
		boolean autenticou = g1.autentica(2523);
		System.out.println(autenticou);

	}

}
