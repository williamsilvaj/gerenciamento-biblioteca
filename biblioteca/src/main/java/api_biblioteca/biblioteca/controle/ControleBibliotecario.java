package api_biblioteca.biblioteca.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api_biblioteca.biblioteca.api_classes.Bibliotecario;
import api_biblioteca.biblioteca.repositorio.RepositorioBibliotecario;

@RestController
public class ControleBibliotecario {

	@Autowired
	private RepositorioBibliotecario repBi;

	@GetMapping("/getBi")
	public List<Bibliotecario> listar() {
		return (List<Bibliotecario>) repBi.findAll();
	}

	@PostMapping("/postBi")
	public Bibliotecario cadastra(@RequestBody Bibliotecario bi) {
		return repBi.save(bi);
	}

}
