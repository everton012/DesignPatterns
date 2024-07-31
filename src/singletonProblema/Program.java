package singletonProblema;

public class Program {

	public static void main(String[] args) {
		reservaDia("Sexta");
		reservaDia("Sabado");

	}
	
	public static void reservaDia(String dia) {
		Agenda agenda = new Agenda();
		agenda.ocupa(dia);
		System.out.println(agenda.getDiasDisponiveis());
	}

}
