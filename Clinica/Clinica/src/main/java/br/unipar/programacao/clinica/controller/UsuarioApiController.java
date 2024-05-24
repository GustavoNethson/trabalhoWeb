package br.unipar.programacao.clinica.controller;


import br.unipar.programacao.clinica.model.Usuario;
import br.unipar.programacao.clinica.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
public class UsuarioApiController {

    private final UsuarioService usuarioService;

    public UsuarioApiController(UsuarioService service) {
        this.usuarioService = service;
    }

    @GetMapping(path = "/api/usuarios")
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.ok(this.usuarioService.getAll());
    }

    @PostMapping(path = "/api/usuarios")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.ok(this.usuarioService.save(usuario));
    }
}
