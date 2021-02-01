package phbank.heranca;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g2 = new Gerente();
		g2.setNome("John Carlos");
		g2.setSalario(5000.0);
		System.out.println("Bonificação do Gerente: " + g2.getBonificacao());
		
		Funcionario func = new Funcionario();
		func.setNome("João");
		func.setSalario(2000.0);
		System.out.println("Bonificação do Funcionário padrão: " + func.getBonificacao());
		
		EditorDeVideo edv = new EditorDeVideo();
		edv.setSalario(2500.0);
		System.out.println("Bonificação do Editor de Vídeo: " + edv.getBonificacao());
		
		Programador prog = new Programador();
		prog.setSalario(10000.0);
		System.out.println("Bonificação do programador é: " + prog.getBonificacao());
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g2);
		controle.registra(func);
		controle.registra(edv);
		controle.registra(prog);
		
		System.out.println("Valor total pago de bonificação para os funcionários acima " 
		+ controle.getSoma());
		

	}

}
