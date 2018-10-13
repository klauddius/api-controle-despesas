package br.com.klauddius.apicontroledespesas.service;

import br.com.klauddius.apicontroledespesas.model.Despesa;
import br.com.klauddius.apicontroledespesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    @PostMapping("/despesa")
    public ResponseEntity<Despesa> adicionarDespesa(@RequestBody Despesa despesa) {
        despesaRepository.insert(despesa);
        return ResponseEntity.ok().build();
    }
}
