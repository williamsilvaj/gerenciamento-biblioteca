package api_biblioteca.biblioteca.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_biblioteca.biblioteca.api_classes.Professor;
import api_biblioteca.biblioteca.repositorio.RepositorioProfessor;

@RestController
@RequestMapping("/professor")
public class ControleProfessor {
    
    @Autowired
    private RepositorioProfessor RepositorioProf;

    @GetMapping("/listarProf")
    public List<Professor> Listar(){
        return RepositorioProf.findAll();
    }

    @PostMapping("/cadastrarProf")
    public Professor CadastroProfessor(@RequestBody Professor prof){
        return RepositorioProf.save(prof);
    }
}
