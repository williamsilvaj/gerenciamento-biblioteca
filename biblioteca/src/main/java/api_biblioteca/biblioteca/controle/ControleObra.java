package api_biblioteca.biblioteca.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api_biblioteca.biblioteca.api_classes.Obra;
import api_biblioteca.biblioteca.repositorio.RepositorioObra;

@RestController
public class ControleObra {

	@Autowired
	private RepositorioObra obraRep;

	@GetMapping("/getObra")
	public List<Obra> getObras() {
		return (List<Obra>) obraRep.findAll();
	}
    @GetMapping("/getPedido/{idObra}")
    public Optional<Obra> GetrUsuarioLogin(@PathVariable Integer idObra){
        return obraRep.findById(idObra);
    }

    @PutMapping("/putObra")
    public void alterar(@RequestBody Obra obra){
        if(obra.getIdObra() >= 0){
            obraRep.save(obra);
        }
    }

	@PostMapping("/postObra")
	public Obra obraPost(@RequestBody Obra obra) {
		return obraRep.save(obra);
	}
}
