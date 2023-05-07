package api_biblioteca.biblioteca.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api_biblioteca.biblioteca.api_classes.Pedido;
import api_biblioteca.biblioteca.repositorio.RepositorioPedido;


@RestController
public class ControlePedido{
    
    @Autowired
    private RepositorioPedido RepositorioPedido;

    @GetMapping("/getPedido")
    public List<Pedido> Listar(){
        return RepositorioPedido.findAll();
    }

    @PostMapping("/postPedido")
    public Pedido CadastroProfessor(@RequestBody Pedido pedido){
        return RepositorioPedido.save(pedido);
    }
}