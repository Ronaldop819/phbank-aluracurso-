package phbank.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario novo = new Funcionario();
		novo.setNome("Rodiney");
		novo.setCpf("03325565545");
		novo.setSalario(3000.0);
		
		System.out.println("Nome do funcion�rio �: " + novo.getNome());
		System.out.println("Cpf do funcion�rio �: " + novo.getCpf());
		System.out.println("O sal�rio do funcion�rio �: " + novo.getSalario());
	}

}
