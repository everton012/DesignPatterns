package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;
import chainOfResponsabilityProblema.Marca;

public class CarroDescontoFord extends CarroDesconto {
	
	public CarroDescontoFord(CarroDesconto proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		
		if(Marca.FORD.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(2000));
		}
		
		return proximoDesconto.aplicaDesconto(carro);
	}

	

}
