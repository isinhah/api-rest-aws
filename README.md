<h1 align="center">
  RESTFUL API: Books
</h1>

## Tecnologias

- Java
- Spring Boot
- MySQL
- Maven
- JUnit 5
- Mockito
- Flyway
- Dozer
- Testcontainers
- Springdoc

## Projeto

Este projeto é uma API de gerenciamento de livros que oferece operações CRUD básicas (Create, Read, Update e Delete) para gerenciar os registros de livros em um banco de dados. Além disso, a API possui funcionalidades avançadas para gerenciamento de usuários, como desativação de usuários e busca de usuários por nome.

Esse projeto foi elaborado durante o curso [REST API's RESTFul do 0 à AWS c. Spring Boot 3 Java e Docker](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=THANKSLEARNER24).

## Assuntos ensinados no curso
- Verbos HTTP
- Padrão de Projetos: Value Object
- Versionamento da API
- Custom JSON Serialization
- Content Negotiation
- HATEOAS
- CORS
- Testes unitários
- Query Params
- Busca Paginada

## Endpoints da API
| Método | Endpoint                              | Descrição                                       |
|--------|---------------------------------------|-------------------------------------------------|
| GET    | /api/person/v1                        | Retorna todas as Pessoas                         |
| PUT    | /api/person/v1                        | Atualiza uma Pessoa                              |
| POST   | /api/person/v1                        | Adiciona uma nova Pessoa                         |
| POST   | /api/person/v1/v2                     | Adiciona uma nova Pessoa com atributo de aniversário |
| GET    | /api/person/v1/{id}                   | Retorna uma Pessoa pelo ID                       |
| DELETE | /api/person/v1/{id}                   | Deleta uma Pessoa pelo ID                        |
| PATCH  | /api/person/v1/{id}                   | Desabilita uma Pessoa específica pelo ID         |
| GET    | /api/person/v1/findPersonByName/{firstName} | Retorna Pessoas pelo nome                       |

| Método | Endpoint                      | Descrição                   |
|--------|-------------------------------|-----------------------------|
| GET    | /api/book/v1                  | Retorna todos os Livros     |
| PUT    | /api/book/v1                  | Atualiza um Livro           |
| POST   | /api/book/v1                  | Adiciona um novo Livro      |
| GET    | /api/book/v1/{id}             | Retorna um Livro pelo ID    |
| DELETE | /api/book/v1/{id}             | Deleta um Livro pelo ID     |

## Autor

Isabel Henrique

https://www.linkedin.com/in/isabel-henrique/
