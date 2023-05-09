package api_biblioteca.biblioteca.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Professor;

public interface RepositorioProfessor extends CrudRepository<Professor, String>{
    List<Professor> findAll();
    
    /*Professor findByLoginProf(String login);*/
}
