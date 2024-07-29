package strategyProblema;

import java.math.BigDecimal;

public class TesteAjusteSalarioSemStrategy {

	public static void main(String[] args) {
		ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
		
		Funcionario funcionarioCLT = new Funcionario();
		funcionarioCLT.setNome("Vitor");
		funcionarioCLT.setSalario(new BigDecimal(5000));
		funcionarioCLT.setTipoContratacao(TipoContratacao.CLT);
		
		Funcionario funcionarioPJ = new Funcionario();
		funcionarioPJ.setNome("Podolski");
		funcionarioPJ.setSalario(new BigDecimal(10000));
		funcionarioPJ.setTipoContratacao(TipoContratacao.PJ);
		
		Funcionario funcionarioESTAGIO = new Funcionario();
		funcionarioESTAGIO.setNome("Osvaldo");
		funcionarioESTAGIO.setSalario(new BigDecimal(1000));
		funcionarioESTAGIO.setTipoContratacao(TipoContratacao.ESTAGIO);
		
		reajusteAnualSalario.calculoReajusteAnual(funcionarioCLT);
		reajusteAnualSalario.calculoReajusteAnual(funcionarioPJ);
		reajusteAnualSalario.calculoReajusteAnual(funcionarioESTAGIO);
		
		System.out.println(funcionarioCLT);
	}

}
