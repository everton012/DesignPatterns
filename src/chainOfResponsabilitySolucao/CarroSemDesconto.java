package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;

public class CarroSemDesconto extends CarroDesconto {
	
	public CarroSemDesconto(CarroDesconto proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		return BigDecimal.ZERO;
	}

	

}
