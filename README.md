# CRUD-JAVA-MAVEN-MYSQL
Um CRUDE simples com get/post/put/delete, utilizando spring boot e a base de dados MYSQL


/////////// POSTMAN

=GET - localhost8080/users

=POST - RAW - JSON localhost8080/save
{
    "nome": "alex",
    "idade": 31,
    "ocupacao": "desenvolvedor"
}

=PUT - RAW - JSON - localhost8080/update/1
{
    "nome": "alex",
    "idade": 31,
    "ocupacao": "desenvolvedor Java"
}

=DELETE - localhost8080/delete/1
