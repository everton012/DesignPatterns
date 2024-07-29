package prototype;

import java.util.HashMap;
import java.util.Map;

//O problema que o Prototype resolve é o fato de, precisarmos de várias instancia de um objeto, e para isso precisamos criar vários 
// objetos, ex: botaoAzul, Vermelho, rosa, etc.
// Para não precisar ficar criando vários subobjetos nós usamos o Pattern Prototype.


public class BotaoRegistry {
	
	private static Map<String, Botao> REGISTRY = new HashMap<>();
	
	static {
		Botao botaoAmarelo = new Botao();
		botaoAmarelo.setCor("Amarelo");
		botaoAmarelo.setAltura(40);
		botaoAmarelo.setLargura(100);
		botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
		
		Botao botaoAzul = new Botao();
		botaoAzul.setCor("Azul");
		botaoAzul.setAltura(35);
		botaoAzul.setLargura(125);
		botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
		
		Botao botaoVermelho = new Botao();
		botaoVermelho.setCor("Vermelho");
		botaoVermelho.setAltura(30);
		botaoVermelho.setLargura(100);
		botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);
		
		REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
		REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
		REGISTRY.put("BOTAO_AZUL", botaoAzul);
		
	}
	
	public static Botao getBotao(String chave) {
		return BotaoFactory.getInstance(REGISTRY.get(chave));
	}
	
}
