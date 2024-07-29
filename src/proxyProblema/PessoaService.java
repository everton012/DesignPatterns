package proxyProblema;

import Builder.Pessoa;
import proxySolucao.ProxyPessoa;

public class PessoaService {
	private ProxyPessoa proxyPessoa;
	
	public PessoaService(ProxyPessoa proxyPessoa) {
		this.proxyPessoa = proxyPessoa;
	}
	
	public void save(Pessoa pessoa) {
		proxyPessoa.save(pessoa);
	}
	
	public Pessoa findById(Long id) {
		return proxyPessoa.findById(id);
	}

}
