package templateMethodSolucao;

public abstract class ReparoVeiculoService {
	
	public void reparaVeiculo() {
		entradaOficina();
		analisarDanos();
		if(veiculoParaReparo()) {
			repararVeiculo();
			notificarReparoParaSeguradora();
		}
		else {
			notificarPerdaTotalParaSeguradora();
		}
	}
	//O fato desse método ser abstrato obriga as classes filhas implementarem a lógica desse método nelas mesmas.
	//Outra coisa se os métodos forem protected eles também podem ser sobrescritos pelas filhas.
	protected abstract boolean veiculoParaReparo();
	
	private void notificarPerdaTotalParaSeguradora() {
		System.out.println("notificando perda total para seguradora...");
	}
	
	private void notificarReparoParaSeguradora() {
		System.out.println("notificando reparo para seguradora...");
	}
	
	private void repararVeiculo() {
		System.out.println("Reparando veiculo...");
	}
	
	private void analisarDanos() {
		System.out.println("Analisando danos...");
	}
	
	private void entradaOficina() {
		System.out.println("Veículo entrando oficina..");
	}

}
