package api_biblioteca.biblioteca.repositorio;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Obra;

public interface RepositorioObra extends CrudRepository<Obra, Integer> {

}
