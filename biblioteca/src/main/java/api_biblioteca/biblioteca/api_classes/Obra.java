package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Column(name = "sobrenome_autor")
    private String sobrenomeAutor;

    @Column(name = "titulo_obra")
    private String tituloObra;

    @Column(name = "bibliotecario_usuario_login")
    private String bibliotecarioUsuarioLogin;
  
    public String getPrimeiroNomeAutor() {
        return primeiroNomeAutor;
    }
    public void setPrimeiroNomeAutor(String primeiroNomeAutor) {
        this.primeiroNomeAutor = primeiroNomeAutor;
    }
    public String getSobrenomeAutor() {
        return sobrenomeAutor;
    }
    public void setSobrenome(String sobrenomeAutor) {
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

    public int getIdObra() {
        return idObra;
    }
    
  }