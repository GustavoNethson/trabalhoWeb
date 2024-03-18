package br.unipar.programacaointernet.servicecep.service;

import br.unipar.programacaointernet.servicecep.dao.UsuarioDAO;
import br.unipar.programacaointernet.servicecep.dao.UsuarioDAOImpl;
import br.unipar.programacaointernet.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.util.EntityManagerUtil;
import jakarta.jws.WebService;

@WebService(endpointInterface = "br.unipar.programacaointernet.servicecep.service.UsuarioSEI")
public class UsuarioSIB implements UsuarioSEI {
    @Override
    public String boasVindas(String nome) {
        return "Bem Vindo(a) " + nome + "!";
    }

    @Override
    public Usuario consultaUsuario(Long id) {
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(EntityManagerUtil
                .getManager());

        return usuarioDAO.findById(id);
    }

    public void deletaUsuario(Long Id){


    };


}