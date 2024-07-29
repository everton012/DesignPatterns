package Builder;

import java.time.LocalDate;

public class Pessoa {
	private String name;
	private String lastname;
	private String document;
	private String email;
	private LocalDate dataNascimento;
	
	

	private Pessoa(String name, String lastname, String document, String email, LocalDate dataNascimento) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.document = document;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", lastname=" + lastname + ", document=" + document + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + "]";
	}
	
	static public class PessoaBuilder {
		
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
		
		//Esse método se chama Build por padrão
		public Pessoa build() {
			return new Pessoa(name, lastname, document, email, dataNascimento);
		}

	}

}
