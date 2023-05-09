package api_biblioteca.biblioteca.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import api_biblioteca.biblioteca.api_classes.Pedido;

public interface RepositorioPedido extends CrudRepository<Pedido, Integer>{
   List<Pedido> findAll();
    
    /*Pedido findByIdpedido(Integer idPedido);*/
}

