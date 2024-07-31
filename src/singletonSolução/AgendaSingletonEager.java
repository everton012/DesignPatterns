package singletonSolução;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEager {
	
	private static final AgendaSingletonEager INSTANCE = new AgendaSingletonEager();
	
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonEager() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda", Boolean.TRUE);
		diasDisponiveis.put("Terça", Boolean.TRUE);
		diasDisponiveis.put("Quarta", Boolean.TRUE);
		diasDisponiveis.put("Quinta", Boolean.TRUE);
		diasDisponiveis.put("Sexta", Boolean.TRUE);
		diasDisponiveis.put("Sabado", Boolean.TRUE);	
	}
	
	public static AgendaSingletonEager getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Boolean> getDiasDisponiveis(){
		return diasDisponiveis;
	}
	
	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}

}
