package adapterProblema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

	public static void main(String[] args) {
		
		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
		ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);
		
		BigDecimal valorPretendidoSaque = new BigDecimal(1000);
		
		/*Aqui está o problema do código sem adapter, a validação depende
		 * inteiramente do desenvolvedor criar um If para validar o saldo, se ele se esquecer
		 * todo o código estará comprometido. 
		 */
		if(client.validaSaldo(valorPretendidoSaque)) {
			client.saca(valorPretendidoSaque);
		}
		
		client.deposita(new BigDecimal(500));
		
		
		

	}

}
