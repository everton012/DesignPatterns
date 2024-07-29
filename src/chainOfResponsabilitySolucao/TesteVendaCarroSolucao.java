package chainOfResponsabilitySolucao;

import java.math.BigDecimal;

import chainOfResponsabilityProblema.Carro;
import chainOfResponsabilityProblema.Marca;

public class TesteVendaCarroSolucao {

	public static void main(String[] args) {
		VendaCarroServiceComChainOfResponsability vendaCarroService = new VendaCarroServiceComChainOfResponsability();
		
		Carro carro1 = new Carro();
		carro1.setMarca(Marca.FORD);
		carro1.setModelo("Fusion");
		carro1.setPreco(new BigDecimal(90000));
		
		BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
		System.out.println(valorVenda1);

	}

}
