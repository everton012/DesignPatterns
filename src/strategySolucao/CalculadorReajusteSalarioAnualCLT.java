package strategySolucao;

import java.math.BigDecimal;

import strategyProblema.Funcionario;

public class CalculadorReajusteSalarioAnualCLT implements CalculadorReajusteAnualSalario {

	@Override
	public void calculadorReajusteAnual(Funcionario funcionario) {
		BigDecimal salario = funcionario.getSalario();
		funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
	}
	
}
