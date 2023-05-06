package api_biblioteca.biblioteca.controle;

import api_biblioteca.biblioteca.api_classes.Usuario;
//import api_biblioteca.biblioteca.repositorio.RepositorioUsuario;
import api_biblioteca.biblioteca.repositorio.RepositorioUsuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControleUsuario {

    @Autowired 
    private RepositorioUsuario RepositorioUsu;

    @PostMapping("/usuarioCadastro")
    public Usuario CadastroUsuario(@RequestBody Usuario user){
        return RepositorioUsu.save(user);
    }

    @GetMapping("/usuarioCadastro")
    public List<Usuario> Selecionar(){
        return RepositorioUsu.findAll();
    }

}
