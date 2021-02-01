package phbank.heranca;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g2 = new Gerente();
		g2.setNome("John Carlos");
		String nome = g2.getNome();
		
		System.out.println(nome);
		
//		g2.autentica(2325);
//		boolean autentica = autentica(2325);

//		System.out.println(autentica);
		

	}

}
