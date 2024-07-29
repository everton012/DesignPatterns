package proxySolucao;

import java.time.LocalDate;

import Builder.Pessoa;
import proxyProblema.PessoaService;

public class TestePessoaComProxy {

	public static void main(String[] args) {
		PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
		NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
		PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.name("Everton")
				.lastname("Clemente")
				.dataNascimento(LocalDate.of(1994, 3, 11))
				.document("36498901861")
				.email("everton@gmail.com")
				.build();
		pessoaService.save(pessoa);
		
		Pessoa pessoaRetornada = pessoaService.findById(1L);
		System.out.println(pessoaRetornada);
		
		Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
		System.out.println(pessoaRetornadaCache);
		

	}

}
