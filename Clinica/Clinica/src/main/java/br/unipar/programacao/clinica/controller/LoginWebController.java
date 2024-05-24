package br.unipar.programacao.clinica.controller;

import br.unipar.programacao.clinica.model.Usuario;
import br.unipar.programacao.clinica.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginWebController {

    UsuarioService usuarioService;

    @GetMapping("/login")
    public String loginForm() {
        return "Login"; //Retorna a página de login (login.html)
    }

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/bemvindo")
    public String bemvindo() {
        return "AgendarConsulta";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession session, Model model) {
        Usuario login = usuarioService.findByLoginSenha(username, password);
        if (username.equals("paulobrificado") && password.equals("sim")) {
            if (login.getBoAdminUsu().equals(true)) {
                session.setAttribute("login", username);
                return "redirect:/bemvindo";
            } return "login";
        } else {
            model.addAttribute("erro", "Usuário ou senha inválidos");
            return "username";
        }

    }

}
