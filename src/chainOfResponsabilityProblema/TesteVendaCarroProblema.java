package chainOfResponsabilityProblema;

import java.math.BigDecimal;

public class TesteVendaCarroProblema {

	public static void main(String[] args) {
		VendaCarroService vendaCarroService = new VendaCarroService();
		
		Carro carro1 = new Carro();
		carro1.setMarca(Marca.FORD);
		carro1.setModelo("Fusion");
		carro1.setPreco(new BigDecimal(90000));
		
		BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
		System.out.println(valorVenda1);

	}

}
