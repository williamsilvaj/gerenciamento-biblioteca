package api_biblioteca.biblioteca.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Usuario;

public interface RepositorioUsuario extends CrudRepository<Usuario, String>{
    List<Usuario> findAll();
    
    Usuario findByLogin(String login);
}
