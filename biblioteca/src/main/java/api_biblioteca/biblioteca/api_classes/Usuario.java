package api_biblioteca.biblioteca.api_classes;

public class Usuario {
    private String login;
    private String senha;
    private String primeiroNome;
    private String sobrenome;
  
    public Usuario(String login, String senha, String primeiroNome, String sobrenome) {
      this.login = login;
      this.senha = senha;
      this.primeiroNome = primeiroNome;
      this.sobrenome = sobrenome;
    }
  
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
  
    public String getPrimeiroNome() {
      return primeiroNome;
    }
  
    public void setPrimeiroNome(String primeiroNome) {
      this.primeiroNome = primeiroNome;
    }
  
    public String getSobrenome() {
      return sobrenome;
    }
  
    public void setSobrenome(String sobrenome) {
      this.sobrenome = sobrenome;
    }
  
  }