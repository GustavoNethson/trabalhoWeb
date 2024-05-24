package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicoApiController {

    private final MedicoServico medicoServico;

    public MedicoApiController(MedicoServico servico) {
        this.medicoServico = servico;
    }

    @GetMapping(path = "/api/medicos")
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok(this.medicoServico.getall());
    }

    @PostMapping(path = "/api/medicos")
    public ResponseEntity<Medico> save(@RequestBody Medico medico) {
        return ResponseEntity.ok(this.medicoServico.save(medico));
    }

}
