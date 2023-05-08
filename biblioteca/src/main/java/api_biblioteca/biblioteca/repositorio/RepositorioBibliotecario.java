package api_biblioteca.biblioteca.repositorio;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Bibliotecario;
import api_biblioteca.biblioteca.api_classes.Usuario;

public interface RepositorioBibliotecario extends CrudRepository<Bibliotecario, Usuario> {

}
