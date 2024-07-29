package solução;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLazy {
	
	private static AgendaSingletonLazy INSTANCE = null;
	
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonLazy() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);	
	}
	//A vantagem de usar o método Lazy é que só vai ser instanciado a classe se o método get for chamado.
	//Dessa forma se ninguém chamar, não vai haver classe aberta sem precisão.
	public static AgendaSingletonLazy getInstance() {
		if(Objects.isNull(INSTANCE)) {
			INSTANCE = new AgendaSingletonLazy();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	public Map<String, Boolean> getDiasDisponiveis(){
		return diasDisponiveis;
	}
	
	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}

}
