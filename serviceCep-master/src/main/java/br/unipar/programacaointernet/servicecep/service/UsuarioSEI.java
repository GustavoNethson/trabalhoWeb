package br.unipar.programacaointernet.servicecep.service;


import br.unipar.programacaointernet.servicecep.model.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface UsuarioSEI {

    @WebMethod
    String boasVindas(@WebParam(name = "nome") String nome);

    void salvarUsuario(@WebParam(name = "nome") String nome,
                       @WebParam(name = "login") String login,
                       @WebParam(name = "senha") String senha);

    void editarUsuario(@WebParam(name = "id") Integer id,
                       @WebParam(name = "nome") String nome,
                       @WebParam(name = "login") String login,
                       @WebParam(name = "senha") String senha);

    Usuario consultaUsuarioPorId(@WebParam(name = "idUsuario")long id);

    @WebMethod
    Usuario consultaUsuario(@WebParam(name = "idUsuario") Long idUsuario);

}
