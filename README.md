# spring-cloud-config

Gerenciando Configurações com Spring Cloud Config

## Pré requisito
- Maven 3
- Java 8
- Docker 

## Preparando ambiente

Gerando artefatos

```
cd spring-cloud-config
mvn clean package
```

Construindo imagem Docker do Spring Cloud Config Server

```
cd server
mvn dockerfile:build
```

## Executando 

Iniciando Config Server pelo Docker

```
cd server
docker run -it -p 8888:8888 spring-cloud-config/server


s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8888 (http)
b.c.e.config.CloudConfigAppConfig        : Started CloudConfigAppConfig in 5.479 seconds (JVM running for 6.201)

```

Iniciando aplicação cliente do Config Server


```
cd app
mvn spring-boot:run


c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at: http://localhost:8888
c.c.c.ConfigServicePropertySourceLocator : Located environment: name=app, profiles=[default], label=null, version=3586952764950d4eb09bea10d45ed8165ff02416, state=null
b.c.PropertySourceBootstrapConfiguration : Located property source: CompositePropertySource [name='configService', propertySources=[MapPropertySource {name='configClient'}, MapPropertySource {name='https://github.com/emmanuelneri-blog/spring-cloud-config-configuration/app-default.properties'}, MapPropertySource {name='https://github.com/emmanuelneri-blog/spring-cloud-config-configuration/application-default.properties'}, MapPropertySource {name='https://github.com/emmanuelneri-blog/spring-cloud-config-configuration/app.properties'}, MapPropertySource {name='https://github.com/emmanuelneri-blog/spring-cloud-config-configuration/application.properties'}]]
s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090 (http)
br.com.emmanuelneri.app.AppConfig        : Started AppConfig in 7.493 seconds (JVM running for 11.064)
```

Obs: Para acessar as URLs do Config Server basta utilizar usuário e senha `config`.
