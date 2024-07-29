package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;

public class CarroDescontoValorMaiorCemMil extends CarroDesconto {
	
	public CarroDescontoValorMaiorCemMil(CarroDesconto proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		
		if(carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
			return valorVenda.subtract(new BigDecimal(10000));
		}
		
		return proximoDesconto.aplicaDesconto(carro);
	}

	

}
