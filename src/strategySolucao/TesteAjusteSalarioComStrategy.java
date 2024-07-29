//Benefícios
//Na hora que surgir uma nova regra de negócio não é preciso mudar o método.
// basta criar uma nova classe com esse novo objeto.

package strategySolucao;

import java.math.BigDecimal;

import strategyProblema.Funcionario;
import strategyProblema.ReajusteAnualSalario;
import strategyProblema.TipoContratacao;

public class TesteAjusteSalarioComStrategy {

	public static void main(String[] args) {
		ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
		
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
		
		reajusteAnualSalario.calculoReajusteAnual(funcionarioCLT, new CalculadorReajusteSalarioAnualCLT());
		reajusteAnualSalario.calculoReajusteAnual(funcionarioPJ, new CalculadorReajusteSalarioAnualPJ());
		reajusteAnualSalario.calculoReajusteAnual(funcionarioESTAGIO, new CalculadorReajusteSalarioAnualESTAGIO());
		
		System.out.println(funcionarioCLT);
		System.out.println(funcionarioPJ);
		System.out.println(funcionarioESTAGIO
				);

	}

}
