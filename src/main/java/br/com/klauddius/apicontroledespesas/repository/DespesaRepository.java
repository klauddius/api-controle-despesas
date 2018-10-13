package br.com.klauddius.apicontroledespesas.repository;

import br.com.klauddius.apicontroledespesas.model.Despesa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DespesaRepository extends MongoRepository<Despesa, String> {

}
