package phbank.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario novo = new Funcionario();
		novo.setNome("Rodiney");
		novo.setCpf("03325565545");
		novo.setSalario(3000.0);
		
		System.out.println("Nome do funcionário é: " + novo.getNome());
		System.out.println("Cpf do funcionário é: " + novo.getCpf());
		System.out.println("O salário do funcionário é: " + novo.getSalario());
	}

}
