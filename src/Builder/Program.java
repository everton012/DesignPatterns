package Builder;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		
		// Utilizar o Builder como patter ajuda a lembrar/saber quais os atributos a que se refere os dados.
		// Como também podemos escrever fora de ordem, não precisa ser na sequencia.
		Pessoa pessoa = new Pessoa.PessoaBuilder().name("Carlos").lastname("Clemente").document("01865765423").email("carlos@gmail.com")
				.dataNascimento(LocalDate.of(1995, 03, 11)).build();
		
		System.out.println(pessoa);

	}

}
