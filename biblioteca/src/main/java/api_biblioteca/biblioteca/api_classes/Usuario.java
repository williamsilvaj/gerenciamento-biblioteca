package api_biblioteca.biblioteca.api_classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")//nome da tabela no banco
public class Usuario {

    @Id @Column(name = "login") //nome das tabelas no banco
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "primeiro_nome")
    private String primeiroNome;
    
    @Column(name = "sobrenome")
    private String sobrenome;
  
  
    public String getLogin() {
      return login;
    }
  
    public void setLogin(String login) {
      this.login = login;
    }
  
    public String getSenha() {
      return senha;
    }
  
    public void setSenha(String senha) {
      this.senha = senha;
    }
  
    public String getprimeiroNome() {
      return primeiroNome;
    }
  
    public void setprimeiroNome(String primeiroNome) {
      this.primeiroNome = primeiroNome;
    }
  
    public String getSobrenome() {
      return sobrenome;
    }
  
    public void setSobrenome(String sobrenome) {
      this.sobrenome = sobrenome;
    }
  
  }