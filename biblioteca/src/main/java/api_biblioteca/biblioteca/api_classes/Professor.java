package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor{
    @Id @Column(name = "professor_mat")
    private String professorMat;
    @Column(name = "cpf_prof")
    private String cpfProf;
    @Column(name = "status")
    private int status;
    @OneToOne
    @JoinColumn(name = "usuario_login", referencedColumnName = "login")
    private Usuario usuario;
  
    public Usuario getUsuario() {
      return usuario;
    }

    public String getProfessorMat() {
      return professorMat;
    }
  
    public void setProfessorMat(String professorMat) {
      this.professorMat = professorMat;
    }
  
    public String getCpfProf() {
      return cpfProf;
    }
  
    public void setCpfProf(String cpfProf) {
      this.cpfProf = cpfProf;
    }
  
    public int getStatus() {
      return status;
    }
  
    public void setStatus(int status) {
      this.status = status;
    }
  
    /*public String getUsuarioLogin() {
      return usuarioLogin;
    }
  
    public void setUsuarioLogin(String usuarioLogin) {
      this.usuarioLogin = usuarioLogin;
    }*/
  
  }
