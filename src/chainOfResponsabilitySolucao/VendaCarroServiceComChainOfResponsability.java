package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;

public class VendaCarroServiceComChainOfResponsability {
	
	public BigDecimal calculaValorVenda(Carro carro) {
		
		CarroDesconto desconto = new CarroDescontoFiat(new CarroDescontoFord(new CarroDescontoValorMaiorCemMil(new CarroSemDesconto(null))));
		
		return desconto.aplicaDesconto(carro);
	}

}
