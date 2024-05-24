package br.unipar.programacao.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendarConsultaWebController {

    AtendimentoService atendimentoService;

    @GetMapping("/AgendarConsulta")
    public String AgendarConsulta() {
        return "AgendarConsulta";
    }

}
