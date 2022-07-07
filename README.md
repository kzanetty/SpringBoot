# SpringBoot

### Como iniciar um projeto com SpringBoot

#### obs: instrução superficial e iniciante.

1. Usar o Spring Initializr para gerar a estrutura de um projeto SpringBoot
    - Spring web
    - Lombok
    - driver do banco de dados utilizado
    - Spring Data JPA
2. Definir a conexão com o banco de dados em application.properties
    - Exemplo mysql:
     ```java
    # database configs
    spring.datasource.url=jdbc:mysql://localhost:3306/aulajpa
    spring.datasource.username=root
    spring.datasource.password=RootPassword
    spring.datasource.testWhileIdle=true
    spring.datasource.validationQuery=SELECT 1
    spring.jpa.show-sql=true
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```
    - Exemplo postgre:
     ```java
    # database configs
    spring.datasource.url= jdbc:postgresql://localhost:5432/parking-control-db
    spring.datasource.username=postgres
    spring.datasource.password=mysecretpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
    ```
3. Definir as entidades que irão compor o banco de dados.
    - Caso o banco de dados já está em ajudado e não seja permitido a inserção de novas colunas é uma boa pratica trocar o UPDATE para NONE
    ```java
    spring.jpa.hibernate.ddl-auto=none
    ```
4. CONTINUAR....
