package templateMethodSolucao;

import templateMethodProblema.VeiculoParaReparo;

public class TesteReparaVeiculoComTemplate {

	public static void main(String[] args) {
		
		System.out.println("------------------LUXO-------------------");

		
		VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
		
		veiculoDeLuxo.setPorcentagemDano(49);
		
		ReparoVeiculoService rpl = new ReparaVeiculoLuxoServiceComTemplateMethod(veiculoDeLuxo);
		
		rpl.reparaVeiculo();
		
		System.out.println("------------------COMUM-------------------");
		
		VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
		
		veiculoComum.setPorcentagemDano(71);
		
		ReparoVeiculoService rpc = new ReparaVeiculoComumServiceComTemplateMethod(veiculoComum);
		
		rpc.reparaVeiculo();
		
	}

}
