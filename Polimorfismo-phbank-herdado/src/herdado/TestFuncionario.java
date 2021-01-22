package herdado;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario Manu = new Funcionario();
		Manu.setNome("Manuela Oliveira");
		Manu.setCpf("035.569.256-52");
		Manu.setSalario(4000);
		
		System.out.println(Manu.getNome());
		System.out.println(Manu.getBonificacao());

	}

}
