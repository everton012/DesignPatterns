package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;

public abstract class CarroDesconto {
	
	protected CarroDesconto proximoDesconto;
	
	public CarroDesconto(CarroDesconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
	
	public abstract BigDecimal aplicaDesconto(Carro carro);
}
