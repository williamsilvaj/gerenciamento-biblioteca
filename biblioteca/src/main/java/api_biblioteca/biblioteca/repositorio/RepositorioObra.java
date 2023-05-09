package api_biblioteca.biblioteca.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Obra;

public interface RepositorioObra extends CrudRepository<Obra, Integer> {
    List<Obra> findAll();
    
    /*Obra findByIdObra(Integer idObra);*/
}
