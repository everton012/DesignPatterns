package solução;

public class ProgramComSingleton {

	public static void main(String[] args) {
		/*reservaDiaEager("Sexta");
		reservaDiaEager("Sabado");*/
		
		/*reservaDiaLazy("Sexta");
		reservaDiaLazy("Sabado");*/
		
		reservaDiaEnum("Sexta");
		reservaDiaEnum("Sabado");
	}
	
	public static void reservaDiaEager(String dia) {
		AgendaSingletonEager agenda = AgendaSingletonEager.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDiasDisponiveis());
	}
	
	
	public static void reservaDiaLazy(String dia) {
		AgendaSingletonLazy agenda = AgendaSingletonLazy.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDiasDisponiveis());
	}
	
	public static void reservaDiaEnum(String dia) {
		AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDiasDisponiveis());
	}
}
