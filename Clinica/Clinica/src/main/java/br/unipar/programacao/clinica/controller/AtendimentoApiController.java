package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Atendimento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtendimentoApiController {

    private final AtendimentoService atendimentoService;

    public AtendimentoApiController(AtendimentoService service) {
        this.atendimentoService = service;
    }

    @GetMapping(path = "/api/atendimentos")
    public ResponseEntity<List<Atendimento>> getAll() {
        return ResponseEntity.ok(this.atendimentoService.getAll());
    }

    @PostMapping(path = "/api/atendimentos")
    public ResponseEntity<Atendimento> save(@RequestBody Atendimento atendimento) {
        return ResponseEntity.ok(this.atendimentoService.save(atendimento));
    }

}
