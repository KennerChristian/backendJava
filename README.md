# **Sistema de Gestão de Funcionários - Backend**

Este projeto é uma aplicação backend para gerenciar registros de funcionários, desenvolvida com Spring Boot e integrada com um banco de dados PostgreSQL.  

**Funcionalidades**  
Operações CRUD para gerenciamento de dados dos funcionários  
Autenticação baseada em JWT   
Integração com PostgreSQL  

**Tecnologias Utilizadas**  
Java 11  
Spring Boot  
Spring Data JPA  
PostgreSQL  
JWT (opcional)  

**Pré-requisitos**
JDK 11 ou superior  
Maven  
MySQL  

**Instalação**
Passo a Passo  

Clone o repositório do gitgub ou baixar o .zip:  

git clone <https://github.com/KennerChristian/backendJava.git>  



**Configurar o banco de dados:**
Crie um banco de dados PostgreSQL.  
Atualize o arquivo application.properties com as configurações do seu banco de dados:  
properties  
Copiar código  
spring.datasource.url=jdbc:mysql://localhost:5432/seu_banco_de_dados  
spring.datasource.username=seu_usuario  
spring.datasource.password=sua_senha  
spring.jpa.hibernate.ddl-auto=update  


**Construir o projeto:**
bash
mvn clean install

**Executar a aplicação:**
bash
mvn spring-boot:run


**Deploy**
Render

**Configurar o Render:**
Faça login ou crie uma conta no Render.  
Crie um novo serviço web e conecte-o ao seu repositório GitHub.  
Configure as variáveis de ambiente necessárias, como as credenciais do banco de dados.  

Deploy:  
Siga as instruções no Render para implantar sua aplicação.  

**Uso**  
Após iniciar a aplicação, você pode acessar a API em http://localhost:8080.   
Utilize ferramentas como Postman para testar os endpoints CRUD.  

**Endpoints principais**
GET /api/funcionarios - Listar todos os funcionários  
POST /api/funcionarios - Criar um novo funcionário 
GET /api/funcionarios/{id} - Obter detalhes de um funcionário  
PUT /api/funcionarios/{id} - Atualizar dados de um funcionário  
DELETE /api/funcionarios/{id} - Remover um funcionário  