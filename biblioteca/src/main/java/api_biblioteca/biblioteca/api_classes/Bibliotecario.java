package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bibliotecario")
public class Bibliotecario {

	@Id @Column(name = "cpf_bibli")
	private String cpf;
	@Column(name = "status")
	private int status;
	@OneToOne
	@JoinColumn(name = "usuario_login", referencedColumnName = "login")
	private Usuario usuarioBibliotecario;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Usuario getUsuarioBibliotecario() {
		return usuarioBibliotecario;
	}
	public void setUsuarioBibliotecario(Usuario usuarioBibliotecario) {
		this.usuarioBibliotecario = usuarioBibliotecario;
	}
}
