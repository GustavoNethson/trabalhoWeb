package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Medico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicoWebController {

    private MedicoServico medicoServico;

    public MedicoWebController(MedicoServico medicoServico) {
        this.medicoServico = medicoServico;
    }

    @GetMapping(path = "/medicos")
    public String medicos(Model model) {
        List<Medico> medicos = medicoServico.getall();
        model.addAttribute("medicos", medicos);
        return "medicos";
    }

    @PostMapping(path = "/medicos/save")
    public String saveMedico(Medico medico) {
        medicoServico.save(medico);
        return "redirect:/medicos";
    }
}
