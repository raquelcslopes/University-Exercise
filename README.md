# UniExercise

Este projeto é uma aplicação Spring Boot para gerenciar uma universidade, incluindo entidades como Estudante, Professor, Curso e Disciplina.

## Funcionalidades
- Cadastro, listagem, atualização e remoção de estudantes e professores
- Gerenciamento de cursos e disciplinas
- Exceções customizadas para regras de negócio
- Segurança básica com autenticação HTTP
- Documentação automática via Swagger
- Persistência de dados com MySQL
- Logging detalhado

## Requisitos
- Java 17+
- Maven
- MySQL

## Configuração
1. Clone o repositório:
   ```bash
   git clone <url-do-repo>
   ```
2. Configure o banco de dados em `src/main/resources/application.properties`:
   - Usuário, senha e URL do MySQL
3. Execute as migrations automáticas (Spring JPA)

## Executando o Projeto
```bash
./mvnw spring-boot:run
```

Acesse a documentação Swagger em: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Estrutura do Projeto
- `controller/` - Controllers REST
- `entity/` - Entidades JPA
- `repository/` - Repositórios Spring Data
- `service/` - Lógica de negócio
- `exceptions/` - Exceções customizadas
- `model/` - DTOs
- `securityConfig/` - Configuração de segurança

## Autenticação
Usuário e senha padrão definidos em `application.properties`:
- Usuário: `admin`
- Senha: `admin123`

## Licença
Projeto para fins educacionais.
