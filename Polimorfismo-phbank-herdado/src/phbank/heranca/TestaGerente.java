package phbank.heranca;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Ronaldinho");
		g1.setCpf("02156985488");
		g1.setSalario(15000.0);
		
		System.out.println("O nome �: " + g1.getNome());
		System.out.println("O cpf �: " + g1.getCpf());
		System.out.println("O sal�rio �: " + g1.getSalario());
		System.out.println("O b�nus �: " + g1.getBonificacao());
		
		g1.setSenha(2564);
		boolean autentica = g1.autentica(2564);
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
		
		
		
	
		
		
	}	

}
