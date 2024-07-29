package strategyProblema;

import java.math.BigDecimal;

public class ReajusteAnualSalario {
	
	public void calculoReajusteAnual(Funcionario funcionario) {
		if(TipoContratacao.CLT.name().equals(funcionario.getTipoContratacao().name())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
		}
		
		else if(TipoContratacao.PJ.equals(funcionario.getTipoContratacao())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
		}
		else if(TipoContratacao.ESTAGIO.equals(funcionario.getTipoContratacao())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
		}
	}

}
