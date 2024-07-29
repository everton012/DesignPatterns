package templateMethodSolucao;

import templateMethodProblema.VeiculoParaReparo;

public class ReparaVeiculoLuxoServiceComTemplateMethod extends ReparoVeiculoService {
	
	private VeiculoParaReparo veiculoParaReparo;
	
	public ReparaVeiculoLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 50;		
	}
	
}
