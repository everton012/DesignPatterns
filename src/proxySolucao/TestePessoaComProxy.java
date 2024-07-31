package proxySolucao;

import java.time.LocalDate;

import Builder.Pessoa;
import proxyProblema.PessoaService;

public class TestePessoaComProxy {

	public static void main(String[] args) {
		PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.name("carlos")
				.lastname("Clemente")
				.dataNascimento(LocalDate.of(1999, 3, 11))
				.document("01865765423")
				.email("carlos@gmail.com")
				.build();

		pessoaRepositoryProxy.save(pessoa);
		
		Pessoa pessoaRetornada = pessoaRepositoryProxy.findById(1L);
		System.out.println(pessoaRetornada);
		
	}

}
