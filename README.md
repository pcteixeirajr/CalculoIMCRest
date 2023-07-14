﻿# CalculoIMCRest

Calculando o Índice de massa corporal (IMC) com rest.

## Para rodar o projeto

### Para fazer clone.

`https://github.com/pcteixeirajr/provas.git`

### Para rodar com o Tomcat.

`mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090`

`ou mvnw tomcat7:run`

No Linux, use `./mvnw` ao invés de apenas `mvnw`, como no Windows. Além disso, pelo menos uma vez, é preciso dar permissão de execução ao arquivo de script **mvnw** com o comando `chmod +x mvnw`.

## Para acessar a aplicação

`http://localhost:9090/CalculoIMCRest/api/calcularimc/calcular?altura=valordaAltura&peso=valordoPeso` no Postman

### Para "empacotar" a aplicação.

`mvnw package`

## Para "preparar" o projeto

### Para "embutir" o Maven no projeto.

Não precisa fazer isso! Já foi feito. 

`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`

