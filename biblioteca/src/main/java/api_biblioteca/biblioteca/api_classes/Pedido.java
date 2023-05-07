package api_biblioteca.biblioteca.api_classes;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "pedido")
public class Pedido{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedido")
    private int idPedido; 

    @Column(name = "mat_professor")
    private String matProfessor;

    @Temporal(TemporalType.TIMESTAMP)  
    @Column(name = "data_pedido")   
    private Date dataPedido = new java.sql.Date(System.currentTimeMillis());

    @Column(name = "status")
    private int status;

    @Column(name = "titulo_livro")
    private String tituloLivro;

    @Column(name = "edicao")
    private String edicao;

    @Column(name = "professor_usuario_login")
    private String professorUsuarioLogin;

    public int getIdPedido() {
        return idPedido;
    }

            
    public String getMatProfessor() {
        return matProfessor;
    }

    public void setMatProfessor(String matProfessor) {
        this.matProfessor = matProfessor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getEdicao() {
        return edicao;
    }


    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getProfessorUsuarioLogin() {
        return professorUsuarioLogin;
    }


  }
