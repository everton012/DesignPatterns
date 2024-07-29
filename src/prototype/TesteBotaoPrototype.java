package prototype;

public class TesteBotaoPrototype {

	public static void main(String[] args) {
		Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
		
		System.out.println(botaoVermelho);

	}

}
