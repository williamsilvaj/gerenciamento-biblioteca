package api_biblioteca.biblioteca.api_classes;

//import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;*/
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

	public Integer getIdObra() {
		return idObra;
	}

	public void setIdObra(Integer idObra) {
		this.idObra = idObra;
	}

	public String getPrimeiroNomeAutor() {
		return primeiroNomeAutor;
	}

	public void setPrimeiroNomeAutor(String primeiroNomeAutor) {
		this.primeiroNomeAutor = primeiroNomeAutor;
	}

	public String getSobrenomeAutor() {
		return sobrenomeAutor;
	}

	public void setSobrenomeAutor(String sobrenomeAutor) {
		this.sobrenomeAutor = sobrenomeAutor;
	}

	public String getTituloObra() {
		return tituloObra;
	}

	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}

	public String getBibliotecarioUsuarioLogin() {
		return bibliotecarioUsuarioLogin;
	}

	public void setBibliotecarioUsuarioLogin(String bibliotecarioUsuarioLogin) {
		this.bibliotecarioUsuarioLogin = bibliotecarioUsuarioLogin;
	}
	
	/*@ManyToOne
	private Bibliotecario bibliotecario;*/

}