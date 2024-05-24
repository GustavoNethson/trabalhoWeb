package br.unipar.programacao.clinica.service;

import br.unipar.programacao.clinica.model.Usuario;
import br.unipar.programacao.clinica.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAll(){
        return this.usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public Usuario findByLoginSenha(String username, String password) {
        return this.usuarioRepository.findByLoginSenha(username, password);
    }
}
