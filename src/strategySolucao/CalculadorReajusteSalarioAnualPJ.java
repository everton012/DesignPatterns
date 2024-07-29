package strategySolucao;

import java.math.BigDecimal;

import strategyProblema.Funcionario;

public class CalculadorReajusteSalarioAnualPJ implements CalculadorReajusteAnualSalario{

	@Override
	public void calculadorReajusteAnual(Funcionario funcionario) {
		BigDecimal salario = funcionario.getSalario();
		funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
		
	}

}
