package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "obra")
public class Obra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_obra")
	private Integer idObra;

	@Column(name = "primeiro_nome_autor")
	private String primeiroNomeAutor;

	@Column(name = "sobrenome")
	private String sobrenomeAutor;

	@Column(name = "titulo_obra")
	private String tituloObra;

	@Column(name = "bibliotecario_usuario_login")
	private String bibliotecarioUsuarioLogin;
	
	@OneToOne
	@JoinColumn(name = "bibliotecario_usuario_login", referencedColumnName = "usuario_login")
	private Bibliotecario bibliotecario;
	

}