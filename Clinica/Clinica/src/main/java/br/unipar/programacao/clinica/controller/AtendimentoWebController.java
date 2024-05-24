package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Atendimento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AtendimentoWebController {

   private AtendimentoService atendimentoService;

   public AtendimentoWebController(AtendimentoService atendimentoService) {
       this.atendimentoService = atendimentoService;
   }

   @GetMapping(path = "/atendimentos")
    public String getAllAtendimentos(Model model) {
       List<Atendimento> atendimento = atendimentoService.getAll();
       model.addAttribute("atendimentos", atendimento);
       return "atendimento";
   }

   @PostMapping(path = "/atendimentos/save")
    public String saveAtendimento(Atendimento atendimento) {
       atendimentoService.save(atendimento);
       return "redirect:/atendimentos";
   }

}
