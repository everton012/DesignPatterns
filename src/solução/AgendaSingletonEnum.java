//Esse é o método mais correto pois ele não permite nenhum tipo de alteração no construtor.
//Dessa forma nós garantimos que somente haverá uma instancia.

package solução;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum AgendaSingletonEnum {
	
	INSTANCE;
	
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonEnum() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);	
	}

	public static AgendaSingletonEnum getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Boolean> getDiasDisponiveis(){
		return diasDisponiveis;
	}
	
	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}

}
