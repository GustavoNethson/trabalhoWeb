package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteWebController {
/*
    private PacienteServico pacienteServico;

    public PacienteWebController(PacienteServico pacienteServico) {
        this.pacienteServico = pacienteServico;

    }

    @GetMapping(path = "/Pacientes")
    public String Pacientes(Model model) {
        List<Paciente> paciente = pacienteServico.getAll();
        model.addAttribute("paciente", paciente);
        return "pacientes";
    }

    @PostMapping(path = "/pacientes/save")
    public String savePaciente(Paciente paciente) {
        pacienteServico.save(paciente);
        return "redirect:/pacientes";
    }

 */
}
