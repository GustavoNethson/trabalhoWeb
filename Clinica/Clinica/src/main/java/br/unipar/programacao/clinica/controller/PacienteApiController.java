package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Paciente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteApiController {

    private final PacienteServico pacienteServico;

    public PacienteApiController(PacienteServico servico) {
        this.pacienteServico = servico;
    }

    @GetMapping(path = "/api/pacientes")
    public ResponseEntity<List<Paciente>> getAll() {
        return ResponseEntity.ok(this.pacienteServico.getAll());
    }

    @PostMapping(path = "/api/pacientes")
    public ResponseEntity<Paciente> save(@RequestBody Paciente paciente) {
        return new ResponseEntity;ok(this.pacienteServico.save(usuario));
    }

}
