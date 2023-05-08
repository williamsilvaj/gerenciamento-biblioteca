package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "bibliotecario")
public class Bibliotecario {

	@Id
	@JoinColumn(name = "usuario_login", referencedColumnName = "login")
	private Usuario usuarioBibliotecario;

	@Column(name = "cpf_bibli")
	private String cpf;

	@Column(name = "status")
	private int status;
}
