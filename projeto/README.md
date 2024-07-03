# Projeto de Cadastro de Usuários

## Descrição

Este projeto é uma aplicação web para cadastro de usuários, desenvolvida utilizando Spring Boot, Java 17, Swagger e MySQL. O objetivo é fornecer uma API RESTful que permita operações CRUD (Create, Read, Update, Delete) em um banco de dados de usuários.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada.
- **Spring Boot**: Framework para criação de aplicações Java robustas e de fácil configuração.
- **Swagger**: Ferramenta para documentação e teste da API.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados dos usuários.

## Requisitos

- **Java 17** instalado.
- **Maven** para gerenciamento de dependências.
- **MySQL** instalado e em execução.

## Configuração do Ambiente

1. **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. **Configure o banco de dados MySQL:**
    - Crie um banco de dados chamado `usuario_db`.
    - Atualize o arquivo `application.properties` com as informações de conexão ao banco de dados:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/usuario_db
    spring.datasource.username=seu-usuario
    spring.datasource.password=sua-senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Compile e execute a aplicação:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Documentação da API

A documentação da API está disponível via Swagger. Após iniciar a aplicação, acesse o seguinte endereço no seu navegador:

[Swagger UI](http://localhost:8080/swagger-ui/index.html) -```http://localhost:8080/swagger-ui/index.html```

## Estrutura do Projeto

- **src/main/java**: Contém o código-fonte Java.
- **src/main/resources**: Contém arquivos de configuração.
- **pom.xml**: Arquivo de configuração do Maven.

## Endpoints Principais

- **GET /api/usuarios**: Lista todos os usuários.
- **GET /api/usuarios/{id}**: Retorna um usuário específico pelo ID.
- **POST /api/usuario**: Cria um novo usuário.
- **PUT /api/usuarios/{id}**: Atualiza um usuário existente.
- **DELETE /api/usuarios/{id}**: Deleta um usuário pelo ID.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests. Para maiores detalhes, consulte o arquivo `CONTRIBUTING.md`.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
