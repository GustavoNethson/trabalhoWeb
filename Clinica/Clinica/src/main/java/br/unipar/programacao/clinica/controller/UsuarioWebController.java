package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Usuario;
import br.unipar.programacao.clinica.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioWebController {

    private UsuarioService usuarioService;

    public UsuarioWebController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(path = "/usuarios")
    public String getAllUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @PostMapping(path = "/usuarios/save")
    public String saveUsuario(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios";
    }
}
