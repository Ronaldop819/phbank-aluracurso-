package phbank.heranca;

public class ControleBonificacao {

	private double soma;
	
	
	public void registra(Funcionario func) {
		double bonf = func.getBonificacao();
		this.soma = this.soma + bonf;
	}
	
	
	public double getSoma() {
		return soma;
	}
	
}
