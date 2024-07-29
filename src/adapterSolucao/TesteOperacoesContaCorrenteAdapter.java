package adapterSolucao;

import java.math.BigDecimal;

import adapterProblema.JarOperacoesContaCorrente;

public class TesteOperacoesContaCorrenteAdapter {

	public static void main(String[] args) {
		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
		JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
		ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);
		
		BigDecimal valorPretendidoSaque = new BigDecimal(1000);
		
		client.saca(valorPretendidoSaque);
		client.deposita(new BigDecimal(500));
	}

}
