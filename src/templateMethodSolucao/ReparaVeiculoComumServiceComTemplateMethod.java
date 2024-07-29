package templateMethodSolucao;

import templateMethodProblema.VeiculoParaReparo;

public class ReparaVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService {
	
	private VeiculoParaReparo veiculoParaReparo;
	
	public ReparaVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 70;		
	}
	
}
