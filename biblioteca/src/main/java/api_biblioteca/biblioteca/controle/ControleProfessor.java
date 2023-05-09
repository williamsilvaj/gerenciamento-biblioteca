package api_biblioteca.biblioteca.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api_biblioteca.biblioteca.api_classes.Professor;
import api_biblioteca.biblioteca.repositorio.RepositorioProfessor;

@RestController

public class ControleProfessor {
    
    @Autowired
    private RepositorioProfessor RepositorioProf;

    @GetMapping("/getProf")
    public List<Professor> Listar(){
        return RepositorioProf.findAll();
    }

    @GetMapping("/getProf/{matricula}")
    public Optional<Professor> GetProfessorLogin(@PathVariable String matricula){
        return RepositorioProf.findById(matricula);
    }

    @DeleteMapping("delProf/{login}")
    public void excluir(@PathVariable String login){
        RepositorioProf.deleteById(login); 
    }

    @PutMapping("/putProf")
    public void alterar(@RequestBody Professor professor){
        if(professor.getProfessorMat() != ""){
            RepositorioProf.save(professor);
        }
    }
    
    @PostMapping("/postProf")
    public Professor CadastroProfessor(@RequestBody Professor prof){
        return RepositorioProf.save(prof);
    }
}
