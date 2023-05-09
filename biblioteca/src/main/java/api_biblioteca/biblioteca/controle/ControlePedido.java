package api_biblioteca.biblioteca.controle;

import java.util.List;
import java.util.Optional;

//import org.apache.commons.lang3.ObjectUtils.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/getPedido/{idpedido}")
    public Optional<Pedido> GetrUsuarioLogin(@PathVariable Integer idpedido){
        return RepositorioPedido.findById(idpedido);
    }

    @DeleteMapping("delPedido/{idPedido}")
    public void excluir(@PathVariable Integer idPedido){
        RepositorioPedido.deleteById(idPedido); 
    }

    @PutMapping("/putPedido")
    public void alterar(@RequestBody Pedido pedido){
        if(pedido.getIdPedido() >= 0){
            RepositorioPedido.save(pedido);
        }
    }

    @PostMapping("/postPedido")
    public Pedido CadastroProfessor(@RequestBody Pedido pedido){
        return RepositorioPedido.save(pedido);
    }
}