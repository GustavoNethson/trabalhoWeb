package br.unipar.programacao.clinica.repository;

import br.unipar.programacao.clinica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

   Usuario findByLoginSenha(String stLoginUsu, String stSenhaUsu);

}
