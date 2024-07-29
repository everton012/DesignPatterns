package proxySolucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import Builder.Pessoa;
import proxyProblema.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa{
	
	private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
	
	private Map<Long, Pessoa> cache = new HashMap<>();
	
	@Override
	public void save(Pessoa pessoa) {
		log.info("Iniciando chamada do metodo save... ");
		super.save(pessoa);
		log.info("Chamada do metodo save finalizada.");
	}
	
	public Pessoa findById(Long id) {
		log.info("Iniciando chamada do metodo findById... ");
		Long inicio = System.currentTimeMillis();
		Pessoa pessoa = null;
		
		if(Objects.nonNull(cache.get(id))) {
			log.info("Está pegando do cache... ");
			pessoa = cache.get(id);
		}
		else {
			log.info("Está pegando do PessoaRepository... ");
			pessoa = super.findById(id);
			cache.put(id, pessoa);
		}
		
	    log.info("Chamada do metodo findById finalizada.");
	    Long fim = System.currentTimeMillis();
	    log.info("Tempo gasto na chamada.. " + (fim - inicio) );
	    return pessoa;
	}
	
	

}
