# gerenciamento-biblioteca

Atualmente, fazer o gerenciamento de alguns serviços pode ser um desafio complexo e demorado. Não distante de nossa realidade como aluno, não é difícil de perceber a importância de se ter acesso a livros, com a Biblioteca Central da UFS (BICEN),  se tornou mais fácil e simples a aquisição de livros. Pensando nisso, para facilitar os processos descritos acima e inspirado no sistema já implementado (Pergamum - UFS), foi pensado uma API para fazer o cadastro de novos usuários e livros, além disso, auxiliar em grande parte, o gerenciamento básico necessário. O desenvolvimento do projeto consiste em uma API web, que será implementada usando a linguagem Java junto ao framework Spring Boot, a mesma será auxiliada pelo SGBD MySQL que fará o armazenamento e gerenciamento dos dados

## Build

Você pode buildar usando qualquer IDE ou ferramenta de build da sua preferência. 
Assumindo [Maven](https://maven.apache.org/):

```sh
$ git clone https://github.com/williansilvaj/gerenciamento-biblioteca.git
$ cd gerenciamento-biblioteca/biblioteca
$ mvn package
# assume que o servidor MySQL está rodando
$ java -cp target/biblioteca-0.0.1-SNAPSHOT.jar org.springframework.boot.loader.JarLauncher
```

