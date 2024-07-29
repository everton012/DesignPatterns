package Builder;

import java.time.LocalDate;

public class PessoaBuilder {
	
	private String name;
	private String lastname;
	private String document;
	private String email;
	private LocalDate dataNascimento;

	public PessoaBuilder name(String name) {
		this.name = name;
		return this;
	}

	public PessoaBuilder lastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public PessoaBuilder document(String document) {
		this.document = document;
		return this;
	}
	
	public PessoaBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}
	
	/*public Pessoa criaPessoa() {
		return new Pessoa(name, lastname, document, email, dataNascimento);
	}*/

}
