package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;
import chainOfResponsabilityProblema.Marca;

public class CarroDescontoFiat extends CarroDesconto {
	
	public CarroDescontoFiat(CarroDesconto proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		
		if(Marca.FIAT.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(1000));
		}
		
		return proximoDesconto.aplicaDesconto(carro);
	}

	

}
